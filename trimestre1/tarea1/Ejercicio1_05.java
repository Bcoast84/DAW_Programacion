/* 
* Ejercicio 1.05
* Conversión de datos climatológicos
* @autor: Borja Costa Rojo
* @fecha 26/09/2026
*/
package trimestre1.tarea1;

import java.util.Scanner;

public class Ejercicio1_05 {
    public static void main(String[] args) {
         final double CM_POR_PULGADA = 25.5 / 10.0;

        try (Scanner teclado = new Scanner(System.in)) {
            // Parte 1: Temperatura
            System.out.print("Introduce la temperatura en ºC: ");
            double celsius = teclado.nextDouble();
            double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
            System.out.printf("Temperatura en Fahrenheit: %.2f ºF%n", fahrenheit);

            // Parte 2: Lluvia
            System.out.print("Introduce la lluvia registrada en pulgadas: ");
            double pulgadas = teclado.nextDouble();
            double centimetros = pulgadas * CM_POR_PULGADA;
            System.out.printf("Equivalente en agua: %.1f cm%n", centimetros);
        }
    }
}