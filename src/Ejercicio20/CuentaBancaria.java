package Ejercicio20;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private List<String> historialTransacciones;

    public CuentaBancaria(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.historialTransacciones = new ArrayList<>();
        historialTransacciones.add("Cuenta creada con saldo inicial: " + saldoInicial);
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            historialTransacciones.add("Depósito de: " + monto);
            return true;
        }
        return false;
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            historialTransacciones.add("Retiro de: " + monto);
            return true;
        }
        return false;
    }

    public boolean transferir(CuentaBancaria cuentaDestino, double monto) {
        if (monto > 0 && monto <= saldo) {
            this.retirar(monto);
            cuentaDestino.depositar(monto);
            historialTransacciones.add("Transferencia de " + monto + " a cuenta " + cuentaDestino.getNumeroCuenta());
            cuentaDestino.historialTransacciones.add("Transferencia recibida de " + monto + " desde cuenta " + this.numeroCuenta);
            return true;
        }
        return false;
    }

    public List<String> getHistorialTransacciones() {
        return historialTransacciones;
    }
}

