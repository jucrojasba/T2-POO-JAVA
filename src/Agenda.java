import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
        System.out.println("Contacto agregado: " + contacto.getNombre());
    }

    public void eliminarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                contactos.remove(contacto);
                System.out.println("Contacto eliminado: " + nombre);
                return;
            }
        }
        System.out.println("Contacto no encontrado: " + nombre);
    }

    public void buscarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Contacto encontrado: " + contacto);
                return;
            }
        }
        System.out.println("Contacto no encontrado: " + nombre);
    }

    public void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía.");
        } else {
            System.out.println("Contactos en la agenda:");
            for (Contacto contacto : contactos) {
                System.out.println(contacto);
            }
        }
    }
}
