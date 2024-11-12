package Ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.prestar();
                return;
            }
        }
        System.out.println("No se encontró el libro con el título: " + titulo);
    }

    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.devolver();
                return;
            }
        }
        System.out.println("No se encontró el libro con el título: " + titulo);
    }

    public void mostrarInventario() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca no tiene libros.");
        } else {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
}

