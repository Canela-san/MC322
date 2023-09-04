package Membro;

import java.util.Date;

public class Graduacao extends Membro {
    private int limiteEmprestimos = 3;
    private int prazoEmprestimo = 15;
    private double multa = 1;

    public Graduacao(String nome, int numRA, String endereco, String contato, Date dataResgistro) {
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
