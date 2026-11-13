/*
 * Ejercicio 2.05
 * Leer dos números enteros y diga si al menos uno de los dos es mayor de 10.
 * @autor: Borja Costa Rojo
 * @fecha 01/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_05 {

    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { // Iniciamos Scanner
            
            // Pedimos el primer número
            System.out.print("Introduce el primer número entero: ");
            int numero1 = entrada.nextInt();
            
            // Pedimos el segundo número
            System.out.print("Introduce el segundo número entero: ");
            int numero2 = entrada.nextInt();
            
            // Comprobamos si el primero es mayor que 10 o (||) el segundo lo es
            if (numero1 > 10 || numero2 > 10) {
                System.out.println("Al menos uno de los números es mayor de 10.");
            } else {
                System.out.println("Ninguno de los números es mayor de 10.");
            }
            
        } 
    }
}

// Version 2.0
/*
        
        try (Scanner entrada = new Scanner(System.in)) { // Iniciamos Scanner
            
            // Pedimos el primer número
            System.out.print("Introduce el primer número entero: ");
            int numero1 = entrada.nextInt();
            
            // Pedimos el segundo número
            System.out.print("Introduce el segundo número entero: ");
            int numero2 = entrada.nextInt();
            
            // Evaluamos las condiciones de forma ordenada:
            if (numero1 > 10 && numero2 > 10) {
                // Se cumplen las dos
                System.out.println("Los dos números SÍ son mayores de 10.");
                
            } else if (numero1 > 10) {
                // Solo se cumple la del primero
                System.out.println("Solo el primer número es mayor de 10.");
                
            } else if (numero2 > 10) {
                // Solo se cumple la del segundo
                System.out.println("Solo el segundo número es mayor de 10.");
                
            } else {
                // No se cumple ninguna
                System.out.println("Ninguno de los dos números es mayor de 10.");
            }
            
        }
    }
}
*/