package Ejercicio10;

public class ExcepCredInvalida extends Exception {

    public ExcepCredInvalida(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "⚠️ Excepción: " + getMessage();
    }
}
