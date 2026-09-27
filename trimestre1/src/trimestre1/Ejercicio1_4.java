/* 
* Estadísticas de una asignatura
* Autor: Borja Costa Rojo
* Fecha 25/09/2026
*/
package trimestre1;

import java.util.Scanner;

public class Ejercicio1_4 {
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

            if (totalAlumnos == 0) {
                System.out.println("Error: el total de alumnos no puede ser cero.");
            } else {
                double factor = 100.0 / totalAlumnos;
                double pctAprobados = aprobados * factor;
                double pctDestacados = destacados * factor;

                System.out.printf("Total de alumnos evaluados: %d%n", totalAlumnos);
                System.out.printf("Alumnos que han superado la asignatura: %.2f%%%n", pctAprobados);
                System.out.printf("Notables y sobresalientes: %.2f%%%n", pctDestacados);
            }
        }
    }
}