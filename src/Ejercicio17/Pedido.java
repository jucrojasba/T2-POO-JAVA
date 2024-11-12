package Ejercicio17;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productosComprados;
    private List<Integer> cantidades;
    private double total;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productosComprados = new ArrayList<>();
        this.cantidades = new ArrayList<>();
        this.total = 0.0;
    }

    public void agregarProducto(Producto producto, int cantidad) {
        if (producto.hayStock(cantidad)) {
            productosComprados.add(producto);
            cantidades.add(cantidad);
            total += producto.getPrecio() * cantidad;
            producto.reducirStock(cantidad);
        } else {
            System.out.println("No se puede agregar " + producto.getNombre() + " debido a stock insuficiente.");
        }
    }

    public double calcularTotal() {
        return total;
    }

    public void mostrarResumenPedido() {
        System.out.println("Resumen del pedido para " + cliente.getNombre() + ":");
        for (int i = 0; i < productosComprados.size(); i++) {
            Producto producto = productosComprados.get(i);
            int cantidad = cantidades.get(i);
            System.out.println("- " + producto.getNombre() + " x" + cantidad + " - $" + producto.getPrecio() * cantidad);
        }
        System.out.println("Total: $" + calcularTotal());
    }
}

