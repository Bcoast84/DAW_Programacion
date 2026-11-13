/*
 * Ejercicio 2.08
 * Leer dos números y decir si el primero es mayor que el segundo, si es menor o si los dos números son iguales.
 * @autor: Borja Costa Rojo
 * @fecha 02/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_08 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { //Se inicia Scanner
            
            // Se pide el primer número
            System.out.print("Introduce el primer número: ");
            int num1 = entrada.nextInt();
            
            // Se pide el segundo número
            System.out.print("Introduce el segundo número: ");
            int num2 = entrada.nextInt();
            
            // Evaluamos los tres casos posibles
            if (num1 > num2) {
                System.out.println("El primer número (" + num1 + ") es MAYOR que el segundo (" + num2 + ").");
            } else if (num1 < num2) {
                System.out.println("El primer número (" + num1 + ") es MENOR que el segundo (" + num2 + ").");
            } else {
                System.out.println("Los dos números son IGUALES (" + num1 + ").");
            }
            
        }
    }
}