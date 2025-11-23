package br.com.skillmatchia.beans;

import java.util.List;

public class ResultadoPerfil {

    private List<Compatibilidade> compatibilidades;
    private String proximoPasso;

    public ResultadoPerfil() {
        super();
    }

    public ResultadoPerfil(List<Compatibilidade> compatibilidades, String proximoPasso) {
        this.compatibilidades = compatibilidades;
        this.proximoPasso = proximoPasso;
    }

    public List<Compatibilidade> getCompatibilidades() {
        return compatibilidades;
    }

    public void setCompatibilidades(List<Compatibilidade> compatibilidades) {
        this.compatibilidades = compatibilidades;
    }

    public String getProximoPasso() {
        return proximoPasso;
    }

    public void setProximoPasso(String proximoPasso) {
        this.proximoPasso = proximoPasso;
    }

    @Override
    public String toString() {
        return "ResultadoPerfil{" +
                "compatibilidades=" + compatibilidades +
                ", proximoPasso='" + proximoPasso + '\'' +
                '}';
    }
}
