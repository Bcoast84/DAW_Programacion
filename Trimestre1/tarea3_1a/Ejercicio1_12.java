/*
 * Ejercicio 1.12
 * Diseñar un algoritmo al que se le introduzcan las notas de los exámenes de 
 * una clase con decimales. Se introducirá –1 para indicar que no hay más notas. 
 * El algoritmo informará del total de notas introducidas, calculará la nota mínima,
 * máxima , la media, si hay algún 5.0 exacto, y el porcentaje de aprobados. 
 * Hay que validar que estén entre 0 y 10.
 * @autor: Borja Costa Rojo
 * @fecha 02/11/2026
*/
package trimestre1.tarea3a;

import java.util.Scanner;

public class Ejercicio1_12 {
    
    public static void main(String[] args) {
        
        double nota;
        int count = 0;
        double total = 0;
        double max = -1;
        double min = 11;
        int aprobados = 0;
        boolean cincos = false;
        
        
        try (Scanner teclado = new Scanner(System.in)){
            System.out.print("Introduce una nota: ");
            nota = teclado.nextDouble();
            
            while (nota != -1){ // mientras la nota sea distinto de -1 se ejecuta el algoritmo

                if (nota<0 || nota>10){ // si la nota no está entre 0 y 10 se pide que introduzca otro numero
                    System.out.println("Por favor, introduce una nota entre 0 y 10: ");
                }
                else{
                    count++; // se aumenta el contador
                    total += nota; // se suma la nota al total

                    if (nota>max){ // si la nota es mayor al maximo, maximo guarda el valor
                        max = nota;
                    }
                    if (nota<min){ // si la nota es menor al minimo, minimo guarda el valor
                        min = nota;
                    }
                    if (nota == 5.0){ // si la nota es igual a 5, se activa cincos
                        cincos = true;
                    }
                    if (nota >= 5.0){ // si la nota es mayor o igual que 5, se aumenta el contador de aprobados
                        aprobados++;
                    }
                }
                System.out.print("Introduce una nota entre 0 y 10 (-1 para finalizar): ");
                nota = teclado.nextDouble();
            }
        }
            if (count > 0) { // si el contador es mayor que , se realizan los calculos y resultados
                    double media = total / count;
                    double porcentaje = ((double) aprobados / count) * 100.0;
                    System.out.println("\n========== RESULTADOS ==========");
                    System.out.println("Total de notas válidas: " + count);
                    System.out.println("Nota mínima: " + min);
                    System.out.println("Nota máxima: " + max);
                    System.out.printf("Nota media: %.2f\n", media);
                    System.out.println("¿Hay algún 5.0 exacto?: " + (cincos ? "Sí hay al menos un 5.0" : "No hay ninguno"));
                    System.out.printf("Porcentaje de aprobados: %.2f%%\n", porcentaje);
            } 
            else { // si el contador es igual o menor que cero, se avisa de que no hay notas válidas
                    System.out.println("No se introdujo ninguna nota válida.");
            }
    }
}
