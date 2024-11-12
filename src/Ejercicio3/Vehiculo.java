package Ejercicio3;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidadMaxima;
    private int velocidadActual;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = 0;
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadActual += incremento;
            if (velocidadActual > velocidadMaxima) {
                velocidadActual = velocidadMaxima;
            }
        }
    }

    public void frenar(int decremento) {
        if (decremento > 0) {
            velocidadActual -= decremento;
            if (velocidadActual < 0) {
                velocidadActual = 0;
            }
        }
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
}
