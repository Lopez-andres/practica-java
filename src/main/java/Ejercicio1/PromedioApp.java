package Ejercicio1;

import javax.swing.*;

/**
 * Main class for interacting with the user to input grades and display the average and grade.
 */
public class PromedioApp {
    public static void main(String[] args) {
        try {
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la primera nota:"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la segunda nota:"));
            double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la tercera nota:"));

            PromedioCalculator promedio = new PromedioCalculator(nota1, nota2, nota3);
            promedio.calcularPromedio();
            promedio.asignarCalificacion();

            JOptionPane.showMessageDialog(null,
                    "Promedio: " + promedio.getPromedio() + "\n" +
                            "Calificación: " + promedio.getCalificacion()
            );
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor ingrese números válidos.");
        }
    }
}

