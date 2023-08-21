import java.sql.Date;

public class MC322 {
    public static void main(String[] args) {
        Date datadev = new Date(12/12/2023);
        Livro livro1 = new Livro(1, "Harry Potter", "Gabriel Canela", "10", "Romance", "muito bom", "naosei", 8);
        Cliente cliente1 = new Cliente(null, null, 0, 0, null, 0, 0, 0, false);
        Funcionario funcionario = new Funcionario("Gabriel", null, 0, 0, null, 0, 0, null);
        cliente1.setNome("Gabriel");
        cliente1.addEmprestimo(livro1, datadev); // as outras informações do emprestimo é calculada pelo sistema
        funcionario.setIdade(33);

    }
}