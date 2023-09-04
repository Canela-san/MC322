package Multimidia.CD;

import Multimidia.Multimidia;
import Util.Imagem;

public class CD extends Multimidia {
    private String[] faixas;
    private int duracaoHoras;
    private int quantCopia;
    private int quantDisponivel;
    private Copia[] copias;

    public CD(String titulo, String autor, String editora, int anoPublicacao, String genero, String sinopse,
            Imagem capa, String[] faixas, int duracaoHoras, int quantCopia, int quantDisponivel) {
        super(titulo, autor, editora, anoPublicacao, genero, sinopse, capa);
        this.faixas = faixas;
        this.duracaoHoras = duracaoHoras;
        this.quantCopia = quantCopia;
        this.quantDisponivel = quantDisponivel;
    }

    public String[] getFaixas() {
        return faixas;
    }

    public void setFaixas(String[] faixas) {
        this.faixas = faixas;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }

    public int getQuantCopia() {
        return quantCopia;
    }

    public void setQuantCopia(int quantCopia) {
        this.quantCopia = quantCopia;
    }

    public int getQuantDisponivel() {
        return quantDisponivel;
    }

    public void setQuantDisponivel(int quantDisponivel) {
        this.quantDisponivel = quantDisponivel;
    }

    public Copia[] getCopias() {
        return copias;
    }

    public void setCopias(Copia[] copias) {
        this.copias = copias;
    }

    // – CD de Áudio:
    // – Lista de Faixas
    // – Duração Total
    // – Número total de cópias
    // – Número de cópias disponíveis
    // – Estado de conservação

}
