package Membro;
import java.util.Date;
import java.lang.Math;

public class Inscricao {
    private int id;
    private Date dataInscricao;
    private String email;
    private String senha;
    private boolean ativa;

    public Inscricao(Date dataInscricao, String email, String senha, boolean ativa) {
        this.id = GetrandomID();
        this.dataInscricao = dataInscricao;
        this.email = email;
        this.senha = senha;
        this.ativa = ativa;
    }

    public int getId() {
        return id;
    }
    public int GetrandomID(){
        return (int) ((Math.random() * (99999 - 0)));
    }
    public void setId(int id) {
        this.id = id;
    }

    public Date getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(Date dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

}
