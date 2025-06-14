package Ejercicio8;

/**
 * Clase concreta que completa la implementación de la interfaz.
 */
public class OperacionCliente extends OperacionBase {

    @Override
    public void autenticar() {
        System.out.println("🔐 Usuario autenticado con éxito.");
    }

    @Override
    public void transferir() {
        System.out.println("💸 Transferencia realizada correctamente.");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("🔒 Sesión cerrada. ¡Gracias por usar nuestros servicios!");
    }
}
