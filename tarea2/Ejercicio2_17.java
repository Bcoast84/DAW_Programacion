/*
 * Ejercicio 2.17
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

public class Ejercicio2_17 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { // Se inicia el Scanner
            
            // Pedimos las horas
            System.out.print("Introduce las horas (0-23): ");
            int horas = entrada.nextInt();
            
            // Pedimos los minutos
            System.out.print("Introduce los minutos (0-59): ");
            int minutos = entrada.nextInt();
            
            // Pedimos los segundos
            System.out.print("Introduce los segundos (0-59): ");
            int segundos = entrada.nextInt();
            
            // Verificamos si los valores corresponden a una hora válida
            if (horas >= 0 && horas <= 23 && 
                minutos >= 0 && minutos <= 59 && 
                segundos >= 0 && segundos <= 59) {
                
                // Cálculo de los segundos totales
                int totalSegundos = (horas * 3600) + (minutos * 60) + segundos;
                
                System.out.println("Hora correcta (" + horas + ":" + minutos + ":" + segundos + ")");
                System.out.println("Total de segundos transcurridos desde el comienzo del día: " + totalSegundos);
                
            } else {
                System.out.println("Error: Los valores introducidos (" + horas + ":" + minutos + ":" + segundos + ") no forman una hora válida.");
            }
            
        }
    }
}