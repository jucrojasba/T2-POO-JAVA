package Ejercicio19;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vuelo {
    private String codigoVuelo;
    private int asientosDisponibles;
    private List<Reserva> reservas;

    public Vuelo(String codigoVuelo, int asientosDisponibles) {
        this.codigoVuelo = codigoVuelo;
        this.asientosDisponibles = asientosDisponibles;
        this.reservas = new ArrayList<>();
    }

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public boolean reservarAsiento(Pasajero pasajero) {
        if (asientosDisponibles > 0) {
            Reserva reserva = new Reserva(new Date(), this, pasajero);
            reservas.add(reserva);
            asientosDisponibles--;
            System.out.println("Reserva confirmada para " + pasajero.getNombre());
            return true;
        } else {
            System.out.println("No hay asientos disponibles en el vuelo " + codigoVuelo);
            return false;
        }
    }

    public boolean cancelarReserva(Reserva reserva) {
        if (reservas.remove(reserva)) {
            asientosDisponibles++;
            System.out.println("Reserva cancelada para " + reserva.getPasajero().getNombre());
            return true;
        }
        return false;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}

