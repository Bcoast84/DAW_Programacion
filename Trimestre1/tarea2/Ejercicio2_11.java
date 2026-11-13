/*
 * Ejercicio 2.11
 * Leer un número y decir si es múltiplo de 2, de 3 y/o de 10.  
 * Si no es múltiplo de 2 ya no hay que mirar si lo es de 10.
 * @autor: Borja Costa Rojo
 * @fecha 02/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_11 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { //Iniciamos Scanner
            
            // Pedimos el número entero.
            System.out.print("Introduce un número entero: ");
            int numero = entrada.nextInt();
            
            // Comprobamos si es múltiplo de 2
            if (numero % 2 == 0) {
                System.out.println("Es múltiplo de 2.");
                
                // Solo si es múltiplo de 2, comprobamos si también lo es de 10
                if (numero % 10 == 0) {
                    System.out.println("Es múltiplo de 10.");
                } else {
                    System.out.println("NO es múltiplo de 10.");
                }
                
            } else {
                System.out.println("NO es múltiplo de 2 (por tanto, tampoco de 10).");
            }
            
            // La comprobación del 3 es independiente
            if (numero % 3 == 0) {
                System.out.println("Es múltiplo de 3.");
            } else {
                System.out.println("NO es múltiplo de 3.");
            }
            
        }
    }
}