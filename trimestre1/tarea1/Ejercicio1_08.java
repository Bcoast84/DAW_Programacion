/* 
* Ejercicio 1.08
 * Cálculo de edad media de un conjunto de personas
 * @autor: Borja Costa Rojo
 * @fecha: 27/09/2026
 */
package trimestre1.tarea1;

import java.util.Scanner;

public class Ejercicio1_08 {
    public static void main(String[] args) {
        final int TOTAL_PERSONAS = 4; // Definimos total personas por si en el futuro cambiamos el total.

        try (Scanner teclado = new Scanner(System.in)) {
            int suma = 0;

            for (int i = 1; i <= TOTAL_PERSONAS; i++) { // Mientras i sea menor o igual a 4, pedimos la edad de cada persona y la sumamos.
                System.out.printf("Introduce edad %d: ", i);
                suma += teclado.nextInt();
            }

            double media = (double) suma / TOTAL_PERSONAS;
            System.out.printf("La media de edad es: %.2f años%n", media);
        }
    }
}