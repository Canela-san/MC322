package biblioteca.models;

import java.util.List;

public class ItemBiblioteca<T extends ItemMultimidia> {
    private ListaReservas itensReservados;
    private ListaEmprestimos itensEmprestados;
    private int numeroDeItensEmprestados;
    private int numeroDeItensReservados;

    private void reservar(T item) {
        itensReservados.add(item);
    }

    private void emprestar(T item) {
        itensReservados.remove(item); // vai ser emprestado então já não é mais reservado
        itensEmprestados.add(item);
    }

    private void devolver(T item) {
        itensEmprestados.remove(item);
    }


}
