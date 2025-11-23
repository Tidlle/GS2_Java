package br.com.skillmatchia.beans;

public class Compatibilidade {

    private String area;
    private int valor;

    public Compatibilidade() {
        super();
    }

    public Compatibilidade(String area, int valor) {
        this.area = area;
        this.valor = valor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Compatibilidade{" +
                "area='" + area + '\'' +
                ", valor=" + valor +
                '}';
    }
}
