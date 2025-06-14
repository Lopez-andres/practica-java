package Ejercicio2;

/**
 * Class that compares two integer values and determines which is greater or lesser.
 */
public class ValueComparator {

    private final int valor1;
    private final int valor2;

    private String mayor = "Both values are equal";
    private String menor = "Both values are equal";

    /**
     * Constructor to initialize the two values.
     * @param valor1 First integer value.
     * @param valor2 Second integer value.
     */
    public ValueComparator(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    /**
     * Determines the greater of the two values.
     */
    public void calcularMayor() {
        if (valor1 > valor2) {
            mayor = "Value 1 = " + valor1;
        } else if (valor2 > valor1) {
            mayor = "Value 2 = " + valor2;
        }
    }

    /**
     * Determines the lesser of the two values.
     */
    public void calcularMenor() {
        if (valor1 > valor2) {
            menor = "Value 2 = " + valor2;
        } else if (valor2 > valor1) {
            menor = "Value 1 = " + valor1;
        }
    }

    public String getMayor() {
        return mayor;
    }

    public String getMenor() {
        return menor;
    }

    /**
     * Checks if both values are equal.
     * @return true if values are equal, false otherwise.
     */
    public boolean sonIguales() {
        return valor1 == valor2;
    }
}

