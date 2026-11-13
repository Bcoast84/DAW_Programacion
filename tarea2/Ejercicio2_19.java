/*
 * Ejercicio 2.19
 * Realizar un programa que informe si un año introducido previamente es bisiesto o no.
 * Son bisiestos los años múltiplos de 4 que no sean múltiplos de 100. 
 * Como excepción los múltiplos de 400 también son bisiestos. 
 * Se puede hacer una primera versión con varias sentencias condicionales y otra
 * más sofisticada con una sola. No usar las clases de fechas de Java.
 * @autor: Borja Costa Rojo
 * @fecha 03/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_19 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) { // Iniciamos Scanner
            
            System.out.print("Introduce un año: ");
            int anio = entrada.nextInt(); // Usamos 'anio' para evitar la 'ñ' en el código
            
            // 1. Comprobamos si es múltiplo de 4
            if (anio % 4 == 0) {
                // 2. Comprobamos si es múltiplo de 100
                if (anio % 100 == 0) {
                    // 3. Excepción: comprobamos si es múltiplo de 400
                    if (anio % 400 == 0) {
                        System.out.println("El año " + anio + " es BISIESTO.");
                    } else {
                        System.out.println("El año " + anio + " NO es bisiesto.");
                    }
                } else {
                    System.out.println("El año " + anio + " es BISIESTO.");
                }
            } else {
                System.out.println("El año " + anio + " NO es bisiesto.");
            }
            
        }
    }
}

/*
import java.util.Scanner;

public class BisiestoV2 {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            
            System.out.print("Introduce un año: ");
            int anio = entrada.nextInt();
            
            // Condición única: (Múltiplo de 4 Y NO de 100) O (Múltiplo de 400)
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                System.out.println("El año " + anio + " es BISIESTO.");
            } else {
                System.out.println("El año " + anio + " NO es bisiesto.");
            }
            
        }
    }
}
*/