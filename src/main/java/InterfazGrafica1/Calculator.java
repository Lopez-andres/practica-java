package InterfazGrafica1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener {
    JButton b10, b11, b12, b13, b14, b15, b16, b17, b18, b19;
    JButton[] b = new JButton[10];
    Double Resultado, n1, n2;
    JTextField Resetear;
    String Opcion;

    public Calculator() {
        super("Calculator"); //pasa al constructor de JFrame
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4)); //distribution of grid
        for (int i = 0; i <= 9; i++) {
            b[i] = new JButton(i + "");
            panel.add(b[i]);
            b[i].addActionListener(this); //the logic behind the button
        }
        b10 = new JButton("+");
        panel.add(b10);
        b10.addActionListener(this);

        b11 = new JButton("-");
        panel.add(b11);
        b11.addActionListener(this);

        b12 = new JButton("*");
        panel.add(b12);
        b12.addActionListener(this);

        b13 = new JButton("/");
        panel.add(b13);
        b13.addActionListener(this);

        b14 = new JButton("=");
        panel.add(b14);
        b14.addActionListener(this);

        b15 = new JButton("C");
        panel.add(b15);
        b15.addActionListener(this);

        b16 = new JButton("Sen");
        panel.add(b16);
        b16.addActionListener(this);

        b17 = new JButton("Cos");
        panel.add(b17);
        b17.addActionListener(this);

        b18 = new JButton("Tan");
        panel.add(b18);
        b18.addActionListener(this);

        b19 = new JButton(".");
        panel.add(b19);
        b19.addActionListener(this);

        Resetear = new JTextField(10);
        add(panel, BorderLayout.CENTER); //ubication in the panel center
        add(Resetear, BorderLayout.NORTH); //ubication in the panel north
        setVisible(true);
        setSize(300, 400);
    }

    public void actionPerformed(ActionEvent ae) { //action of botons
        JButton PruebaBoton = (JButton) ae.getSource(); // getSource() where the event comes from
        if (PruebaBoton == b15) { //C
            Resultado = n1 = n2 = (double) 0;
            Resetear.setText(""); // the label is empty
        } else if (PruebaBoton == b14) { //=
            n2 = Double.parseDouble(Resetear.getText());
            eval();
            Resetear.setText("" + Resultado);
        } else {
            boolean OpcionFinal = false;
            if (PruebaBoton == b10) {             // +
                Opcion = "+";
                OpcionFinal = true;
            }
            if (PruebaBoton == b11) {             // -
                Opcion = "-";
                OpcionFinal = true;
            }
            if (PruebaBoton == b12) {             // *
                Opcion = "*";
                OpcionFinal = true;
            }
            if (PruebaBoton == b13) {              // division
                Opcion = "/";
                OpcionFinal = true;
            }
            if (PruebaBoton == b16) {
                Opcion = "Sen";
                n1 = Double.parseDouble(Resetear.getText());
                eval();
            }
            if (PruebaBoton == b17) {              //Cos
                Opcion = "Cos";
                n1 = Double.parseDouble(Resetear.getText());
                eval();
            }
            if (PruebaBoton == b18) {              //Tan
                Opcion = "Tan";
                n1 = Double.parseDouble(Resetear.getText());
                eval();
            }
            if (PruebaBoton == b19) {              // .
                Resetear.setText(Resetear.getText() + ".");
            }
                    if (!OpcionFinal) { //if OpcionFinal is false
                        for (int i = 0; i < 10; i++) {
                            if (PruebaBoton == b[i]) {
                                String t = Resetear.getText(); //get the label information
                                t += i;
                                Resetear.setText(t);
                            }
                        }
                    } else {
                        String input = Resetear.getText().trim(); //clean of JTextField

                        if (!input.isEmpty()) { //in case of not input a number before of in operation
                            n1 = Double.parseDouble(Resetear.getText());
                            Resetear.setText("");
                        } else {
                            Resetear.setText("Error"); // Muestra error si no hay número ingresado
                        }
                    }
                }
            }

        public void eval () {
            switch (Opcion) {
                case "+":
                    Resultado = n1 + n2; break;
                case "-":
                    Resultado = n1 - n2; break;
                case "*":
                    Resultado = n1 * n2; break;
                case "/":
                        Resultado = n1 / n2; break;
                case "Sen":
                    Resultado = Math.sin(Math.toRadians(n1)); break;
                case "Cos":
                    Resultado = Math.cos(Math.toRadians(n1)); break;
                case "Tan":
                    Resultado = Math.tan(Math.toRadians(n1)); break;
            }
        }

    public static void main(String[] args) {
        new Calculator ();
    }
}
