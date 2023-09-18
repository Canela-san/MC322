package biblioteca.controllers;

import java.util.ArrayList;
import java.util.List;

public class ReservaControleImpl implements ReservaControle{
    private List<ReservaControleImpl> reservas = new ArrayList<>();

    public List<ReservaControleImpl> getReservas() {
        return reservas;
    }

    public void setReservas(List<ReservaControleImpl> reservas) {
        this.reservas = reservas;
    }
    
}
