import java.util.ArrayList;
import java.util.Date;

public class Cliente extends Pessoa {
    int cadastro;
    int idade_inscricao;
    int numero_emprestimos_atuais;
    boolean ativo = true;
    ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();

    public Cliente(String nome, String nacionalidade, int idade, int cadastro, String cpf, int cadastro2,
            int idade_inscricao, int numero_emprestimos_atuais, boolean ativo) {
        super(nome, nacionalidade, idade, cadastro, cpf);
        cadastro = cadastro2;
        this.idade_inscricao = idade_inscricao;
        this.numero_emprestimos_atuais = numero_emprestimos_atuais;
        this.ativo = ativo;
    }

    public void addEmprestimo(Livro livro, Date datadev) {
        Emprestimo e1 = new Emprestimo(livro, datadev);
        emprestimos.add(e1);
    }

    public int getCadastro() {
        return cadastro;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public int getIdade_inscricao() {
        return idade_inscricao;
    }

    public void setIdade_inscricao(int idade_inscricao) {
        this.idade_inscricao = idade_inscricao;
    }

    public int getNumero_emprestimos_atuais() {
        return numero_emprestimos_atuais;
    }

    public void setNumero_emprestimos_atuais(int numero_emprestimos_atuais) {
        this.numero_emprestimos_atuais = numero_emprestimos_atuais;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public ArrayList<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(ArrayList<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

}
