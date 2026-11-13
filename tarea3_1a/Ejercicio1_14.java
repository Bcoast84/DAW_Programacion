/*
 * Ejercicio 1.14
 * Diseñar un algoritmo que informe de los números perfectos que hay entre 1 y 10000.
 * Un número perfecto si es igual a la suma de todos los divisores menores que él.
 * @autor: Borja Costa Rojo
 * @fecha 02/11/2026
*/
package trimestre1.tarea3a;

public class Ejercicio1_14 {

    public static void main(String[] args) {
        
        System.out.println("Los números perfectos que hay entre 1 y 10000 son: ");
        
        for (int num = 1; num <= 10000; num++) { // se inicializa num en 1 y se va aumentando su valor hasta 1000
            int sumaDivisores = 0;
            for (int i = 1; i <= num / 2; i++) { // desde i = 1 hasta la mitad el propio numero, aumenta 1
                if (num % i == 0) { // si i es divisor de num, se suma al sumatorio de divisores
                    sumaDivisores += i;
                }
            }
            if (sumaDivisores == num) { // si el sumatorio es igual al número, el número es perfecto
                System.out.println(num);
            }
        }
    }
}