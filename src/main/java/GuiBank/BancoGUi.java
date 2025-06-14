package GuiBank;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class BancoGUi extends JFrame {
    //Atributos GUI
    private JPanel PanelPrincipal;
    private JTextField campoTexto;
    private JLabel ReplicadorLabel;
    private JButton crearCuentaAhorrosButton;
    private JButton crearCuentaCorrienteButton;
    private JLabel TextoUsuario;
    private JTextField ReplicadorTextField;


    //Atributos para sobreescribir por las clases hijas
    private String nombreCuenta;
    protected double totalInteresesMes;
    protected double tasaInteres;
    protected double saldo;
    protected String titularCuenta;
    protected LocalDate fechaApertura;
    protected boolean estadoCuenta;
    protected String claveCuenta;

    public BancoGUi(String nombreCuenta, String titularCuenta, String claveCuenta) {
        this.nombreCuenta = campoTexto.getText();
        this.titularCuenta = titularCuenta;
        this.claveCuenta = claveCuenta;
        this.saldo = 0;
        this.tasaInteres = 0;
        this.totalInteresesMes = 0;
        this.fechaApertura = LocalDate.now();
        this.estadoCuenta = true;

        inicializarForma();
        crearCuentaAhorrosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReplicadorTextField.setText("Se creo una cuenta de Ahorros llamada: " + campoTexto.getText());
            }
        });
        crearCuentaCorrienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReplicadorTextField.setText("Se creo una cuenta Corriente llamada: " + campoTexto.getText());
            }
        });
    }

    public void calcularInteresesMes(){
        totalInteresesMes = saldo * (tasaInteres/100);
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }

    public void setNombreCuenta(String nombreCuenta) {
        this.nombreCuenta = nombreCuenta;
    }

    private void inicializarForma(){
        setTitle("BancoGui");
        setContentPane(PanelPrincipal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700,500);
        setLocationRelativeTo(null); //se centra la ventana
    }

    public static void main(String[] args) {
        BancoGUi banco = new BancoGUi("","","");
        banco.setVisible(true);
    }
}
