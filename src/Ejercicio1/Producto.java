package Ejercicio1;

public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public void aumentarStock(int cantidad) {
        if (cantidad > 0) {
            this.cantidadEnStock += cantidad;
        } else {
            System.out.println("Cantidad inválida. No se puede aumentar el stock con un valor negativo.");
        }
    }

    public void disminuirStock(int cantidad) {
        if (cantidad > 0 && this.cantidadEnStock >= cantidad) {
            this.cantidadEnStock -= cantidad;
        } else {
            System.out.println("Cantidad inválida. No hay suficiente stock o el valor es negativo.");
        }
    }

    public double calcularValorTotalStock() {
        return this.cantidadEnStock * this.precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }
}
