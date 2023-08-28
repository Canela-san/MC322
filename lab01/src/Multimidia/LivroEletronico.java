package Multimidia;

public class LivroEletronico extends Multimidia{
    private long Tamanho;

    public LivroEletronico(int id, String titulo, String autor, String categoria, String descricao, int quantidade,
            long tamanho) {
        super(id, titulo, autor, categoria, descricao, quantidade);
        Tamanho = tamanho;
    }

    public long getTamanho() {
        return Tamanho;
    }

    public void setTamanho(long tamanho) {
        Tamanho = tamanho;
    }


    
}
