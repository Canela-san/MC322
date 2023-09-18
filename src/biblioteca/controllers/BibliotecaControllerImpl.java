package biblioteca.controllers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import biblioteca.models.ItemMultimidia;
import biblioteca.models.Membro;

public class BibliotecaControllerImpl implements BibliotecaController {
    private List<ItemMultimidia> itens;
    private Set<String> catergoria = new HashSet<>();

    public BibliotecaControllerImpl() {
        itens = new ArrayList<>();
    }

    @Override
    public List<ItemMultimidia> consultarItensDisponiveis() {
        return itens;
    }

    @Override
    public boolean emprestarItem(Membro membro, ItemMultimidia item) {
        // Lógica de empréstimo
        return true;
    }

    @Override
    public boolean devolverItem(Membro membro, ItemMultimidia item) {
        // Lógica de devolução
        return true;
    }
}