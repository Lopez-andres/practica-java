package Ejercicio10;

import javax.swing.*;
import java.util.Objects;

public class Validacion {
    public static void main(String[] args) {
        boolean usuarioValido = false;

        do {
            String id = JOptionPane.showInputDialog(null, "🔐 Digite el ID:");
            String password = JOptionPane.showInputDialog(null, "🔑 Digite la contraseña:");

            try {
                if (!Objects.equals(id, "user1") || !Objects.equals(password, "1234")) {
                    throw new ExcepCredInvalida("Credenciales inválidas para el usuario: " + id);
                } else {
                    JOptionPane.showMessageDialog(null, "✅ Acceso concedido. ¡Bienvenido, " + id + "!");
                    usuarioValido = true;
                }
            } catch (ExcepCredInvalida ex) {
                JOptionPane.showMessageDialog(null, ex); // Muestra el toString()
            }
        } while (!usuarioValido);

        System.exit(0);
    }
}
