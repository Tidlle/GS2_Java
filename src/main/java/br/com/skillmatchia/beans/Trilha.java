package br.com.skillmatchia.beans;

import java.util.List;

public class Trilha {

    private String id;
    private String titulo;
    private String area;         // "dados", "ia", "dev", "cloud", "ux"
    private String nivel;        // "iniciante", "intermediario", "avancado"
    private String descricao;
    private int duracaoHoras;
    private String focoPrincipal;
    private List<String> objetivos;
    private List<String> competencias;
    private List<String> odsRelacionados;

    public Trilha() {
        super();
    }

    public Trilha(String id, String titulo, String area, String nivel,
                  String descricao, int duracaoHoras, String focoPrincipal,
                  List<String> objetivos, List<String> competencias,
                  List<String> odsRelacionados) {
        this.id = id;
        this.titulo = titulo;
        this.area = area;
        this.nivel = nivel;
        this.descricao = descricao;
        this.duracaoHoras = duracaoHoras;
        this.focoPrincipal = focoPrincipal;
        this.objetivos = objetivos;
        this.competencias = competencias;
        this.odsRelacionados = odsRelacionados;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    public String getFocoPrincipal() {
        return focoPrincipal;
    }

    public void setFocoPrincipal(String focoPrincipal) {
        this.focoPrincipal = focoPrincipal;
    }

    public List<String> getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(List<String> objetivos) {
        this.objetivos = objetivos;
    }

    public List<String> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<String> competencias) {
        this.competencias = competencias;
    }

    public List<String> getOdsRelacionados() {
        return odsRelacionados;
    }

    public void setOdsRelacionados(List<String> odsRelacionados) {
        this.odsRelacionados = odsRelacionados;
    }

    @Override
    public String toString() {
        return "Trilha{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", area='" + area + '\'' +
                ", nivel='" + nivel + '\'' +
                ", descricao='" + descricao + '\'' +
                ", duracaoHoras=" + duracaoHoras +
                ", focoPrincipal='" + focoPrincipal + '\'' +
                ", objetivos=" + objetivos +
                ", competencias=" + competencias +
                ", odsRelacionados=" + odsRelacionados +
                '}';
    }
}
