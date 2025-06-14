package GUIGraficaMenu;

import javax.swing.*;

public class menuBarExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Menu example");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar mb = new JMenuBar();

        JMenu menuarchivo = new JMenu("Archivo");
        JMenuItem menuitemnuevo = new JMenuItem("Nuevo");
        menuarchivo.add(menuitemnuevo);

        JMenuItem menuitemcargar = new JMenuItem("Cargar");
        menuarchivo.add(menuitemcargar);

        menuarchivo.addSeparator();

        JMenuItem menuitemsalir = new JMenuItem("Salir");
        menuarchivo.add(menuitemsalir);

        mb.add(menuarchivo);

        JMenu menuayuda = new JMenu("Ayuda");
        JMenuItem menuitemayuda = new JMenuItem("Ayuda");
        menuayuda.add(menuitemayuda);

        mb.add(menuayuda);

        f.setJMenuBar(mb);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}


