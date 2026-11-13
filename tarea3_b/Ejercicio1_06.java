/*
 * Ejercicio 1.06
 * Programa que muestre los número primos comprendidos entre 2 y 1000. Hacer los
 * bucles con un número mínimo de iteraciones (se permite el uso de break) sabiendo que:
 * - Un número primo es solo divisible por 1 y el mismo.
 * - Los números primos son todos impares salvo el 2.
 * - Los divisores de un número siempre son menores que la mitad de dicho número (salvo el mismo).
 * - Si un número no es divisible por 2 ya no va a serlo por ningún otro número par.
 * @autor: Borja Costa Rojo
 * @fecha 7/11/2026
*/
package trimestre1.tarea3_b;

public class Ejercicio1_06 {

    public static void main(String[] args) {
        System.out.println("Números primos entre 2 y 1000:");

        // El 2 es el único primo par, lo sacamos directamente
        System.out.print("2 ");

        // Recorre números IMPARES del 3 al 1000
        for (int n = 3; n <= 1000; n += 2) {

            boolean esPrimo = true; // Bandera: asumimos que es primo hasta que se demuestre lo contrario

            // Solo prueba DIVISORES IMPARES hasta la mitad
            for (int d = 3; d <= n / 2; d += 2) {

                if (n % d == 0) { // Si la división es exacta, hemos pillado un divisor
                    esPrimo = false;
                    break; // Dejamos de buscar
                }
            }

            // Si nadie logró dividirlo, sigue siendo true: es primo
            if (esPrimo) {
                System.out.print(n + " ");
            }
        }
        
        System.out.println();
    }
}
