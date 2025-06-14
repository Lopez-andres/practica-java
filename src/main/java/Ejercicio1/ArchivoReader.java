package Ejercicio1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Class that reads and displays the content of a text file based on user input.
 */
public class ArchivoReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String basePath = "C:\\Users\\CYS\\Desktop\\semestre 4\\";

        try {
            System.out.print("Ingrese el número del archivo a leer: ");
            int numeroArchivo = scanner.nextInt();
            File archivo = new File(basePath + "archivo" + numeroArchivo + ".txt");

            if (!archivo.exists()) {
                System.out.println("El archivo no existe.");
                return;
            }

            FileReader reader = new FileReader(archivo);
            int caracter;
            while ((caracter = reader.read()) != -1) {
                System.out.print((char) caracter);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Error de lectura: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
