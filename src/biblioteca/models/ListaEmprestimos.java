package biblioteca.models;

import java.util.List;

public class ListaEmprestimos<T> {
    private List<T> listaEmprestimos;
    public void add (T item){
        listaEmprestimos.add(item);
     }
     public void remove (T item){
        listaEmprestimos.remove(item);
     }
}
