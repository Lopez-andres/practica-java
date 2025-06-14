package Ejercicio11;

import javax.swing.*;

public class PrimerSwing {

    private static void mostrarVentana() {
        JFrame frame = new JFrame("Nuestra primera ventana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Este es nuestro primer programa con Swing", SwingConstants.CENTER);
        frame.getContentPane().add(label);

        frame.setSize(400, 200);
        frame.setLocationRelativeTo(null); // Centra la ventana en pantalla
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        mostrarVentana(); // Método estático, se llama sin crear objeto
    }
}
