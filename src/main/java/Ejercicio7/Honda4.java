package Ejercicio7;

/**
 * Clase concreta que hereda de la clase abstracta Bike.
 * Implementa el método run().
 */
public class Honda4 extends Bike {

    @Override
    void run() {
        System.out.println("running safely");
    }

    public static void main(String[] args) {
        Honda4 obj = new Honda4();
        obj.run(); // Output: running safely
    }
}
