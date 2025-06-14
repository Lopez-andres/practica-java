package InterfazGrafica2;

import java.awt.*;
import java.awt.event.*;

    public class MouseListenerExample2 extends Frame implements MouseListener {

        MouseListenerExample2() {
            addMouseListener(this);

            setSize(300, 300); //tamaño de la ventana
            setLayout(null); //determina como se distribuyen los componentes en una ventana
            setVisible(true); //dar visibilidad a la ventana

            addWindowListener(new WindowAdapter() { //controla el evento de una ventana cuando el usuario presiona "x"
                public void windowClosing(WindowEvent e) {
                    dispose();
                }
            });
        }

        public void mouseClicked(MouseEvent e) { //segun el evento click grafica un circulo y define su diseño
            Graphics g = getGraphics();
            g.setColor(Color.BLACK);
            g.fillOval(e.getX(), e.getY(), 40, 40);
        }

        //por defecto estos metodos deben declararse aun cuando no se han sobreescrito
        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }

        public void mousePressed(MouseEvent e) {
        }

        public void mouseReleased(MouseEvent e) {
        }

        public static void main(String[] args) {
            new MouseListenerExample2(); //crea un nuevo objeto de la clase
        }
    }

