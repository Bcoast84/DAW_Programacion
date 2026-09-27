/* 
 * Cálculo de la hipotenusa.
 * Autor: Borja Costa Rojo
 * Fecha: 27/09/2026
 */
package trimestre1.tarea1;

import java.util.Scanner;

public class Ejercicio1_10 {
        public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Introduce la longitud del primer cateto: ");
            double c1 = teclado.nextDouble();

            System.out.print("Introduce la longitud del segundo cateto: ");
            double c2 = teclado.nextDouble();

            if (c1 <= 0 || c2 <= 0) {
                System.out.println("Error: las longitudes deben ser positivas.");
            } else {
                // Cálculo de raiz cuadrada de los cuadrados con Math.hypot, que es más preciso y evita desbordamientos
                double hipotenusaDirecta = Math.hypot(c1, c2);

                /* Cálculo de raiz cuadrada de los cuadrados con Math.sqrt, menos preciso y puede dar problemas de desbordamiento con números grandes.
                double hipotenusaFormula = Math.sqrt((c1 * c1) + (c2 * c2));
                //System.out.printf("Hipotenusa (con fórmula): %.4f%n", hipotenusaFormula); 
                */

                System.out.printf("Hipotenusa (con Math.hypot): %.4f%n", hipotenusaDirecta); // float con 4 decimales
            }
        }
    }
}