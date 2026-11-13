/*
 * Ejercicio 2.21
 * Realizar un programa al que se le introduzca la hora del día (0 –23) y nos diga
 * que días de la semana hay salida de bus (utilizar la tabla anterior).
 * @autor: Borja Costa Rojo
 * @fecha 03/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_21 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { // Iniciamos Scanner
            
            System.out.print("Introduce la hora del día (0-23): ");
            int hora = entrada.nextInt();
            
            // Validación de la hora
            if (hora < 0 || hora > 23) {
                System.out.println("Error: La hora debe estar entre 0 y 23.");
            }
            
            // Si la hora está dentro de las que tienen algún servicio (9 a 14)
            if (hora >= 9 && hora <= 14) {
                
                System.out.print("A las " + hora + ":00 hay bus los: ");
                
                // Lunes: 9:00, 10:00 y 14:00
                if (hora == 9 || hora == 10 || hora == 14) {
                    System.out.print("Lunes ");
                }
                
                // Martes, Miércoles, Jueves y Viernes: 10:00 y 14:00
                if (hora == 10 || hora == 14) {
                    System.out.print("Martes Miércoles Jueves Viernes ");
                }
                
                // Sábado: 10:00, 12:00 y 14:00
                if (hora == 10 || hora == 12 || hora == 14) {
                    System.out.print("Sábado ");
                }
                
                // Domingo: de 10:00 a 13:00
                if (hora >= 10 && hora <= 13) {
                    System.out.print("Domingo");
                }
                
                System.out.println(); // Salto de línea final
            }
            
            // Si la hora no tiene ningún bus
            if ((hora >= 0 && hora <= 8) || (hora >= 15 && hora <= 23)) {
                System.out.println("A las " + hora + ":00 NO hay servicio de bus ningún día.");
            }
            
        }
    }
}