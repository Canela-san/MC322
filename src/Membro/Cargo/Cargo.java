package Membro.Cargo;

public class Cargo {
    private double salario;
    private String historico;

    public Cargo(double salario, String historico) {
        this.salario = salario;
        this.historico = historico;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

}
