package Ejercicio16;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto " + producto.getNombre() + " agregado al inventario.");
    }

    public void eliminarProducto(String nombre) {
        Producto producto = buscarProductoPorNombre(nombre);
        if (producto != null) {
            productos.remove(producto);
            System.out.println("Producto " + nombre + " eliminado del inventario.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public Producto buscarProductoPorNombre(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }
        return null;
    }

    public List<Producto> buscarProductoPorCategoria(String categoria) {
        List<Producto> productosCategoria = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCategoria().equalsIgnoreCase(categoria)) {
                productosCategoria.add(producto);
            }
        }
        return productosCategoria;
    }

    public void actualizarStock(String nombre, int cantidad) {
        Producto producto = buscarProductoPorNombre(nombre);
        if (producto != null) {
            producto.setStock(cantidad);
            System.out.println("Stock de " + nombre + " actualizado a " + cantidad + " unidades.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void realizarVenta(String nombre, int cantidad) {
        Producto producto = buscarProductoPorNombre(nombre);
        if (producto != null) {
            producto.vender(cantidad);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario:");
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }
}
