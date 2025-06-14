package InterfazGrafica2;

import javax.swing.*;
import java.awt.event.*;

public class MouseListenerExample extends JFrame implements MouseListener {
    JLabel l;

    MouseListenerExample() {
        l = new JLabel();
        add(l);
        addMouseListener(this); //se añade el label al mouseListener
    }

    @Override
    public void mouseClicked(MouseEvent e) { //maneja clicks del mouse
        l.setText("Se hizo click con el mouse");
    }

    @Override
    public void mouseEntered(MouseEvent e) { //Maneja el evento si el Mouse entreo a la ventana
        l.setText("El mouse entró a la ventana");
    }

    @Override
    public void mouseExited(MouseEvent e) { //Maneja el evento si el Mouse salio de la ventan
        l.setText("El mouse salió de la ventana");
    }

    @Override
    public void mousePressed(MouseEvent e) { //Maneja el evento si el Mouse se esta presionando
        l.setText("El mouse está siendo presionado");
    }

    @Override
    public void mouseReleased(MouseEvent e) { //Maneja el evento si el Mouse ha sido soltado
        l.setText("Se soltó el mouse");
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MouseListenerExample mouse = new MouseListenerExample(); //crear una instancia de MouseListener
        mouse.l.setBounds(20, 50, 300, 20);
        f.add(mouse.l); //añadimos la etiqueta y el mouse al JFrame

        f.setSize(300, 300); //Tamaño de la ventana
        f.setLayout(null);
        f.setVisible(true); // Visibilidad de la ventan
        f.addMouseListener(mouse); //añadir el evento listener a el JFrame
    }
}

