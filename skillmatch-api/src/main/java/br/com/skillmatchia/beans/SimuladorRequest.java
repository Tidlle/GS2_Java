package br.com.skillmatchia.beans;

public class SimuladorRequest {

    private String nome;
    private String email;
    private String areaInteresse;
    private String experiencia;   // "iniciante", "intermediario", "avancado"
    private String objetivo;
    private String horasEstudo;   // "ate-4", "4-8", "8-12", "12+"

    public SimuladorRequest() {
        super();
    }

    public SimuladorRequest(String nome, String email, String areaInteresse,
                            String experiencia, String objetivo, String horasEstudo) {
        this.nome = nome;
        this.email = email;
        this.areaInteresse = areaInteresse;
        this.experiencia = experiencia;
        this.objetivo = objetivo;
        this.horasEstudo = horasEstudo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAreaInteresse() {
        return areaInteresse;
    }

    public void setAreaInteresse(String areaInteresse) {
        this.areaInteresse = areaInteresse;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getHorasEstudo() {
        return horasEstudo;
    }

    public void setHorasEstudo(String horasEstudo) {
        this.horasEstudo = horasEstudo;
    }

    @Override
    public String toString() {
        return "SimuladorRequest{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", areaInteresse='" + areaInteresse + '\'' +
                ", experiencia='" + experiencia + '\'' +
                ", objetivo='" + objetivo + '\'' +
                ", horasEstudo='" + horasEstudo + '\'' +
                '}';
    }
}

