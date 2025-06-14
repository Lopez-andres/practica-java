package EstructuraDatos;

import java.util.HashSet;
import java.util.Set;

public class ejemploHashset2 {

    public static void main(String[] args) {
        Set<String> lista = new HashSet<String>();

        lista.add("a");
        lista.add("b");
        lista.add("c");
        lista.add("d");

        // No se admiten datos repetidos
        lista.add("a");

        for (String dato : lista) {
            System.out.println(dato);
        }
    }
}