package Ejercicio5;

/**
 * Clase que encapsula una variable numérica y ofrece
 * una operación de potencia cuadrada sobre la misma.
 */
public class A {
    private double variable;

    // Constructor por defecto
    public A() {
        this.variable = 0.0;
    }

    /**
     * Calcula el cuadrado de un número.
     * @param valor número a elevar al cuadrado
     * @return resultado de valor^2
     */
    public double calcularCuadrado(double valor) {
        return Math.pow(valor, 2.0);
    }

    // Getters y Setters
    public double getVariable() {
        return variable;
    }

    public void setVariable(double variable) {
        this.variable = variable;
    }
}
