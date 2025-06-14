package Ejercicio4;

/**
 * Subclase de CuentaBancaria que simula una cuenta de ahorros.
 * Aplica intereses mensuales al saldo.
 */
public class CuentaAhorros extends CuentaBancaria {
    private double totalInteresesMes;

    public CuentaAhorros(String nombre) {
        super(nombre);
    }

    public void setInteresMensual(double interes) {
        this.totalInteresesMes = interes;
    }

    public double getTotalInteresesMes() {
        return totalInteresesMes;
    }

    @Override
    public double getSaldo() {
        return saldo + totalInteresesMes;
    }
}
