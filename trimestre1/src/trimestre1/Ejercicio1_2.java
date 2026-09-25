/* 
* Convertir dolares a euros
* Autor: Borja Costa Rojo
* Fecha 25/09/2026
*/
package trimestre1;

import java.util.Scanner;

public class Ejercicio1_2 {
    public static void main(String[] args) {
        final double CAMBIO_DOLAR = 1.14;
        // final hace que sea constante, double el tipo de dato y el nombre en mayúsculas para indicar que es constante.

        try (Scanner teclado = new Scanner(System.in)) { // usamos try con recursos para cerrar el Scanner automáticamente
            System.out.print("Introduce la cantidad en dólares: ");
            double dolares = teclado.nextDouble(); // variable double y por tanto usamos nextDouble() para leer un número decimal

            double euros = dolares / CAMBIO_DOLAR; // constanntes siempre en mayúsculas, variables en minúsculas.

            System.out.printf("%.2f dólares equivalen a %.2f euros.%n", dolares, euros);ç
            // %.2f: reserva un espacio para una variable con dos decimales.
            // otra opción: System.out.println(euros + " euros equivalen a " + dolares + " dólares.");
        }
    }
}