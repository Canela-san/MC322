package Multimidia;

import java.util.Date;

public class Emprestimo {
    Multimidia obj;
    Date dataEmprestimo = new Date();
    Date dataDevolucao = new Date();
    int Renovacoes;
    boolean devolvido;

    public Emprestimo(Multimidia obj, Date dataEmprestimo, Date dataDevolucao, int renovacoes, boolean devolvido) {
        this.obj = obj;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.Renovacoes = renovacoes;
        this.devolvido = devolvido;
    }


    public Multimidia getObj() {
        return obj;
    }

    public void setObj(Multimidia obj) {
        this.obj = obj;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public int getRenovacoes() {
        return Renovacoes;
    }

    public void setRenovacoes(int renovacoes) {
        Renovacoes = renovacoes;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

}
