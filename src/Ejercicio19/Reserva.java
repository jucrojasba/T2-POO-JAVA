package Ejercicio19;

import java.util.Date;

public class Reserva {
    private Date fecha;
    private Vuelo vuelo;
    private Pasajero pasajero;

    public Reserva(Date fecha, Vuelo vuelo, Pasajero pasajero) {
        this.fecha = fecha;
        this.vuelo = vuelo;
        this.pasajero = pasajero;
    }

    public Date getFecha() {
        return fecha;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public String getNumeroAsiento() {
        return "A" + (vuelo.getReservas().size());  // Generación sencilla del número de asiento
    }
}
