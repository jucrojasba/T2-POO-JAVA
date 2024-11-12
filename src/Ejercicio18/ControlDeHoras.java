package Ejercicio18;

public class ControlDeHoras {
    private static final int HORAS_SEMANALES = 40;
    private static final double TASA_EXTRA = 1.5;

    public double calcularSalarioSemanal(Empleado empleado) {
        int horas = empleado.getHorasTrabajadas();
        double pagoPorHora = empleado.getPagoPorHora();

        if (horas <= HORAS_SEMANALES) {
            return horas * pagoPorHora;
        } else {
            int horasExtras = horas - HORAS_SEMANALES;
            double pagoRegular = HORAS_SEMANALES * pagoPorHora;
            double pagoExtra = horasExtras * pagoPorHora * TASA_EXTRA;
            return pagoRegular + pagoExtra;
        }
    }
}
