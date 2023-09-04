package Membro;

import java.util.Date;

import Membro.Cargo.Cargo;

public class Funcionario extends Membro {
    private int limiteEmprestimos = 4;
    private int prazoEmprestimo = 20;
    private double multa = 0.75;
    private Cargo cargo;

    public Funcionario(String nome, int numRA, String endereco, String contato, Date dataResgistro,
            int limiteEmprestimos, int prazoEmprestimo, double multa, Cargo cargo) {
        super(nome, numRA, endereco, contato, dataResgistro);
        this.limiteEmprestimos = limiteEmprestimos;
        this.prazoEmprestimo = prazoEmprestimo;
        this.multa = multa;
        this.cargo = cargo;
    }

    public Funcionario(int limiteEmprestimos, int prazoEmprestimo, double multa, Cargo cargo) {
        this.limiteEmprestimos = limiteEmprestimos;
        this.prazoEmprestimo = prazoEmprestimo;
        this.multa = multa;
        this.cargo = cargo;
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

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

}
