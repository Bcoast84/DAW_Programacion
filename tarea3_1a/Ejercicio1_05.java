/*
 * Ejercicio 1.05
 * Sumar una cantidad de números que se van introduciendo, 
 * siempre que sean positivos hasta que se teclee el -1. 
 * @autor: Borja Costa Rojo
 * @fecha 29/10/2026
*/
package trimestre1.tarea3a;

import java.util.Scanner;

public class Ejercicio1_05 {

    public static void main(String[] args) {
        
        int m = 0;
        int n;
        
        try (Scanner entrada = new Scanner(System.in)) { // Iniciamos Scanner
            
            System.out.println("Introduce un número (para salir -1): ");
            n = entrada.nextInt();
            
            while (n != -1){ // mientras n sea distinto de -1
                m = m+n; // a m se le suma n
                System.out.println("Introduce otro número (para salir -1): ");
                n = entrada.nextInt();
            } // se muestra el total
            System.out.println("El total de la suma es: " + m );
        }
    }
}            
