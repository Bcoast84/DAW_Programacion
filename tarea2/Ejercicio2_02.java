/*
 * Ejercicio 2.02 
 * Leer dos números enteros y muestre si el primero es mayor que el segundo.
 * @autor: Borja Costa Rojo
 * @fecha 01/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_02 {

    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { // Abrimos el Scanner
            
            // Pedimos y leemos el primer número
            System.out.print("Introduce el primer número entero: ");
            int numero1 = entrada.nextInt();
            
            // Pedimos y leemos el segundo número
            System.out.print("Introduce el segundo número entero: ");
            int numero2 = entrada.nextInt();
            
            // Evaluamos si el primero es mayor que el segundo
            if (numero1 > numero2) {
                System.out.println("El primer número (" + numero1 + ") SÍ es mayor que el segundo (" + numero2 + ").");
            } else {
                System.out.println("El primer número (" + numero1 + ") NO es mayor que el segundo (" + numero2 + ").");
            }
            
        } 
    }
}