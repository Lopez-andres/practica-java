package EstructuraDatos;

import java.util.*;

class TreeSetExample {
    public static void main(String args[]) {
        // Creating and adding elements
        TreeSet<String> al = new TreeSet<String>();
        al.add("Hugo");
        al.add("Paco");
        al.add("Luis");
        al.add("Donald");

        // Traversing elements
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
