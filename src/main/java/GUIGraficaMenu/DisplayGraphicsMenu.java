package GUIGraficaMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DisplayGraphicsMenu extends JFrame implements ActionListener {
    private String figuraSeleccionada = "Rectángulo"; // Por defecto
    private int xInicio, yInicio, xFin, yFin; //coordenadas del mouse al preisonar y soltar
    private boolean dibujar = false; //determina si se dibuja o no

    public DisplayGraphicsMenu() {
        setTitle("Dibujar Figuras");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Crear un menu
        JMenuBar barraMenu = new JMenuBar();
        JMenu menuFiguras = new JMenu("Figuras");
        JMenuItem menuRectangulo = new JMenuItem("Rectángulo");
        JMenuItem menuOvalo = new JMenuItem("Óvalo");

        // Crear los dos ActionListener
        menuRectangulo.addActionListener(this);
        menuOvalo.addActionListener(this);

        //Añadimos el actionListener a cada opcion y añadimos los items al menu
        menuFiguras.add(menuRectangulo);
        menuFiguras.add(menuOvalo);
        barraMenu.add(menuFiguras);
        setJMenuBar(barraMenu);

        // Evento del mouse
        addMouseListener(new MouseAdapter() {
            //al presionar el mouse obtenemos las coordenadas iniciales
            public void mousePressed(MouseEvent e) {
                xInicio = e.getX();
                yInicio = e.getY();
            }

            //al soltar el mouse obtenemos las coordenadas finales
            public void mouseReleased(MouseEvent e) {
                xFin = e.getX();
                yFin = e.getY();
                dibujar = true; //cuando soltamos el mouse dibujar pasa a ser true, es decir que si se dibujo
                repaint();
            }
        });

        setVisible(true);
    }

    /*cuando se selecciona un item del menu se activa este metodo
    también borra la figura anterior y permita dibujar una nueva*/

    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        figuraSeleccionada = comando;
        dibujar = false; // No dibuja hasta que se use el mouse
        repaint();
    }

    //metodo encargado de pintar el contenedor
    public void paint(Graphics g) {
        super.paint(g);
        //aqui se calcula el tamaño del dibujo
        if (dibujar) {
            int x = Math.min(xInicio, xFin);
            int y = Math.min(yInicio, yFin);
            int ancho = Math.abs(xInicio - xFin);
            int alto = Math.abs(yInicio - yFin);

            g.setColor(Color.GREEN); //color verde de las figuras
            //si la figura es Rectangulo dibuja con fillRect
            //si la figura es Ovalo dibuja con fillOval
            if (figuraSeleccionada.equals("Rectángulo")) {
                g.fillRect(x,y,ancho,alto);
            } else if (figuraSeleccionada.equals("Óvalo")) {
                g.fillOval(x, y, ancho, alto);
            }
        }
    }

    public static void main(String[] args) {
        new DisplayGraphicsMenu();
    }
}

