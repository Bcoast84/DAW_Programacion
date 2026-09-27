/* 
 * Correciones al ejercicio.
 * Autor: Borja Costa Rojo
 * Fecha: 27/09/2026
 */
package trimestre1.tarea1;

import java.util.Scanner;

public class Ejercicio1_9 {
    public static void main(String[] args) {
        // CORRECCIÓN 1: Declarar e inicializar Scanner con try-with-resources evitando fugas de memoria.
        try (Scanner teclado = new Scanner(System.in)) {
            int var1, var2;

            System.out.print("Introduce var1: ");
            var1 = teclado.nextInt();

            System.out.print("Introduce var2: ");
            var2 = teclado.nextInt();

            // CORRECCIÓN 2: Uso de variable temporal 'aux' para no sobrescribir var1
            int aux = var1; // Guardamos el valor original de var1
            var1 = var2;    // Asignamos el valor de var2 a var1
            var2 = aux;     // Asignamos el valor respaldado en aux a var2

            // CORRECCIÓN 3: Concatenar las variables en lugar de imprimir texto literal
            System.out.println("Ahora var1 es igual a " + var1);
            System.out.println("Ahora var2 es igual a " + var2);
        }
    }
}


/*

¿Sería posible intercambiar los valores de dos variables sin usar ninguna
variable adicional? Piensa como hacerlo o busca en internet una solución.

var1 = var1 + var2; // var1 ahora contiene la suma de ambos
var2 = var1 - var2; // Al restar var2 a la suma, var2 obtiene el valor original de var1
var1 = var1 - var2

*/