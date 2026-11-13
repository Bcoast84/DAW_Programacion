/*
 * Ejercicio 1.10
 * Realizar un programa que permita introducir el sexo (‘H’,’M’) y la edad de los 30
 * trabajadores de una fábrica. El programa debe obligar a que las edades que se introduzcan estén
 * comprendidas entre 16 y 70 años. El programa nos mostrará la edad y el sexo del más joven y
 * también mostrará la media de edad de las mujeres. Finalmente nos informará si hay alguno con más
 * de 60 años. Si se introduce cero como edad el programa terminará en ese momento sin esperar a que
 * introduzcan los 30 trabajadores.
 * @autor: Borja Costa Rojo
 * @fecha 7/11/2026
*/
package trimestre1.tarea3_b;

import java.util.Scanner;

public class Ejercicio1_10 {

    public static void main(String[] args) {
        
        try (Scanner teclado = new Scanner(System.in)) {
            
            int count = 0;
            char genero = 'D';
            int edad = 0;
            
            // Inicializamos a 100 al estar la edad máxima acotada
            int edadMasJoven = 100;
            char sexoMasJoven = ' ';
            int sumaEdadMujeres = 0;
            int contadorMujeres = 0;
            boolean hayMayorDe60 = false;
            
            while (count < 30) { // Mientras sea menor de 30, entramos al bucle
                
                count++;
                
                do { // se limita la edad entre 16 y 70, si es 0 sale del bucle y finaliza
                    System.out.print("Introduce la edad del trabajador " + count + " (entre 16 y 70, 0 para salir): ");
                    edad = teclado.nextInt();
                } while (edad != 0 && (edad < 16 || edad > 70));
                
                if (edad == 0) {
                    break;
                }
                
                do {
                    System.out.print("Introduce el sexo del trabajador " + count + " (H/M): ");
                    genero = teclado.next().toUpperCase().charAt(0);
                } while (genero != 'H' && genero != 'M');
                
                // Comprobamos si es el más joven
                if (edad < edadMasJoven) {
                    edadMasJoven = edad;
                    sexoMasJoven = genero;
                }
                
                // Acumulamos datos si es mujer
                if (genero == 'M') {
                    sumaEdadMujeres += edad;
                    contadorMujeres++;
                }
                
                // Comprobamos si tiene más de 60 años
                if (edad > 60) {
                    hayMayorDe60 = true;
                }
            }
            
            // Mostramos resultados fuera del bucle
            System.out.println("\n--- RESULTADOS ---");
            
            if (edadMasJoven != 100) { // hacemos todos los cálculos
                System.out.println("El trabajador más joven tiene " + edadMasJoven + " años y su sexo es: " + sexoMasJoven);
                
                if (contadorMujeres > 0) {
                    double mediaMujeres = (double) sumaEdadMujeres / contadorMujeres;
                    System.out.printf("La media de edad de las mujeres es: %.2f años%n", mediaMujeres);
                } else {
                    System.out.println("No se han introducido mujeres.");
                }
                
                if (hayMayorDe60) {
                    System.out.println("Sí hay al menos un trabajador con más de 60 años.");
                } else {
                    System.out.println("No hay ningún trabajador con más de 60 años.");
                }
            } else {
                System.out.println("No se introdujeron datos de ningún trabajador.");
            }
        }
    }
}