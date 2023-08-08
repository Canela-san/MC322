public class Pessoa {
    private String nome;
    private String nacionalidade;
    private int idade;
    private int cadastro;
    private String cpf; // é string por causa que pode iniciar em 0

    public Pessoa(String nome, String nacionalidade, int idade, int cadastro, String cpf) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.cadastro = cadastro;
        this.cpf = cpf;
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

    public int getCadastro() {
        return cadastro;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}
