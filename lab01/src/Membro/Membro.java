package Membro;

import java.util.Date;
public class Membro {
    private Inscricao inscricao;
    private String nome;
    private String nacionalidade;
    private int idade;
    private String cpf; // é string por causa que pode iniciar em 0

    public Membro(String nome, String nacionalidade, int idade, String cpf) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void CriarInscricao(Date dataInscricao, String email, String senha, boolean ativa) {
        Inscricao temp = new Inscricao(dataInscricao, email, senha, ativa);
        this.inscricao = temp;
    }

    public Inscricao getInscricao() {
        return inscricao;
    }

    public void setInscricao(Inscricao inscricao) {
        this.inscricao = inscricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
