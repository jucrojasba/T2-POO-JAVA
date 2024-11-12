package Ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private List<Double> listaNotas;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.listaNotas = new ArrayList<>();
    }

    public void agregarNota(double nota) {
        listaNotas.add(nota);
    }

    public double calcularPromedio() {
        if (listaNotas.isEmpty()) {
            return 0;
        }

        double sumaNotas = 0;
        for (double nota : listaNotas) {
            sumaNotas += nota;
        }
        return sumaNotas / listaNotas.size();
    }

    public boolean aprobo() {
        return calcularPromedio() >= 60;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Double> getListaNotas() {
        return listaNotas;
    }

    @Override
    public String toString() {
        return "Ejercicio7.Estudiante: " + nombre + ", Promedio: " + calcularPromedio() + ", Aprobado: " + (aprobo() ? "Sí" : "No");
    }
}
