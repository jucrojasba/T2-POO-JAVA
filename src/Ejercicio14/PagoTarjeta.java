package Ejercicio14;

public class PagoTarjeta extends Pago {
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta de crédito.");
    }
}

