/*
 * Ejercicio 2.16
 * Para aprobar el curso se valorará la nota del examen, la valoración del trabajo
 * en clase y la nota de un trabajo práctico. Aprobarán los alumnos 
 * que estén en alguna de las siguientes situaciones: 
 *  Nota examen mayor o igual a 5 
 *  Nota examen entre 4 y 5, trabajo en clase mayor que cinco y trab. práctico mayor que 5. 
 *  Nota examen entre 4 y 5, y una nota mayor que 8 o en el trabajo práctico o en la valoración del trabajo en clase. 
 * Diseñar un algoritmo que lea la nota del examen, la valoración del trabajo en clase
 * y la nota del trabajo práctico y saque por pantalla si está aprobado o no, 
 * todo en con una sola sentencia condicional.
 * @autor: Borja Costa Rojo
 * @fecha 02/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_16 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { // Iniciamos Scanner
            
            // Pedimos nota de examen
            System.out.print("Introduce la nota del examen: ");
            double examen = entrada.nextDouble();
            
            // Pedimos nota de trabajo
            System.out.print("Introduce la valoración del trabajo en clase: ");
            double clase = entrada.nextDouble();
            
            // Pedimos nota de la practica
            System.out.print("Introduce la nota del trabajo práctico: ");
            double practico = entrada.nextDouble();
            
            // ENTENCIA CONDICIONAL:
            if (examen >= 5 || 
               ((examen >= 4 && examen < 5) && (clase > 5 && practico > 5)) || 
               ((examen >= 4 && examen < 5) && (clase > 8 || practico > 8))) {
                
                System.out.println("Resultado: APROBADO");
                
            } else {
                System.out.println("Resultado: SUSPENSO");
            }
            
        }
    }
}

