package br.com.jhegnerlabs.lambda.parte9;

public class Livro {

    private String name;
    private Autor autor;
    private String genero;
    private Double avaliacao;

    public Livro(String name, Autor autor, String genero, Double avaliacao) {
        this.name = name;
        this.autor = autor;
        this.genero = genero;
        this.avaliacao = avaliacao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "name='" + name + '\'' +
                ", autor=" + autor +
                ", genero='" + genero + '\'' +
                ", avaliacao=" + avaliacao +
                '}';
    }
}
