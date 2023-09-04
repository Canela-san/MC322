package Multimidia;

import Util.Imagem;

public abstract class Multimidia {
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private String genero;
    private String sinopse;
    private Imagem capa;

    public Multimidia(String titulo, String autor, String editora, int anoPublicacao, String genero, String sinopse,
            Imagem capa) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.sinopse = sinopse;
        this.capa = capa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Imagem getCapa() {
        return capa;
    }

    public void setCapa(Imagem capa) {
        this.capa = capa;
    }

}
