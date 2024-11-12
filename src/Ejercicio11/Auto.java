package Ejercicio11;

public class Auto extends Vehiculo {
    private int numPuertas;

    public Auto(String marca, String modelo, double velocidadMaxima, int numPuertas) {
        super(marca, modelo, velocidadMaxima); // Llamada al constructor de la clase base
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    @Override
    public void describir() {
        super.describir(); // Llama al método describir de la clase base
        System.out.println("Número de puertas: " + numPuertas);
    }
}
