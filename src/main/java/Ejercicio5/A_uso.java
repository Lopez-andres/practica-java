package Ejercicio5;

/**
 * Clase de prueba que demuestra el uso de la clase A,
 * modificando su atributo encapsulado y aplicando una operación matemática.
 */
public class A_uso {
    public static void main(String[] args) {
        A a = new A();

        // Valor original de la variable
        System.out.println("Initial variable value: " + a.getVariable());

        // Asignar un nuevo valor a la variable
        double nuevoValor = 6.48074069840786;
        a.setVariable(nuevoValor);

        System.out.println("Updated variable value: " + a.getVariable());

        // Calcular el cuadrado usando el método de la clase A
        double resultado = a.calcularCuadrado(a.getVariable());
        System.out.println("Square of the variable: " + resultado);

        System.exit(0);
    }
}

