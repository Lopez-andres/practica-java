package Ejercicio8;

/**
 * Clase abstracta que implementa parcialmente la interfaz Operacion.
 */
abstract class OperacionBase implements Operacion {
    @Override
    public void consultarSaldo() {
        System.out.println("✔ Consultando saldo...");
    }
}
