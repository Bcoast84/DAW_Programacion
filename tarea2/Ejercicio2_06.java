/*
 * Ejercicio 2.06
 * Leer un número entero y decir si está comprendido entre 10 y 20 (ambos incluidos).
 * @autor: Borja Costa Rojo
 * @fecha 02/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_06 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();
        
        // Comprobamos si es mayor o igual a 10 Y menor o igual a 20
        if (numero >= 10 && numero <= 20) {
            System.out.println("El número " + numero + " está comprendido entre 10 y 20.");
        } else {
            System.out.println("El número " + numero + " NO está comprendido entre 10 y 20.");
        }
        
        sc.close();
    }
}