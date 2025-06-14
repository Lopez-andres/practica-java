package Ejercicio9;

import javax.swing.*;

public class EjemploTry2 {
    public static void main(String[] args) {
        boolean entradaValida = true;

        try {
            String input = JOptionPane.showInputDialog("🔢 Introduce un número entero:");
            int numero = Integer.parseInt(input);
            JOptionPane.showMessageDialog(null, "✅ El número ingresado es: " + numero);
        } catch (NumberFormatException e) {
            entradaValida = false;
            JOptionPane.showMessageDialog(null, "❌ Error: El valor ingresado no es un número entero válido.");
        } finally {
            if (entradaValida) {
                JOptionPane.showMessageDialog(null, "🟢 El dato introducido es correcto.");
            } else {
                JOptionPane.showMessageDialog(null, "🔴 El dato introducido es incorrecto.");
            }
        }

        System.exit(0); // Cierra el programa de forma limpia
    }
}

