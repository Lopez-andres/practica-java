package Ejercicio4;

/**
 * Clase base que representa una cuenta bancaria genérica.
 */
public class CuentaBancaria {
    protected double saldo;
    protected String nombreCuenta;

    public CuentaBancaria(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
        this.saldo = 0;
    }

    public void debitarCuenta(double valor) {
        saldo -= valor;
    }

    public void acreditarCuenta(double valor) {
        saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }
}
