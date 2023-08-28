package Multimidia;

public class LivroFisico extends Multimidia {

    private String edicao;
    private String isbn;
    public LivroFisico(int id, String titulo, String autor, String categoria, String descricao, int quantidade,
            String edicao, String isbn) {
        super(id, titulo, autor, categoria, descricao, quantidade);
        this.edicao = edicao;
        this.isbn = isbn;
    }
    public String getEdicao() {
        return edicao;
    }
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
