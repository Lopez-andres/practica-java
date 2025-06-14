package Ejercicio9;

import java.util.Scanner;

public class EjemploTry1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean huboExcepcion;

        do {
            System.out.print("🔢 Introduce un número entero: ");
            huboExcepcion = false;

            try {
                String entrada = sc.nextLine();
                int numero = Integer.parseInt(entrada);
                System.out.println("✅ Número válido: " + numero);
            } catch (NumberFormatException e) {
                System.out.println("❌ Error: el formato del número es inválido. Intenta de nuevo.");
                huboExcepcion = true;
            } finally {
                if (!huboExcepcion) {
                    System.out.println("🟢 Ejecución completada correctamente.\n");
                } else {
                    System.out.println("🔴 Ocurrió un error en la ejecución.\n");
                }
            }

        } while (huboExcepcion);

        sc.close(); // Siempre se recomienda cerrar el Scanner
    }
}

