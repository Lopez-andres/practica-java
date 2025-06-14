package EstructuraDatos;

import java.util.*;

class queueExample {
    public static void main(String args[]) {
        PriorityQueue<String> queue = new PriorityQueue<String>();

        queue.add("Juan");
        queue.add("Juana");
        queue.add("Maria");
        queue.add("Laura");
        queue.add("Pedro");

        System.out.println("cabeza (head): " + queue.element());
        System.out.println("cabeza (head): " + queue.peek());

        System.out.println("iterando sobre los elementos de la cola:");
        Iterator<String> itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        queue.remove();
        queue.poll();

        System.out.println("después de remover dos elementos de la cola:");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
