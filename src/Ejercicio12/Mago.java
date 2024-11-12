package Ejercicio12;

public class Mago extends Personaje {

    public Mago(String nombre, int nivel) {
        super(nombre, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(getNombre() + " lanza un hechizo de fuego.");
    }
}
