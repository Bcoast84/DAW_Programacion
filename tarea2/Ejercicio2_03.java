/*
 * Ejercicio 2.03
 * Leer un número entero y de determinar si se trata de un número par o impar.
 * @autor: Borja Costa Rojo
 * @fecha 01/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_03 {

    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { //Iniciamos scaner.
            
            // Pedimos el número al usuario
            System.out.print("Introduce un número entero: ");
            int numero = entrada.nextInt();
            
            // Evaluamos si el resto de dividirlo entre 2 es igual a 0
            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es PAR.");
            } else {
                System.out.println("El número " + numero + " es IMPAR.");
            }
            
        } 
    }
}