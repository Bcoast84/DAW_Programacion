/*
 * Ejercicio 2.18
 * Un sistema de ecuaciones lineales de la forma: 
 * ax + by = c
 * dx + ey = f 
 * puede resolverse utilizando las siguientes fórmulas:x=ce−bf/ae−bd   y=af−cd/ae−bd 
 * Realizar un programa que lea por teclado los dos conjuntos de coeficientes 
 * (a, b y c, y d, e y f) y calcule los valores para ‘x’ e ‘y’ según la fórmula descrita
 * ¿Existen algunos casos para los cuales este algoritmo no funcione? 
 * Nota: cuando en matemáticas se escriben dos variables juntas, por ejemplo ‘ce’ quiere decir ‘c por e’. 
 * Solo hay que verificar que el denominador es distinto de cero
 * @autor: Borja Costa Rojo
 * @fecha 02/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_18 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { // Se inicia el Scanner
            
            // Se solicitan valores para la primera ecuación
            System.out.println("--- Primera ecuación: ax + by = c ---");
            System.out.print("Introduce 'a': ");
            double a = entrada.nextDouble();
            System.out.print("Introduce 'b': ");
            double b = entrada.nextDouble();
            System.out.print("Introduce 'c': ");
            double c = entrada.nextDouble();
            
            // Se solicitan valores para la segunda ecuación
            System.out.println("\n--- Segunda ecuación: dx + ey = f ---");
            System.out.print("Introduce 'd': ");
            double d = entrada.nextDouble();
            System.out.print("Introduce 'e': ");
            double e = entrada.nextDouble();
            System.out.print("Introduce 'f': ");
            double f = entrada.nextDouble();
            
            // Variable para el denominador común: (ae - bd)
            double denominador = (a * e) - (b * d);
            
            // Comprobamos que el denominador sea distinto de cero
            if (denominador != 0) {
                double x = ((c * e) - (b * f)) / denominador;
                double y = ((a * f) - (c * d)) / denominador;
                
                System.out.println("\nEl sistema tiene solución única:");
                System.out.println("x = " + x);
                System.out.println("y = " + y);
            } else {
                System.out.println("\nEl sistema NO se puede resolver con este método (el denominador es 0).");
            }
            
        }
    }
}