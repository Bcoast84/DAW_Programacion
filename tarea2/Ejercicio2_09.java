/*
 * Ejercicio 2.09
 * Leer dos números enteros y diga si el segundo es divisor del primero 
 * (prevenir divisiones por cero, que causan error) 
 * Repasar operadores en cortocircuito para hacer un solo if.
 * @autor: Borja Costa Rojo
 * @fecha 02/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_09 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)){ // Se inicia Scanner
            
            // Se pide el primer número
            System.out.print("Introduce el primer número (dividendo): ");
            int num1 = entrada.nextInt();
            
            // Se pide el segundo número
            System.out.print("Introduce el segundo número (posible divisor): ");
            int num2 = entrada.nextInt();

            // Si el segundo número es 0, ya no se comprueba si es divisor y salta al else
            if (num2 != 0 && num1 % num2 == 0) {
                System.out.println(num2 + " es divisor de " + num1 + ".");
            } else {
                System.out.println(num2 + " NO es divisor de " + num1 + " (o es cero).");
            }
            
        }
    }
}