package Membro;

import java.util.ArrayList;
import java.util.Date;

abstract class Membro implements IMembro {
    private String nome;
    private int numRA;
    private String endereco;
    private String contato;
    private Date dataResgistro;
    private ArrayList<Object> emprestimos = new ArrayList<Object>();
    private int limiteEmprestimos;
    private int prazoEmprestimo;
    private double multa;

    public Membro(String nome, int numRA, String endereco, String contato, Date dataResgistro) {
        this.nome = nome;
        this.numRA = numRA;
        this.endereco = endereco;
        this.contato = contato;
        this.dataResgistro = dataResgistro;
    }

    public Membro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumRA() {
        return numRA;
    }

    public void setNumRA(int numRA) {
        this.numRA = numRA;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Date getDataResgistro() {
        return dataResgistro;
    }

    public void setDataResgistro(Date dataResgistro) {
        this.dataResgistro = dataResgistro;
    }

    public ArrayList<Object> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Object> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public int getLimiteEmprestimos() {
        return limiteEmprestimos;
    }

    public void setLimiteEmprestimos(int limiteEmprestimos) {
        this.limiteEmprestimos = limiteEmprestimos;
    }

    public int getPrazoEmprestimo() {
        return prazoEmprestimo;
    }

    public void setPrazoEmprestimo(int prazoEmprestimo) {
        this.prazoEmprestimo = prazoEmprestimo;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    // – Nome
    // – Número de Identificação da Universidade
    // – Endereço
    // – Contato
    // – Data de Registro
    // – Limite de Empréstimo
    // – Prazo de Empréstimo
    // – Multa por Atraso

}
