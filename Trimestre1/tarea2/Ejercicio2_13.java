/*
 * Ejercicio 2.13
 * Leer tres números enteros y diga hay alguno mayor que cero, pero no todos.
 * @autor: Borja Costa Rojo
 * @fecha 02/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_13 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) {
            
            System.out.print("Introduce el primer número: ");
            int num1 = entrada.nextInt();
            
            System.out.print("Introduce el segundo número: ");
            int num2 = entrada.nextInt();
            
            System.out.print("Introduce el tercer número: ");
            int num3 = entrada.nextInt();
            
            // Condición 1: Que haya al menos uno positivo (num1 > 0 || num2 > 0 || num3 > 0)
            // Condición 2: Que NO todos sean positivos (es decir, que haya al menos uno <= 0)
            if ((num1 > 0 || num2 > 0 || num3 > 0) && !(num1 > 0 && num2 > 0 && num3 > 0)) {
                System.out.println("Hay algún número mayor que cero, pero no todos.");
            } else {
                System.out.println("No se cumple: o bien ninguno es mayor que cero, o todos lo son.");
            }
            
        }
    }
}


