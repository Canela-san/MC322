package Multimidia;
public class DVD extends Multimidia{
    private long Tamanho;
    private int duracaoHoras;
    public DVD(int id, String titulo, String autor, String categoria, String descricao, int quantidade, long tamanho,
            int duracaoHoras) {
        super(id, titulo, autor, categoria, descricao, quantidade);
        Tamanho = tamanho;
        this.duracaoHoras = duracaoHoras;
    }
    public long getTamanho() {
        return Tamanho;
    }
    public void setTamanho(long tamanho) {
        Tamanho = tamanho;
    }
    public int getDuracaoHoras() {
        return duracaoHoras;
    }
    public void setDuracaoHoras(int duracaoHoras) {
        this.duracaoHoras = duracaoHoras;
    }
    
}