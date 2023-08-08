public class Funcionario extends Pessoa{
    
    int cadastro;
    float salario;
    String cargo;
    public Funcionario(String nome, String nacionalidade, int idade, int cadastro, String cpf, int cadastro2,
            float salario, String cargo) {
        super(nome, nacionalidade, idade, cadastro, cpf);
        cadastro = cadastro2;
        this.salario = salario;
        this.cargo = cargo;
    }
    public int getCadastro() {
        return cadastro;
    }
    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
