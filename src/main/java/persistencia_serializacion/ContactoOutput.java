package persistencia_serializacion;

import java.io.*;

public class ContactoOutput {
    private FileOutputStream file; //se encarga de abrir el archivo binario para escritura
    private ObjectOutputStream output; //se encarga de escribir en el archivo binario, usando la clase ObjectOutputStream

    //abre el archivo cliente.ser para escribir
    public void abrir() throws IOException{
        file = new FileOutputStream("Clientes.ser");
        output = new ObjectOutputStream(file);
    }

    //cierra el archivo cliente.ser
    public void cerrar() throws IOException{
        if(output!=null)
            output.close();
    }

    //Escribe un objeto Contacto en el archivo usando writeObject()
    public void escribir(Contacto contacto) throws IOException{
        if(output!=null)
            output.writeObject(contacto);
    }
}
