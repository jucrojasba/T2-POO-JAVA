package Ejercicio15;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int kilometraje;

    public Vehiculo(String marca, String modelo, int kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void realizarMantenimiento() {
        System.out.println("Realizando mantenimiento en el vehículo: " + marca + " " + modelo);
    }
}
