package GUIGraficaMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class menuBarExample2 extends JPanel {
    BufferedImage image;

    public menuBarExample2(int ancho, int alto) { //inicializa el objeto de la clase con dimensiones y fondo
        image = new BufferedImage(ancho, alto,  BufferedImage.TYPE_INT_ARGB);
        setPreferredSize(new Dimension(ancho, alto));
        setBackground(Color.WHITE);
    }

    public void dibujar(int x, int y) {
        Graphics2D g2 = image.createGraphics();   //estamos obteniendo un lapiz por decirlo asi, para dibujar
        g2.setColor(Color.BLUE);                  //color azul
        g2.fillOval(x, y, 5, 5);
        g2.dispose();
        repaint();
    }

    public BufferedImage getImagen() {
        return image;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null);
    }

    public void setImagen(BufferedImage nuevaImagen) {
        this.image = nuevaImagen;
        repaint();
    }
}

