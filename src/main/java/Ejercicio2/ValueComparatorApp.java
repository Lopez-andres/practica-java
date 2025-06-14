package Ejercicio2;

import javax.swing.*;

/**
 * Main class for running the ValueComparator logic with user interaction via dialogs.
 */
public class ValueComparatorApp {
    public static void main(String[] args) {
        try {
            int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number:"));
            int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number:"));

            ValueComparator comparator = new ValueComparator(valor1, valor2);
            comparator.calcularMayor();
            comparator.calcularMenor();

            if (comparator.sonIguales()) {
                JOptionPane.showMessageDialog(null, "Both numbers are equal.");
            } else {
                JOptionPane.showMessageDialog(null,
                        "Greater number: " + comparator.getMayor() + "\n" +
                                "Smaller number: " + comparator.getMenor()
                );
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid integers.");
        }
    }
}
