package Membro;

import java.util.Date;

public class Professor extends Membro {
    private int limiteEmprestimos = 7;
    private int prazoEmprestimo = 30;
    private double multa = 0.5;

    public Professor(String nome, int numRA, String endereco, String contato, Date dataResgistro) {
        super(nome, numRA, endereco, contato, dataResgistro);
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

}
