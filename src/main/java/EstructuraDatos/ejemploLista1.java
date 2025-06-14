package EstructuraDatos;

import java.util.ArrayList;
import java.util.List;

public class ejemploLista1 {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>();

        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("uno"); // Se permiten elementos repetidos

        System.out.println(lista);

        lista.remove("dos");      // Elimina el elemento "dos"
        lista.remove(0);          // Elimina el elemento en la posición 0 ("uno")

        System.out.println("size: " + lista.size());
        System.out.println("index: " + lista.indexOf("tres"));

        System.out.println(lista);
    }
}
