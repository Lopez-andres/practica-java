package Ejercicio4;

import javax.swing.JOptionPane;

/**
 * Clase principal que simula la creación de una cuenta bancaria
 * según el tipo ingresado por el usuario.
 */
public class Banco {
    public static void main(String[] args) {
        CuentaBancaria cuenta;
        String tipoCuenta = JOptionPane.showInputDialog("Enter account type (CORRIENTE / AHORROS):");
        String nombreCuenta = JOptionPane.showInputDialog("Enter account name:");

        switch (tipoCuenta.toUpperCase()) {
            case "CORRIENTE":
                cuenta = new CuentaCorriente(nombreCuenta);
                break;
            case "AHORROS":
                cuenta = new CuentaAhorros(nombreCuenta);
                break;
            default:
                cuenta = new CuentaBancaria(nombreCuenta);
                break;
        }

        JOptionPane.showMessageDialog(null, "Account created successfully: " + cuenta.getNombreCuenta());
    }
}
