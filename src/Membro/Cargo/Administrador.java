package Membro.Cargo;

public class Administrador extends Cargo implements IAdministrador {
    Administrador(double salario, String historico) {
        super(salario, historico);
    }
}
