package persistencia_serializacion;

import java.io.*;

public class ContactoInput {
    private FileInputStream file; //abre el archivo cliente. Ser para lectura
    private ObjectInputStream input; //permite leer objetos desde ese archivo usando readObject().

    //abre el archivo cliente.ser para lectur, usa objectinputstream para leer los objetos serializados
    public void abrir() throws IOException{
        file = new FileInputStream("Clientes.ser");
        input = new ObjectInputStream(file);
    }

    //cierra el flujo de entrada si esta abierto
    public void cerrar() throws IOException{
        if(input!= null)
            input.close();
    }

    //se encarga de leer un objeto de contacto uno por uno
    public Contacto leer() throws IOException,ClassNotFoundException{
        Contacto contacto = null;
        if(input!=null){
            try{
                contacto = (Contacto) input.readObject();
            }catch(EOFException eof){
            }
        }
        return contacto;
    }
}
