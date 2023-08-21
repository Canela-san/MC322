public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private String edicao;
    private String categoria;
    private String descricao;
    private String isbn;
    private int quantidade;

    public Livro(int id, String titulo, String autor, String edicao, String categoria, String descricao, String isbn,
            int quantidade) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.edicao = edicao;
        this.categoria = categoria;
        this.descricao = descricao;
        this.isbn = isbn;
        this.quantidade = quantidade;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String Titulo) {
        this.titulo = Titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEdicao() {
        return this.edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getISBN() {
        return this.isbn;
    }

    public void setISBN(String ISBN) {
        this.isbn = ISBN;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
