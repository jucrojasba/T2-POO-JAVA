package Ejercicio12;

public class Personaje {
    private String nombre;
    private int nivel;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void atacar() {
        System.out.println(nombre + " ataca con una habilidad básica.");
    }
}
