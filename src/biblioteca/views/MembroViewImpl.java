package biblioteca.views;

import java.util.List;

import biblioteca.controllers.MembroController;

import biblioteca.models.Membro;
import biblioteca.models.MembroImpl;

public class MembroViewImpl implements MembroView {
    private MembroController membroController;




    public MembroViewImpl(MembroController controller) {
        membroController = controller;
    }

    @Override
    public void mostrarListaMembros(List<Membro> membros) {
        // Implementação da exibição da lista de membros
    }

    @Override
    public void mostrarDetalhesMembro(Membro membro) {
        // Implementação da exibição dos detalhes de um membro
    }

    public MembroController getMembroController() {
        return membroController;
    }

    public void setMembroController(MembroController membroController) {
        this.membroController = membroController;
    }
    
}