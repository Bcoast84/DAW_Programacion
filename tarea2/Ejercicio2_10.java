/*
 * Ejercicio 2.10
 * Leer dos números enteros y diga si el menor de ellos es divisor del mayor
 * (prevenir divisiones por cero, que causan error) 
 * Repasar operadores en cortocircuito para hacer un solo if.
 * @autor: Borja Costa Rojo
 * @fecha 02/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_10 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { //Se inicia Scanner
            
            // Se pide el primer número
            System.out.print("Introduce el primer número: ");
            int num1 = entrada.nextInt();
            
            // Se pide el segundo número
            System.out.print("Introduce el segundo número: ");
            int num2 = entrada.nextInt();
            
            // Caso A: num1 es el menor (o igual), no es 0, y divide a num2.
            // Caso B: num2 es el menor, no es 0, y divide a num1.
            if ((num1 <= num2 && num1 != 0 && num2 % num1 == 0) || 
                (num2 < num1 && num2 != 0 && num1 % num2 == 0)) {
                
                System.out.println("El menor de los dos números es divisor del mayor.");
            } else {
                System.out.println("El menor NO es divisor del mayor (o el menor es cero).");
            }
            
        }
    }
}