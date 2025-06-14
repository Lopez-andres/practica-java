package InterfazGrafica2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChooserExample extends JFrame implements ActionListener {
    JFrame f;
    JButton b;
    JTextArea ta;

    ColorChooserExample() {
        f = new JFrame("Color Chooser Example.");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b = new JButton("Pad Color");
        b.setBounds(200, 250, 100, 30);

        ta = new JTextArea();
        ta.setBounds(10, 10, 300, 200);

        b.addActionListener(this);
        f.add(b);
        f.add(ta);

        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Color color = JColorChooser.showDialog(this, "Choose a color", Color.white);
        ta.setBackground(color);

    }

    public static void main(String[] args) {
        new ColorChooserExample();

    }
}
