package Membro;

public class Funcionario extends Membro {
    private float salario;
    private String cargo;

    public Funcionario(String nome, String nacionalidade, int idade, String cpf, float salario,
            String cargo) {
        super(nome, nacionalidade, idade, cpf);
        this.salario = salario;
        this.cargo = cargo;
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
