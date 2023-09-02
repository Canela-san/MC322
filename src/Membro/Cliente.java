package Membro;

import java.util.ArrayList;
import java.util.Date;
import Util.Emprestimo;

public class Cliente extends Membro {

    private boolean bloqueado;
    


    public void addEmprestimo(Object obj, Date dataEmprestimo, Date datadev, int devolucoes, boolean devolvido) {
        Object e1 = new Emprestimo(obj, dataEmprestimo, datadev, devolucoes, devolvido);
        emprestimos.add(e1);
    }

    public void RemoveEmprestimo(Object obj) {
        emprestimos.remove(obj);
    }

}
