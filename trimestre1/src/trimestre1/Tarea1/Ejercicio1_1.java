/* 
* Convertir euros a dolares
* Autor: Borja Costa Rojo
* Fecha 25/09/2026
*/
package trimestre1.tarea1;

import java.util.Scanner;

public class Ejercicio1_1 {
    public static void main(String[] args) {
        final double CAMBIO_DOLAR = 1.14; 
        // final hace que sea constante, double el tipo de dato y el nombre en mayúsculas para indicar que es constante.
        try (Scanner teclado = new Scanner(System.in)) { // usamos try con recursos para cerrar el Scanner automáticamente
            System.out.print("Introduce la cantidad en euros: ");
            double euros = teclado.nextDouble(); // variable double y por tanto usamos nextDouble() para leer un número decimal

            double dolares = euros * CAMBIO_DOLAR; // constanntes siempre en mayúsculas, variables en minúsculas.

            System.out.printf("%.2f euros equivalen a %.2f dólares.%n", euros, dolares); 
            // %.2f: reserva un espacio para una variable con dos decimales.
            // otra opción: System.out.println(euros + " euros equivalen a " + dolares + " dólares.");
        }
    }
}