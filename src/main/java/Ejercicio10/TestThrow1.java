package Ejercicio10;

import javax.swing.*;

public class TestThrow1 {

    public static void validate(int edad) {
        if (edad < 18) {
            throw new ArithmeticException("🚫 No puedes votar: eres menor de edad.");
        } else {
            JOptionPane.showMessageDialog(null, "✅ Puedes votar, tienes " + edad + " años.");
        }
    }

    public static void main(String[] args) {
        boolean esValido = false;

        do {
            try {
                int edad = Integer.parseInt(JOptionPane.showInputDialog("🔢 Ingrese su edad:"));
                validate(edad);
                esValido = true;
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "⚠️ Ingrese un número válido.");
            } catch (ArithmeticException ae) {
                JOptionPane.showMessageDialog(null, ae.getMessage());
            }
        } while (!esValido);

        System.exit(0);
    }
}
