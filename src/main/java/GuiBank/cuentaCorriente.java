package GuiBank;

public class cuentaCorriente extends BancoGUi implements sobreGirable{
    private double sobregiro;

    public cuentaCorriente(String nombreCuenta, String titularCuenta, String claveCuenta) {
        super(nombreCuenta, titularCuenta, claveCuenta);
        this.sobregiro = 500; // Límite de sobregiro inicial
    }

    @Override
    public double getSobregiro() {
        return 0;
    }

    @Override
    public void setSobregiro(double nuevoSobregiro) {

    }
}
