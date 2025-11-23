package br.com.skillmatchia;

import br.com.skillmatchia.beans.Trilha;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.Arrays;
import java.util.List;

@Path("/trilhas")
@Produces(MediaType.APPLICATION_JSON)
public class TrilhaResource {

    private static final List<Trilha> TRILHAS = Arrays.asList(
            new Trilha(
                    "dados-fundamentos",
                    "Fundamentos de Análise de Dados",
                    "dados",
                    "iniciante",
                    "Introdução à análise de dados, estatística básica e ferramentas de BI.",
                    40,
                    "Criar base sólida para atuar com dados.",
                    Arrays.asList(
                            "Entender o papel de dados nas decisões.",
                            "Aprender conceitos básicos de estatística.",
                            "Explorar ferramentas iniciais de BI."
                    ),
                    Arrays.asList(
                            "Lógica de raciocínio analítico.",
                            "Manipulação básica de conjuntos de dados.",
                            "Criação de visualizações simples."
                    ),
                    Arrays.asList(
                            "ODS 4 – Educação de Qualidade",
                            "ODS 8 – Trabalho Decente"
                    )
            )
    );

    @GET
    public Response listar() {
        return Response.ok(TRILHAS).build();
    }

    @GET
    @Path("/{id}")
    public Response buscarPorId(@PathParam("id") String id) {
        for (Trilha t : TRILHAS) {
            if (t.getId().equals(id)) {
                return Response.ok(t).build();
            }
        }
        return Response.status(Response.Status.NOT_FOUND)
                .entity("Trilha não encontrada para o id: " + id)
                .build();
    }
}
