import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private List<String> historialTransacciones;

    public CuentaBancaria(String numeroCuenta, String titular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.historialTransacciones = new ArrayList<>();
        historialTransacciones.add("Cuenta creada con saldo inicial: " + saldoInicial);
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            historialTransacciones.add("Depósito: +" + monto);
        } else {
            System.out.println("Monto de depósito inválido.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            historialTransacciones.add("Retiro: -" + monto);
        } else {
            System.out.println("Monto de retiro inválido o saldo insuficiente.");
        }
    }

    public void mostrarHistorial() {
        System.out.println("Historial de transacciones para la cuenta " + numeroCuenta + ":");
        for (String transaccion : historialTransacciones) {
            System.out.println(transaccion);
        }
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
