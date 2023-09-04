package Multimidia.LivroEletronico;

import java.util.Date;

public final class Edicao {
    private String url;
    private int numeroEdicao;
    private int quantidade;
    private int quantidadeDisponivel;
    private String[] formatos;
    private String[] softwares;
    private Date dataDisponivel;

    public Edicao(String url, int numeroEdicao, int quantidade, int quantidadeDisponivel, String[] formatos,
            String[] softwares, Date dataDisponivel) {
        this.url = url;
        this.numeroEdicao = numeroEdicao;
        this.quantidade = quantidade;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.formatos = formatos;
        this.softwares = softwares;
        this.dataDisponivel = dataDisponivel;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String[] getFormatos() {
        return formatos;
    }

    public void setFormatos(String[] formatos) {
        this.formatos = formatos;
    }

    public String[] getSoftwares() {
        return softwares;
    }

    public void setSoftwares(String[] softwares) {
        this.softwares = softwares;
    }

    public Date getDataDisponivel() {
        return dataDisponivel;
    }

    public void setDataDisponivel(Date dataDisponivel) {
        this.dataDisponivel = dataDisponivel;
    }

}
