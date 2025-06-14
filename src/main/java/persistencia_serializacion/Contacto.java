package persistencia_serializacion;


/*
* los objetos de la clase Contacto deben ser serializables, es decir
* que se pueden almacenar en un archivo binario, simula la informacion
* de un contacto, todos sus atributos son protected
* lo que indica que se pueden acceder desde otras clases
* */
import java.io.Serializable;
import java.util.Date;

public class Contacto implements Serializable{
    protected String nombre;
    protected String telefono;
    protected String email;
    protected String direccion;
    protected Date nacimiento;
    protected int grupo;
    protected double deuda;

    public String getnombre(){
        String header = "Mi nombre es ";
        return (header + this.nombre);
    }
}

