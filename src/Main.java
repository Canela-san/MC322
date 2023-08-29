package main;

import java.sql.Date;

import Membro.*;
import Multimidia.*;

public class Main {
    // apenas testando as classes e métodos
    public static void main(String[] args) {

        Date datadev = new Date(12 / 12 / 2023);
        Date emprestiDate = new Date(13 / 12 / 2023);

        LivroFisico livro1 = new LivroFisico(1, "Harry Potter", "Gabriel Canela", "10", "Romance", 0, "muito bom",
                "naosei");
        Cliente cliente1 = new Cliente("Gabriel", "Brasileiro", 30, "12345678", false);
        Funcionario funcionario = new Funcionario("José", "Brasileiro", 26, "12345689", 0, "Atentende");
        cliente1.setNome("Ricardo");
        cliente1.addEmprestimo(livro1, emprestiDate, datadev, 0, false); // as outras informações do emprestimo é calculada
                                                                    // pelo sistema
        // cada cliente pede ter inumeros emprestimos, podem ser qualquer tipo de multimidia.
        funcionario.setIdade(33);
        CD cd1 = new CD(10, "RodrigoFaro", "robertao", "terror", "Tem que ESCUTAR", 23, 124321, 32);
        cliente1.addEmprestimo(cd1, emprestiDate, datadev, 3, false);

        System.out.println("O cliente " + cliente1.getNome() + " tem CPF: " + cliente1.getCpf() + ".");
        Emprestimo emprestimo1 = cliente1.getEmprestimos().get(0);
        System.out.println("O cliente pegou emprestado o livro: " + emprestimo1.getObj().getTitulo());
    }
}