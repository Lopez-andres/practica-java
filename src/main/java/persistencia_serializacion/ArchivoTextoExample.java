package persistencia_serializacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoTextoExample {
    public static void main(String[] args) {
        // Escribir en un archivo de texto
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("datos.txt"))) {
            writer.write("Hola, mundo!");
            writer.newLine();
            writer.write("Esto es una prueba");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer desde un archivo de texto
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
