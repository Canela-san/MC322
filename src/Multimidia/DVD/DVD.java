package Multimidia.DVD;

import Multimidia.Multimidia;
import Util.Imagem;

public class DVD extends Multimidia {

    private String elenco;
    private int duracaoHoras;
    private int quantCopia;
    private int quantDisponivel;
    private String[] legendas;
    private String[] audios;
    private Copia[] copias;

    public DVD(String titulo, String autor, String editora, int anoPublicacao, String genero, String sinopse,
            Imagem capa, String elenco, int duracaoHoras, int quantCopia, int quantDisponivel, String[] legendas,
            String[] audios, Copia[] copias) {
        super(titulo, autor, editora, anoPublicacao, genero, sinopse, capa);
        this.elenco = elenco;
        this.duracaoHoras = duracaoHoras;
        this.quantCopia = quantCopia;
        this.quantDisponivel = quantDisponivel;
        this.legendas = legendas;
        this.audios = audios;
        this.copias = copias;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
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

    public String[] getLegendas() {
        return legendas;
    }

    public void setLegendas(String[] legendas) {
        this.legendas = legendas;
    }

    public String[] getAudios() {
        return audios;
    }

    public void setAudios(String[] audios) {
        this.audios = audios;
    }

    public Copia[] getCopias() {
        return copias;
    }

    public void setCopias(Copia[] copias) {
        this.copias = copias;
    }

    // – DVD de Vídeo:
    // – Elenco
    // – Duração
    // – Número total de cópias
    // – Número de cópias disponíveis
    // – Legendas e Áudio Disponíveis
    // – Estado de conservação

}