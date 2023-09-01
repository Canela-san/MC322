package Membro;

import java.util.ArrayList;
import java.util.Date;

import Multimidia.*;

public class Cliente extends Membro {

    private boolean bloqueado;

    private ArrayList<Object> emprestimos = new ArrayList<Object>();

    public Cliente(String nome, String nacionalidade, int idade, String cpf, boolean bloqueado,
            ArrayList<Emprestimo> emprestimos) {
        super(nome, nacionalidade, idade, cpf);
        this.bloqueado = bloqueado;
        this.emprestimos = emprestimos;
    }

    public Cliente(String nome, String nacionalidade, int idade, String cpf, boolean bloqueado) {
        super(nome, nacionalidade, idade, cpf);
        this.bloqueado = bloqueado;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public void addEmprestimo(Object obj, Date dataEmprestimo, Date datadev, int devolucoes, boolean devolvido) {
        Object e1 = new Emprestimo(obj, dataEmprestimo, datadev, devolucoes, devolvido);
        emprestimos.add(e1);
    }

    public void RemoveEmprestimo(Object obj) {
        emprestimos.remove(obj);
    }

}
