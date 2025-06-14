package GUIGraficaMenu;

import java.awt.*;
import javax.swing.JFrame;

public class DisplayGraphics extends Canvas {
    public void paint(Graphics g) {
        g.drawString("Hello", 40, 40); //inserta una cadena texto "Hello"
        setBackground(Color.WHITE); //color de fondo
        g.fillRect(130, 30, 100, 80); //Dibuja un rectangulo relleno
        g.drawOval(30, 130, 50, 60); //Dibujo el contorno de un ovalo
        setForeground(Color.BLUE); //color de todos los dibujos en azul
        g.fillOval(130, 130, 50, 60); //Dibuja un ovalo con relleno
        g.drawArc(30, 200, 40, 50, 90, 60); //dibuja un arco sin relleno
        g.fillArc(30, 130, 40, 50, 160, 40); //dibuja un arco relleno en el ovalo vacio
    }

    public static void main(String[] args) {
        DisplayGraphics m = new DisplayGraphics(); //instancia de un objeto de esta clase
        JFrame f = new JFrame(); //instancia de un objeto de esta clase
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(m); //añadimo los graficos al JFrame
        f.setSize(400, 400);
        f.setVisible(true);
        //todos los fill dan relleno a sus figuras
    }
}

