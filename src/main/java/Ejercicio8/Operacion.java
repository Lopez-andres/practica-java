package Ejercicio8;

/**
 * Interfaz que define un conjunto de operaciones bancarias.
 */
interface Operacion {
    void autenticar();
    void consultarSaldo();
    void transferir();
    void cerrarSesion();
}
