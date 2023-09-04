package Multimidia.LivroFisico;

import Multimidia.Multimidia;
import Util.Imagem;

public class LivroFisico extends Multimidia {

    private String isbn;
    private Edicao[] edicoes;

    public LivroFisico(String titulo, String autor, String editora, int anoPublicacao, String genero, String sinopse,
            Imagem capa, String isbn, Edicao[] edicoes) {
        super(titulo, autor, editora, anoPublicacao, genero, sinopse, capa);
        this.isbn = isbn;
        this.edicoes = edicoes;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Edicao[] getEdicoes() {
        return edicoes;
    }

    public void setEdicoes(Edicao[] edicoes) {
        this.edicoes = edicoes;
    }

    // copias totais e disponíveis está serpado por ediçao na classe edicao.
    // Localização específica está na classe cópia.

    // – Livro Físico:
    // – ISBN
    // – Edição
    // – Número total de cópias por edição
    // – Número de cópias disponíveis por edição
    // – Localização específica na biblioteca (estante e prateleira)
    // – Estado de conservação

}
