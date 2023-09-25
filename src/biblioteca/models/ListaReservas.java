package biblioteca.models;

import java.util.List;

public class ListaReservas<T> {
 private List<T> listaReservas;

 public void add (T item){
    listaReservas.add(item);
 }
  public void remove (T item){
    listaReservas.remove(item);
 }
}