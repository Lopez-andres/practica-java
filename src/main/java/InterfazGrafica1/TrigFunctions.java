package InterfazGrafica1;

public class TrigFunctions {
    public static void main(String[] args) {
        double degrees = 45.0;

        // convierte grados a radianes
        double radians = Math.toRadians(degrees);

        // metodo sin() para obtener el valor de la funcion seno
        double sinValue = Math.sin(radians);

        // metodo cos() para obtener el valor de la funcion coseno
        double cosValue = Math.cos(radians);

        // metodo tan() para obtener el valor de la funcion tangente
        double tanValue = Math.tan(radians);

        // imprime el valor de la funcion seno
        System.out.println("sin(" + degrees + ") = " + sinValue);

        // imprime el valor de la funcion coseno
        System.out.println("cos(" + degrees + ") = " + cosValue);

        //imprime el valor de la funcion tangente
        System.out.println("tan(" + degrees + ") = " + tanValue);
    }
}
