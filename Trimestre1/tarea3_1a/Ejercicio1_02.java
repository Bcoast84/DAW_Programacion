/*
 * Ejercicio 1.02
 * Mostrar por pantalla los n primeros números naturales, 
 * siendo n el valor tecleado previamente.
 * @autor: Borja Costa Rojo
 * @fecha 29/10/2026
*/

package trimestre1.tarea3a;

import java.util.Scanner;

public class Ejercicio1_02 {
    public static void main(String[] args) {
        
        
        int count = 0;
        
        try (Scanner entrada = new Scanner(System.in)) { // Iniciamos Scanner
            
            System.out.print("Introduce un número natural:  ");
            int n = entrada.nextInt(); // pedimos n
            
            while (count <= n){ //Mientras el contador no valga n, imprimir contador
                System.out.println(count);
                count++;
            }
        }
        
    }  
}
