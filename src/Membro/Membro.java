package Membro;

import java.util.ArrayList;
import java.util.Date;

import Util.Inscricao;
abstract class Membro {
    private String nome;
    private Inscricao numRA;
    private String endereco;
    private String contato;
    private Date dataResgistro;
    private ArrayList<Object> emprestimos = new ArrayList<Object>();
    // – Nome
    // – Número de Identificação da Universidade
    // – Endereço
    // – Contato
    // – Data de Registro

}
