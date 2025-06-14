package Ejercicio11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SegundoSwing {
    private static int numeroClicks = 0;

    private static void mostrarVentana() {
        JFrame frame = new JFrame("Contador de clics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton boton = new JButton("Comienza a dar clic");
        boton.setPreferredSize(new Dimension(250, 100)); // Más cómodo visualmente

        // Agregamos acción usando lambda (más moderno)
        boton.addActionListener((ActionEvent e) -> {
            numeroClicks++;
            boton.setText("Número de clics: " + numeroClicks);
        });

        frame.getContentPane().add(boton);
        frame.pack();
        frame.setLocationRelativeTo(null); // Centrar en pantalla
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        mostrarVentana();
    }
}
