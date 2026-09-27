/* 
* Ejercicio 1.04
* Precio final de un vehículo
* @autor: Borja Costa Rojo
* @fecha 25/09/2026
*/
package trimestre1.tarea1;

import java.util.Scanner;

public class Ejercicio1_04 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Número de suspensos: ");
            int suspensos = teclado.nextInt();

            System.out.print("Número de suficientes: ");
            int suficientes = teclado.nextInt();

            System.out.print("Número de notables: ");
            int notables = teclado.nextInt();

            System.out.print("Número de sobresalientes: ");
            int sobresalientes = teclado.nextInt();

            int destacados = notables + sobresalientes;
            int aprobados = suficientes + destacados;
            int totalAlumnos = suspensos + aprobados;

            if (totalAlumnos == 0) { //Si el total de alumnos es cero, no se puede calcular el porcentaje y sacamos error.
                System.out.println("Error: el total de alumnos no puede ser cero.");
            } else {
                double factor = 100.0 / totalAlumnos; // calculamos el factor para convertir a porcentaje
                double pctAprobados = aprobados * factor;
                double pctDestacados = destacados * factor;

                System.out.printf("Total de alumnos evaluados: %d%n", totalAlumnos); // %d: reserva un espacio para una variable entera. y %n: salto de línea.
                System.out.printf("Alumnos que han superado la asignatura: %.2f%%%n", pctAprobados);
                System.out.printf("Notables y sobresalientes: %.2f%%%n", pctDestacados); // %.2f%%%n: reserva para float, simbolo de % y salto de linea.
            }
        }
    }
}