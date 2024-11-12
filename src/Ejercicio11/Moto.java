package Ejercicio11;

public class Moto extends Vehiculo {
    private String tipoCasco;

    public Moto(String marca, String modelo, double velocidadMaxima, String tipoCasco) {
        super(marca, modelo, velocidadMaxima); // Llamada al constructor de la clase base
        this.tipoCasco = tipoCasco;
    }

    public String getTipoCasco() {
        return tipoCasco;
    }

    @Override
    public void describir() {
        super.describir(); // Llama al método describir de la clase base
        System.out.println("Tipo de casco: " + tipoCasco);
    }
}

