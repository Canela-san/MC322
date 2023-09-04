package Multimidia.CD;

// crie uma classe chamada abc?
public final class Copia {
    private int id;
    private String localização;
    private String estadoConservacao;
    private boolean disponivel;

    public Copia(int id, String localização, String estadoConservacao, boolean disponivel) {
        this.id = id;
        this.localização = localização;
        this.estadoConservacao = estadoConservacao;
        this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalização() {
        return localização;
    }

    public void setLocalização(String localização) {
        this.localização = localização;
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

}
