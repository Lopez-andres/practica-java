package Ejercicio6;

/**
 * Clase principal que demuestra la diferencia entre variables de instancia
 * y variables estáticas mediante objetos creados de ClaseA y ClaseAStatic.
 */
public class ClaseB {
    public static void main(String[] args) {
        // Objetos de ClaseA: cada uno tiene su propia copia de la variable 'v'
        ClaseA objeto1 = new ClaseA();
        ClaseA objeto2 = new ClaseA();

        objeto1.v = 3;
        objeto2.v = 5;

        System.out.println("objeto1.v: " + objeto1.v);  // 3
        System.out.println("objeto2.v: " + objeto2.v);  // 5

        // Objetos de ClaseAStatic: comparten la misma variable estática 'v'
        ClaseAStatic objeto3 = new ClaseAStatic();
        ClaseAStatic objeto4 = new ClaseAStatic();

        objeto3.v = 2;
        objeto4.v = 42; // Sobrescribe el valor anterior para todos

        System.out.println("objeto3.v: " + objeto3.v);  // 42
        System.out.println("objeto4.v: " + objeto4.v);  // 42
    }
}
