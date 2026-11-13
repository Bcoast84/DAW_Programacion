/*
 * Ejercicio 2.20
 * La tabla siguiente representa las horas de salida de un bus. 
 * Diseña un algoritmo al que se le introduzca el día (1-7) y la hora (9-14), 
 * verifique la entrada y nos informe si hay bus o no. Hacer una primera condición
 * que haga la verificación de la entrada de datos y otra única condición para ver si hay bus.
 * @autor: Borja Costa Rojo
 * @fecha 03/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_20 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { // Iniciamos Scanner
            
            System.out.print("Introduce el día de la semana (1 = Lunes, ..., 7 = Domingo): ");
            int dia = entrada.nextInt();
            
            System.out.print("Introduce la hora (9-14): ");
            int hora = entrada.nextInt();
            
            // 1. PRIMERA CONDICIÓN: Verificación de entrada de datos
            if (dia >= 1 && dia <= 7 && hora >= 9 && hora <= 14) {
                
                // 2. SEGUNDA Y ÚNICA CONDICIÓN: Comprobación de si hay bus
                if (hora == 10 || 
                   (hora == 14 && dia <= 6) || 
                   (dia == 1 && hora == 9) || 
                   (dia == 6 && hora == 12) || 
                   (dia == 7 && hora >= 11 && hora <= 13)) {
                    
                    System.out.println("SÍ hay servicio de bus.");
                } else {
                    System.out.println("NO hay servicio de bus a esa hora.");
                }
                
            } else {
                System.out.println("Error: Los datos introducidos no son válidos (Día debe ser 1-7 y Hora 9-14).");
            }
            
        }
    }
}