package Ejercicio1;

/**
 * Class that calculates the average of three grades and assigns a letter grade.
 */
public class PromedioCalculator {
    private final double nota1;
    private final double nota2;
    private final double nota3;

    private double promedio;
    private String calificacion;

    private static final int TOTAL_NOTAS = 3;

    public PromedioCalculator(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    /**
     * Calculates the average of the three grades.
     */
    public void calcularPromedio() {
        this.promedio = (nota1 + nota2 + nota3) / TOTAL_NOTAS;
    }

    /**
     * Assigns a letter grade based on the average.
     */
    public void asignarCalificacion() {
        if (promedio >= 0.0 && promedio < 3.0) {
            calificacion = "D";
        } else if (promedio >= 3.0 && promedio < 4.0) {
            calificacion = "B";
        } else if (promedio >= 4.0 && promedio <= 5.0) {
            calificacion = "E";
        } else {
            calificacion = "Nota inválida";
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public String getCalificacion() {
        return calificacion;
    }
}
