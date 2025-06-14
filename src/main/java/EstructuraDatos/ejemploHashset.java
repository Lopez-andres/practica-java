package EstructuraDatos;

import java.util.HashSet;

public class ejemploHashset {

    public static void main(String[] args) {
        // Declaración del HashSet
        HashSet<String> hset = new HashSet<String>();

        // Adición de elementos al HashSet
        hset.add("Manzana");
        hset.add("Mango");
        hset.add("Uvas");
        hset.add("Naranja");
        hset.add("Higo");

        // Adición de elementos duplicados
        hset.add("Manzana");
        hset.add("Mango");

        // Adición de elementos nulos
        hset.add(null);
        hset.add(null);

        // Impresión de los elementos en el HashSet
        System.out.println(hset);
    }
}
