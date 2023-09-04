package Multimidia.LivroFisico;

public class Edicao {

    private int numeroEdicao;
    private int quantidade;
    private int quantidadeDisponivel;
    private Copia[] copias;

    public Edicao(int numeroEdicao, int quantidade, int quantidadeDisponivel, Copia[] copias) {
        this.numeroEdicao = numeroEdicao;
        this.quantidade = quantidade;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.copias = copias;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public Copia[] getCopias() {
        return copias;
    }

    public void setCopias(Copia[] copias) {
        this.copias = copias;
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
