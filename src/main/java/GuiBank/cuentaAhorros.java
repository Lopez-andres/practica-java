package GuiBank;

public class cuentaAhorros extends BancoGUi{
    public cuentaAhorros(String nombreCuenta, String titularCuenta, String claveCuenta) {
        super(nombreCuenta, titularCuenta, claveCuenta);
        this.tasaInteres = 3.5; // se sobreescribe la tasa de interés por defecto
    }

    @Override
    public void calcularInteresesMes() {
        totalInteresesMes = saldo * (tasaInteres / 100);
        saldo += totalInteresesMes; // Se suman los intereses al saldo
    }
}
