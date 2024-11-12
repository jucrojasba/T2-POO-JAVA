package Ejercicio16;

public class Producto {
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;

    public Producto(String nombre, String categoria, double precio, int stock) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Venta realizada de " + cantidad + " unidades de " + nombre + ".");
        } else {
            System.out.println("No hay suficiente stock para realizar la venta.");
        }
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + ", stock=" + stock + "]";
    }
}

