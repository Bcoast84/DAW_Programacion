/*
 * Ejercicio 2.04
 * Leer dos números enteros y diga si los dos son mayores de 10 o no lo son.
 * @autor: Borja Costa Rojo
 * @fecha 01/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_04 {

    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { // Iniciamos Scanner
            
            // Pedimos el primer número
            System.out.print("Introduce el primer número entero: ");
            int numero1 = entrada.nextInt();
            
            // Pedimos el segundo número
            System.out.print("Introduce el segundo número entero: ");
            int numero2 = entrada.nextInt();
            
            // Comprobamos si el primero es mayor que 10 Y (&&) el segundo también lo es
            if (numero1 > 10 && numero2 > 10) {
                System.out.println("Los dos números SÍ son mayores de 10.");
            } else {
                System.out.println("Los dos números NO son mayores de 10.");
            }
            
        } 
    }
}