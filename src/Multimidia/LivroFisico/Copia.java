package Multimidia.LivroFisico;

// crie uma classe chamada abc?
public final class Copia {
    private int id;
    private String localizacao;
    private String estadoConservacao;
    private boolean disponivel;

    public Copia(int id, String localizacao, String estadoConservacao, boolean disponivel) {
        this.id = id;
        this.localizacao = localizacao;
        this.estadoConservacao = estadoConservacao;
        this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getEstadoConservacao() {
        return estadoConservacao;
    }

    public void setEstadoConservacao(String estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
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
