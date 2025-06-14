package persistencia_serializacion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Serializacion {
    public static void main(String[] args) throws Exception {
        // Creación de objetos contacto
        Contacto contacto1 = new Contacto();
        Contacto contacto2 = new Contacto();

        //creamos dos fechas de tipo String y las convertimos a Date
        String sDate1 = "20/09/1991";
        Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        String sDate2 = "03/01/2000";
        Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);

        // Modificación de objetos contacto
        // contacto 1
        contacto1.nombre = "Paco";
        contacto1.telefono = "4242";
        contacto1.email = "paco@pacomail.com";
        contacto1.direccion = "calle 1 # 2-3";
        contacto1.nacimiento = date1;
        contacto1.grupo = 21;
        contacto1.deuda = 42.0;

        // contacto 2
        contacto2.nombre = "Pepe";
        contacto2.telefono = "2424";
        contacto2.email = "pepe@pepemail.com";
        contacto2.direccion = "calle 4 # 5-6";
        contacto2.nacimiento = date2;
        contacto2.grupo = 42;
        contacto2.deuda = 21.0;

        /*Escritura de datos (serialización)*/
        ContactoOutput salida;
        salida = new ContactoOutput();

        //guardar en archivo (serializacion)
        salida.abrir();
        salida.escribir(contacto1);
        salida.escribir(contacto2);
        salida.cerrar();

        /*Lectura de datos (deserialización)*/
        int idx = 0;
        HashMap<Integer, Contacto> contactos = new HashMap<>();
        Contacto temp;
        ContactoInput entrada;

        entrada = new ContactoInput();
        entrada.abrir();
        do {
            temp = entrada.leer();
            /*Almacenamiento en un HashMap*/
            contactos.put(idx, temp);
            idx++;
        } while (temp != null);

        /*Imprime el contenido del HashMap*/
        System.out.println(contactos.get(0));
        System.out.println(contactos.get(1));

        /*contactos leídos*/
        Contacto contactoleido1 = contactos.get(0);
        Contacto contactoleido2 = contactos.get(1);

        /*atributos de los contactos leídos*/
        String pattern = "dd/MM/yyyy";
        DateFormat df = new SimpleDateFormat(pattern);

        System.out.println("Contacto 1 leído del Hashmap");
        System.out.println(contactoleido1.nombre);
        System.out.println(contactoleido1.telefono);
        System.out.println(contactoleido1.email);
        System.out.println(contactoleido1.direccion);
        System.out.println(df.format(contactoleido1.nacimiento));
        System.out.println(contactoleido1.grupo);
        System.out.println(contactoleido1.deuda);
        System.out.println(contactoleido1.getnombre());

        System.out.println("\nContacto 2 leído del Hashmap");
        System.out.println(contactoleido2.nombre);
        System.out.println(contactoleido2.telefono);
        System.out.println(contactoleido2.email);
        System.out.println(contactoleido2.direccion);
        System.out.println(df.format(contactoleido2.nacimiento));
        System.out.println(contactoleido2.grupo);
        System.out.println(contactoleido2.deuda);
        System.out.println(contactoleido2.getnombre());
    }
}
