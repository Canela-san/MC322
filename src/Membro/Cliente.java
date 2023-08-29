package Membro;

import java.util.ArrayList;
import java.util.Date;

import Multimidia.*;

public class Cliente extends Membro {

    private boolean bloqueado;
    private ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

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

    public void addEmprestimo(Multimidia obj, Date dataEmprestimo, Date datadev, int devolucoes, boolean devolvido) {
        Emprestimo e1 = new Emprestimo(obj, dataEmprestimo, datadev, devolucoes, devolvido);
        emprestimos.add(e1);
    }

    public void RemoveEmprestimo(Emprestimo obj) {
        emprestimos.remove(obj);
    }
    
}
