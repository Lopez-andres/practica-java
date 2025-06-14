package Ejercicio4;

/**
 * Subclase de CuentaBancaria que permite sobregiros y manejo de cheques.
 * Implementa la interfaz Sobregirable.
 */
public class CuentaCorriente extends CuentaBancaria implements Sobregirable {
    private double sobregiro;
    private int numeroCheques;
    private int numeroChequesUtilizados;

    public CuentaCorriente(String nombre) {
        super(nombre);
    }

    @Override
    public double getSobregiro() {
        return sobregiro;
    }

    @Override
    public void setSobregiro(double nuevoSobregiro) {
        this.sobregiro = nuevoSobregiro;
    }

    public int getNumeroChequesRestantes() {
        return numeroCheques - numeroChequesUtilizados;
    }

    public void setNumeroCheques(int total) {
        this.numeroCheques = total;
    }

    public void usarCheque() {
        if (numeroChequesUtilizados < numeroCheques) {
            numeroChequesUtilizados++;
        }
    }
}
