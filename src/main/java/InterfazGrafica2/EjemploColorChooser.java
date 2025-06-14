package InterfazGrafica2;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class EjemploColorChooser extends JFrame implements ChangeListener, ActionListener {
    private final JColorChooser jcc;
    private final JButton jb;

    public EjemploColorChooser() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        jcc = new JColorChooser();
        jcc.getSelectionModel().addChangeListener(this); //implementa la reaccion al evento que en este caso es que color presiona

        jb = new JButton("Pulsa aqui para Cerrar");
        jb.addActionListener(this);
        setMaximumSize(new Dimension(100, 100));
        setLayout(new BorderLayout());

        add(jcc, BorderLayout.CENTER);
        add(jb, BorderLayout.SOUTH);
        pack(); //configurar la ventana automaticamente dependiendo sus elementos
        //setSize(500, 500);
        setVisible(true);
    }

    public void stateChanged(ChangeEvent e) {
        jb.setForeground(jcc.getColor());
    }

    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "chao!");
        System.exit(0);
    }

    public static void main(String[] args) {
            new EjemploColorChooser();
    }
}

