package br.com.skillmatchia;

import br.com.skillmatchia.beans.Compatibilidade;
import br.com.skillmatchia.beans.ResultadoPerfil;
import br.com.skillmatchia.beans.SimuladorRequest;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Path("/simulador")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SimuladorResource {

    @POST
    @Path("/diagnostico")
    public Response gerarDiagnostico(SimuladorRequest request) {

        if (request == null) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity("Corpo da requisição está vazio ou JSON inválido para SimuladorRequest.")
                    .build();
        }

        List<Compatibilidade> compatibilidades = new ArrayList<>();
        compatibilidades.add(new Compatibilidade("Dados", 40));
        compatibilidades.add(new Compatibilidade("Inteligência Artificial", 40));
        compatibilidades.add(new Compatibilidade("Desenvolvimento Web", 40));
        compatibilidades.add(new Compatibilidade("Cloud & DevOps", 40));
        compatibilidades.add(new Compatibilidade("UX & Produto", 40));

        String interesse = request.getAreaInteresse() != null
                ? request.getAreaInteresse().toLowerCase()
                : "";

        for (Compatibilidade c : compatibilidades) {
            String areaLower = c.getArea().toLowerCase();
            if (!interesse.isEmpty() && areaLower.contains(interesse)) {
                c.setValor(c.getValor() + 20);
            }
        }

        String exp = request.getExperiencia();
        if ("iniciante".equalsIgnoreCase(exp)) {
            for (Compatibilidade c : compatibilidades) {
                c.setValor(c.getValor() - 5);
            }
        } else if ("avancado".equalsIgnoreCase(exp)) {
            for (Compatibilidade c : compatibilidades) {
                c.setValor(c.getValor() + 5);
            }
        }

        for (Compatibilidade c : compatibilidades) {
            if (c.getValor() < 0) {
                c.setValor(0);
            }
            if (c.getValor() > 100) {
                c.setValor(100);
            }
        }

        Collections.sort(compatibilidades, new Comparator<Compatibilidade>() {
            @Override
            public int compare(Compatibilidade o1, Compatibilidade o2) {
                return Integer.compare(o2.getValor(), o1.getValor());
            }
        });

        String proximoPasso = "Comece explorando as trilhas recomendadas no seu dashboard.";
        if (!compatibilidades.isEmpty()) {
            Compatibilidade melhor = compatibilidades.get(0);
            String area = melhor.getArea();

            if ("Dados".equalsIgnoreCase(area)) {
                proximoPasso = "Comece pela trilha de Fundamentos de Análise de Dados.";
            } else if ("Inteligência Artificial".equalsIgnoreCase(area)) {
                proximoPasso = "Inicie pela trilha de Fundamentos de Machine Learning.";
            } else if ("Desenvolvimento Web".equalsIgnoreCase(area)) {
                proximoPasso = "Comece pela trilha de Desenvolvimento Web Full-Stack Essencial.";
            } else if ("Cloud & DevOps".equalsIgnoreCase(area)) {
                proximoPasso = "Comece pela trilha de Fundamentos de Cloud & DevOps.";
            } else if ("UX & Produto".equalsIgnoreCase(area)) {
                proximoPasso = "Comece pela trilha de UX & Produto – Experiência do Usuário.";
            }
        }

        ResultadoPerfil resultado = new ResultadoPerfil(compatibilidades, proximoPasso);
        return Response.ok(resultado).build();
    }
}
