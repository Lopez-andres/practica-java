package persistencia_serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ArchivoBinarioExample {
    public static void main(String[] args) {
        //Escribir en un archivo binario
        try(FileOutputStream fos = new FileOutputStream("datos.bin");){
            String mensaje = "Hola mundo!";
            fos.write(mensaje.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer desde un archivo binario
        try(FileInputStream fis = new FileInputStream("datos.bin");){
            byte[] buffer = new byte[1024];
            int bytesRead = fis.read(buffer);
            String mensaje = new String(buffer,0);
            System.out.println(mensaje);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
