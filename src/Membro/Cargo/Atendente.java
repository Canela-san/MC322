package Membro.Cargo;

public class Atendente extends Cargo implements IAtendente {
    Atendente(double salario, String historico) {
        super(salario, historico);
    }
}
