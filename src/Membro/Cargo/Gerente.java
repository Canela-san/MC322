package Membro.Cargo;

public class Gerente extends Cargo implements IGerente {
    Gerente(double salario, String historico) {
        super(salario, historico);
    }
}
