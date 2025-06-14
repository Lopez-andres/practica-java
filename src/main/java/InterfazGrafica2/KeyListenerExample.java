package InterfazGrafica2;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//implementa los metodos abstractos de keyListener
public class KeyListenerExample implements KeyListener {
    @Override
    public void keyTyped(KeyEvent e) { //muestra el caracter de la tecla presionada
        System.out.println("The key Typed was: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) { //si es una tecla de accion cierra la consola (flecha arriba, flecha abajo)
        if (e.isActionKey()) {
            System.out.println("The key pressed was: " + e.getKeyChar()); //clave pulsada
            System.exit(0);
        }
        System.out.println("The key Pressed was: " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) { //muestra en consola el caracter de la tecla liberada
        System.out.println("The key Released was: " + e.getKeyChar()); //clave liberada
    }

    public static void main(String[] args) {
        // Setting the Frame and Labels
        Frame f = new Frame("Demo");
        // se añade un evento cuando el usuario hace eventos en la ventana (cerrarla)
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setLayout(new FlowLayout());
        f.setSize(500, 500);
        Label l = new Label();
        l.setText("This is a demonstration");
        f.add(l);
        f.setVisible(true);

        // Creating and adding the key listener
        KeyListenerExample k = new KeyListenerExample();
        f.addKeyListener(k);
        //f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}