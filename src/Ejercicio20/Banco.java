package Ejercicio20;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<CuentaBancaria> cuentas;

    public Banco() {
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    public CuentaBancaria buscarCuenta(String numeroCuenta) {
        for (CuentaBancaria cuenta : cuentas) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                return cuenta;
            }
        }
        return null;
    }

    public boolean realizarTransferencia(String numeroCuentaOrigen, String numeroCuentaDestino, double monto) {
        CuentaBancaria cuentaOrigen = buscarCuenta(numeroCuentaOrigen);
        CuentaBancaria cuentaDestino = buscarCuenta(numeroCuentaDestino);

        if (cuentaOrigen != null && cuentaDestino != null) {
            return cuentaOrigen.transferir(cuentaDestino, monto);
        }
        return false;
    }

    public void mostrarHistorial(String numeroCuenta) {
        CuentaBancaria cuenta = buscarCuenta(numeroCuenta);
        if (cuenta != null) {
            System.out.println("Historial de la cuenta " + numeroCuenta + ":");
            for (String transaccion : cuenta.getHistorialTransacciones()) {
                System.out.println(transaccion);
            }
        } else {
            System.out.println("Cuenta no encontrada.");
        }
    }
}
