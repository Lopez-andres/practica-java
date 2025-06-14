package InterfazGrafica2;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import GUIGraficaMenu.menuBarExample2;

public class MouseMotionListenerExample extends JFrame implements MouseMotionListener, ActionListener {
    //aqui declaramos los componentes listados de la ventana
    JMenuItem menuitemnuevo;
    JMenuItem menuitemcargar;
    JMenuItem menuitemguardar;
    JMenuItem menuitemsalir;
    JMenuItem menuitemayuda;
    menuBarExample2 image;

    public MouseMotionListenerExample() {
        addMouseMotionListener(this);                   //Añadimos el listener del movimiento
        JFrame f = new JFrame("Menu example");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar mb = new JMenuBar();

        JMenu menuarchivo = new JMenu("Archivo");      //El encabezado del menuArchivo
        menuitemnuevo = new JMenuItem("Nuevo");
        menuitemnuevo.addActionListener(this);
        menuarchivo.add(menuitemnuevo);                   //Añadimos un nuevo item a esa lista

        menuitemguardar = new JMenuItem("Guardar");
        menuitemguardar.addActionListener(this);
        menuarchivo.add(menuitemguardar);

        menuitemcargar = new JMenuItem("Cargar");
        menuitemcargar.addActionListener(this);
        menuarchivo.add(menuitemcargar);

        menuarchivo.addSeparator();                       //Añadimos un separador entre Guardar, Cargar y Salir

        menuitemsalir = new JMenuItem("Salir");
        menuitemsalir.addActionListener(this);
        menuarchivo.add(menuitemsalir);

        mb.add(menuarchivo);

        JMenu menuayuda = new JMenu("Ayuda");
        menuitemayuda = new JMenuItem("Ayuda");
        menuitemayuda.addActionListener(this);
        menuayuda.add(menuitemayuda);

        mb.add(menuayuda);

        // Agregar un listener para cerrar la ventana correctamente
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setJMenuBar(mb);
        setSize(400, 400);
        image = new menuBarExample2(380,380);
        add(image, BorderLayout.CENTER);
        image.addMouseMotionListener(this);     //aqui se añade el tamaño del panel de imagen donde el actionListener dibujara
        setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        image.dibujar(e.getX(), e.getY());
    }

    //Metodo llamado cuando el mouse se mueve dentro de la ventana.
    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JMenuItem item_sel = (JMenuItem) e.getSource();

        if (item_sel == menuitemnuevo) {
            new MouseMotionListenerExample();
            JOptionPane.showMessageDialog(this, "Creando un nuevo elemento");
        }

        if (item_sel == menuitemsalir) {
            JOptionPane.showMessageDialog(this, "saliendo");
            System.exit(0);
        }

        if (item_sel == menuitemguardar) {
            JFileChooser chooser = new JFileChooser();              //nos muestra una ventana con la seleccion del fichero
            int opcion = chooser.showSaveDialog(this);        //guarda el archivo en la ruta de origen
            if (opcion == JFileChooser.APPROVE_OPTION) {            // Si el usuario hizo click en guardar - como una bandera que confirma si el usuario guardo el archivo
                try {
                    File file = chooser.getSelectedFile();          //obtiene el archivo y lo guarda en una variable File
                    ImageIO.write(image.getImagen(), "png", file);      //Metodo estatico que guarda el objeto imagen en el archivo file
                    JOptionPane.showMessageDialog(this, "Imagen guardada.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al guardar: " + ex.getMessage());
                }
            }
        }

        if (item_sel == menuitemcargar) {
            JFileChooser chooser = new JFileChooser();      //nos muestra una ventana con la seleccion del fichero
            int opcion = chooser.showOpenDialog(this);      //es como un tipo de bandera que se encarga de abrir el archivo y esto sirve para el if para saber si se abrio o no
            if (opcion == JFileChooser.APPROVE_OPTION) {
                try {
                    File archivo = chooser.getSelectedFile();       //obtenemos la imagen seleccionada
                    BufferedImage imagenCargada = ImageIO.read(archivo);
                    // Redimensionamos si es necesario
                    BufferedImage nuevaImagen = new BufferedImage(      //leemos la imagen seleccionada en un archivo
                            image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_ARGB);      //esta imagen tiene un objeto con sus dimensiones
                    Graphics2D g2 = nuevaImagen.createGraphics();   //dibujamos sobre la imagen
                    g2.setColor(Color.WHITE); // fondo blanco
                    g2.fillRect(0, 0, nuevaImagen.getWidth(), nuevaImagen.getHeight());     //dibujamos encima de la imagen cargada
                    g2.drawImage(imagenCargada, 0, 0, null);
                    g2.dispose();       //cerramos los recursos graficos
                    image.setImagen(nuevaImagen);       //modificamos la imagen con la nueva imagen, esto para guardarlo luego
                    image.repaint();        //se muestre la nueva imagen
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al abrir: " + ex.getMessage());
                }
            }
        }

        if (item_sel == menuitemsalir) {
            JOptionPane.showMessageDialog(this, "saliendo");
            System.exit(0);
        }

        if (item_sel == menuitemayuda) {
            JFrame f2 = new JFrame("Menu ayuda");
            JLabel l = new JLabel("Este es el menu de ayuda, presione el boton x para cerrarlo");
            f2.add(l);
            f2.setSize(400, 100);
            f2.setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MouseMotionListenerExample::new); //Se crea un objeto de la clase
    }
}
