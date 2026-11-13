/*
 * Ejercicio 2.12
 * Leer tres números enteros y diga hay alguno mayor que cero.
 * @autor: Borja Costa Rojo
 * @fecha 02/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_12 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { //Se inicia el Scanner
            
            // Se pide el primer número
            System.out.print("Introduce el primer número: ");
            int num1 = entrada.nextInt();
            
            // Se pide el segundo número
            System.out.print("Introduce el segundo número: ");
            int num2 = entrada.nextInt();
            
            // Se pide el tercer número
            System.out.print("Introduce el tercer número: ");
            int num3 = entrada.nextInt();
            
            // Si al menos uno de los tres es mayor que cero, la condición se cumple.
            if (num1 > 0 || num2 > 0 || num3 > 0) {
                System.out.println("Hay al menos un número mayor que cero.");
            } else {
                System.out.println("Ninguno de los tres números es mayor que cero.");
            }
            
        }
    }
}