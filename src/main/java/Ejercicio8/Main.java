package Ejercicio8;

/**
 * Clase principal para ejecutar la simulación de operaciones bancarias.
 */
public class Main {
    public static void main(String[] args) {
        Operacion cliente = new OperacionCliente();

        cliente.autenticar();
        cliente.consultarSaldo();
        cliente.transferir();
        cliente.cerrarSesion();
    }
}
