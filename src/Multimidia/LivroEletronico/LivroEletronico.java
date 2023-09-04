package Multimidia.LivroEletronico;

import Multimidia.Multimidia;
import Util.Imagem;

public class LivroEletronico extends Multimidia {
    private int quantLicencas;
    private int quantDisponivel;
    private Edicao[] edicoes;

    public LivroEletronico(String titulo, String autor, String editora, int anoPublicacao, String genero,
            String sinopse, Imagem capa, int quantLicencas, int quantDisponivel, Edicao[] edicoes) {
        super(titulo, autor, editora, anoPublicacao, genero, sinopse, capa);
        this.quantLicencas = quantLicencas;
        this.quantDisponivel = quantDisponivel;
        this.edicoes = edicoes;
    }

    public int getQuantLicencas() {
        return quantLicencas;
    }

    public void setQuantLicencas(int quantLicencas) {
        this.quantLicencas = quantLicencas;
    }

    public int getQuantDisponivel() {
        return quantDisponivel;
    }

    public void setQuantDisponivel(int quantDisponivel) {
        this.quantDisponivel = quantDisponivel;
    }

    public Edicao[] getEdicoes() {
        return edicoes;
    }

    public void setEdicoes(Edicao[] edicoes) {
        this.edicoes = edicoes;
    }

    // – Formato (PDF, ePub, etc.)
    // – Número total de licenças (para determinar o número de cópias simultâneas
    // permitidas)
    // – Formato de arquivo
    // – URL de acesso ou local de armazenamento
    // – Requisitos de leitura (software, dispositivo compatível)
    // – Data de disponibilidade
}
