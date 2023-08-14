import java.util.Date;

public class Emprestimo {
    Livro livro;
    Date dataEmprestimo = new Date();
    Date dataDevolucao = new Date();
    int Renovacoes;
    String status;

    public Emprestimo(Livro livro) {
        this.livro = livro;
        // pegar outras variaveis pela data do sistema
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
