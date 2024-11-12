package Ejercicio10;

public class Empleado {
    private String nombre;
    private double salarioBase;
    private int aniosExperiencia;

    public Empleado(String nombre, double salarioBase, int aniosExperiencia) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public double calcularBono() {
        double bono = salarioBase * (0.05 * aniosExperiencia);
        return bono;
    }

    public double calcularSalarioTotal() {
        return salarioBase + calcularBono();
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + ", Salario Base: " + salarioBase + ", Años de Experiencia: " + aniosExperiencia
                + ", Bono: " + calcularBono() + ", Salario Total: " + calcularSalarioTotal();
    }
}

