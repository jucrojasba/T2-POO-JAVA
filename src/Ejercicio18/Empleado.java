package Ejercicio18;

public class Empleado {
    private String nombre;
    private double pagoPorHora;
    private int horasTrabajadas;

    public Empleado(String nombre, double pagoPorHora) {
        this.nombre = nombre;
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void registrarHoras(int horas) {
        if (horas > 0) {
            this.horasTrabajadas += horas;
        } else {
            System.out.println("Las horas trabajadas deben ser mayores a 0.");
        }
    }

    public void resetHoras() {
        this.horasTrabajadas = 0;
    }
}

