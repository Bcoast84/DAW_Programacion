/*
 * Ejercicio 2.25
 * Realizar un programa que se le introduzca una nota (un valor entero entre 0 y 10)
 * y nos muestre por pantalla la nota final en texto, con la siguiente 
 * equivalencia: Muy deficiente (0,1,2), Insuficiente (3,4), 
 * Aprobado (5,6), Notable (7,8) y Sobresaliente (9,10).  
 * Si estás pensando hacerlo con muchos ‘if’ anidados sobre la misma variable… 
 * hay una forma más cómoda.
 * @autor: Borja Costa Rojo
 * @fecha 10/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_25 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { // Iniciamos scanner
            
            System.out.print("Introduce la nota entera (0-10): ");
            int nota = entrada.nextInt();
            
            // Muy deficiente (0, 1, 2)
            if (nota >= 0 && nota <= 2) {
                System.out.println("Muy deficiente");
            }
            
            // Insuficiente (3, 4)
            if (nota >= 3 && nota <= 4) {
                System.out.println("Insuficiente");
            }
            
            // Aprobado (5, 6)
            if (nota >= 5 && nota <= 6) {
                System.out.println("Aprobado");
            }
            
            // Notable (7, 8)
            if (nota >= 7 && nota <= 8) {
                System.out.println("Notable");
            }
            
            // Sobresaliente (9, 10)
            if (nota >= 9 && nota <= 10) {
                System.out.println("Sobresaliente");
            }
            
            // Validación de error (fuera de rango)
            if (nota < 0 || nota > 10) {
                System.out.println("Error: La nota debe estar entre 0 y 10.");
            }
            
        }
    }
}