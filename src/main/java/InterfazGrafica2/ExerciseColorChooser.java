package InterfazGrafica2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class    ExerciseColorChooser extends JFrame implements ActionListener {
    JFrame Jframe;
    JButton Button1;
    JButton Button2;
    JTextArea TextArea;

    public ExerciseColorChooser(){
        Jframe = new JFrame("Color JTextArea Example.");
        Jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Button1 = new JButton("Pad Color");
        Button1.setBounds(200, 250, 100, 30);

        Button2 = new JButton("Font Color");
        Button2.setBounds(50, 250, 100, 30);

        TextArea = new JTextArea();
        TextArea.setBounds(10, 10, 300, 200);

        Button1.addActionListener(this);
        Button2.addActionListener(this);

        Jframe.add(Button1);
        Jframe.add(Button2);
        Jframe.add(TextArea);

        Jframe.setLayout(null);
        Jframe.setSize(400, 400);
        Jframe.setVisible(true);

        Button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Color color = JColorChooser.showDialog(Jframe, "Choose a color", Color.white);
                TextArea.setBackground(color);
                JButton pb = (JButton) e.getSource();
            }
        });

        Button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Color color = JColorChooser.showDialog(Jframe, "Text a color",Color.black);
                TextArea.setForeground(color);
                JButton pb = (JButton) e.getSource();
            }
        });
    }

    public void actionPerformed(ActionEvent e) {}

    public static void main(String[] args) {
        new ExerciseColorChooser();
    }
}
