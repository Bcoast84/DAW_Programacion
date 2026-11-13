/*
 * Ejercicio 2.01 
 * Leer un número entero y determinar si es mayor de 10.
 * @autor: Borja Costa Rojo
 * @fecha 01/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_01 {

    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { // Abrimos el Scanner
            
            // Pedimos el número al usuario
            System.out.print("Por favor, introduce un número entero: ");
            int numero = entrada.nextInt();
            
            // Evaluamos si es mayor de 10
            if (numero > 10) {
                System.out.println("El número " + numero + " SÍ es mayor de 10.");
            } else {
                System.out.println("El número " + numero + " NO es mayor de 10.");
            }
            
        }
    }
}