/*
 * Ejercicio 2.24
 * Introduciendo dos fechas (día, mes, año), hacer un programa que nos diga cuál
 * de las dos es mayor (agrupa las condiciones de día, mes y año en una sola 
 * sentencia condicional). Suponemos que se introducen fechas válidas y no 
 * empleamos las clases de fecha de Java.
 * @autor: Borja Costa Rojo
 * @fecha 10/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_24 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { // Iniciamos Scanner
            
            System.out.println("--- PRIMERA FECHA ---");
            System.out.print("Día: ");
            int dia1 = entrada.nextInt();
            System.out.print("Mes: ");
            int mes1 = entrada.nextInt();
            System.out.print("Año: ");
            int anio1 = entrada.nextInt();
            
            System.out.println("\n--- SEGUNDA FECHA ---");
            System.out.print("Día: ");
            int dia2 = entrada.nextInt();
            System.out.print("Mes: ");
            int mes2 = entrada.nextInt();
            System.out.print("Año: ");
            int anio2 = entrada.nextInt();
            
            // UNA SOLA SENTENCIA CONDICIONAL AGRUPANDO DÍA, MES Y AÑO:
            if ((anio1 > anio2) || 
                (anio1 == anio2 && mes1 > mes2) || 
                (anio1 == anio2 && mes1 == mes2 && dia1 > dia2)) {
                
                System.out.println("\nLa PRIMERA fecha (" + dia1 + "/" + mes1 + "/" + anio1 + ") es MAYOR (más reciente).");
                
            } else if (dia1 == dia2 && mes1 == mes2 && anio1 == anio2) {
                
                System.out.println("\nAmbas fechas son IGUALES.");
                
            } else {
                
                System.out.println("\nLa SEGUNDA fecha (" + dia2 + "/" + mes2 + "/" + anio2 + ") es MAYOR (más reciente).");
                
            }
            
        }
    }
}