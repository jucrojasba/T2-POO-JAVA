package Ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Flota {
    private List<Vehiculo> vehiculos;

    public Flota() {
        vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void registrarMantenimiento() {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getKilometraje() >= 10000) {
                System.out.println("El vehículo " + vehiculo.getMarca() + " " + vehiculo.getModelo() +
                        " necesita mantenimiento. Kilometraje: " + vehiculo.getKilometraje());
                vehiculo.realizarMantenimiento();
                vehiculo.setKilometraje(0); // Reseteamos el kilometraje después del mantenimiento
            }
        }
    }

    public void mostrarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Marca: " + vehiculo.getMarca() + ", Modelo: " + vehiculo.getModelo() +
                    ", Kilometraje: " + vehiculo.getKilometraje());
        }
    }
}

