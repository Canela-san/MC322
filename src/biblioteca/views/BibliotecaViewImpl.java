package biblioteca.views;

import java.util.List;
import java.util.Map;

import biblioteca.controllers.BibliotecaController;
import biblioteca.models.ItemMultimidia;
import biblioteca.models.Membro;
public class BibliotecaViewImpl implements BibliotecaView {
    List<ItemMultimidia> itens;
    Map<String, ItemMultimidia> itensMap;


    private BibliotecaController bibliotecaController;

    public BibliotecaViewImpl(BibliotecaController controller) {
        bibliotecaController = controller;
    }

    @Override
    public void mostrarItensDisponiveis(List<ItemMultimidia> itens) {
        // Implementação da exibição de itens disponíveis
    }

    @Override
    public void mostrarEmprestimoStatus(boolean sucesso) {
        if (sucesso) {
            System.out.println("Empréstimo realizado com sucesso.");
        } else {
            System.out.println("Falha ao realizar o empréstimo.");
        }
    }

    @Override
    public void mostrarDevolucaoStatus(boolean sucesso) {
        if (sucesso) {
            System.out.println("Devolução realizada com sucesso.");
        } else {
            System.out.println("Falha ao realizar a devolução.");
        }
    }

    public BibliotecaController getBibliotecaController() {
        return bibliotecaController;
    }

    public void setBibliotecaController(BibliotecaController bibliotecaController) {
        this.bibliotecaController = bibliotecaController;
    }
    
}