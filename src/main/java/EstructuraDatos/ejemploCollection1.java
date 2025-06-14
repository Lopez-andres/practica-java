package EstructuraDatos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ejemploCollection1 {

    public static void main(String[] args) {
        // Se crea un objeto Collection de elementos tipo String
        Collection<String> lista = new ArrayList<String>();

        // Se agregan elementos a la colección
        lista.add("uno");
        lista.add("");
        lista.add("dos");

        // Se utiliza un for each para recorrer la lista e imprimir, para cada item en la lista este se imprime
        for (String item : lista) {
            System.out.println(item);
        }

        // Se crea un iterador para revisar la colección
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) { //mientras el iterador tenga un proximo elemento al que apuntar
            String s = it.next(); //devuelve el proximo elemento
            if (s.equals("")) it.remove(); //si s es nulo, ese elemento se remueve de la lista
        }

        // Imprime nuevamente la lista sin el elemento vacío
        for (String item : lista) {
            System.out.println(item);
        }
    }
}

