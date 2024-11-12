package Ejercicio19;

public class Pasajero {
    private String nombre;
    private String numeroPasaporte;

    public Pasajero(String nombre, String numeroPasaporte) {
        this.nombre = nombre;
        this.numeroPasaporte = numeroPasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumeroPasaporte() {
        return numeroPasaporte;
    }
}

