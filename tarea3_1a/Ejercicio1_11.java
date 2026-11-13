/*
 * Ejercicio 1.11
 * Diseñar un algoritmo capaz de leer dos valores enteros, m y n, y nos muestre 
 * los números comprendidos entre ellos ordenados ascendentemente, junto con el valor
 * de elevar cada uno de esos números al cuadrado. No se sabe si m > n, pero se 
 * desea utilizar una sola sentencia repetitiva tanto si m > n como si m < n.
 * @autor: Borja Costa Rojo
 * @fecha 30/10/2026
*/
package trimestre1.tarea3a;

import java.util.Scanner;

public class Ejercicio1_11 {

    public static void main(String[] args) {
        int m, n;
        
        try(Scanner teclado = new Scanner(System.in)){
            System.out.println("Introduzca el primer número");
            m = teclado.nextInt();
            System.out.println("Introduzca el segundo número");
            n = teclado.nextInt();
            
            int menor, mayor;
            if (m < n) { // si m es menor que n, m es el menor
                menor = m;
                mayor = n;
            } else { // sino, n es el menor
                menor = n;
                mayor = m;
            }
            System.out.println("\n--- Números entre " + menor + " y " + mayor + " y sus cuadrados ---");
            for (int i = menor; i <= mayor; i++) { // se aumenta 1 mientras el menor sea menor o igual que el mayor.
                int cuadrado = i * i; // se calcula el cuadrado y se muestra
                System.out.println("Número: " + i + " -> Cuadrado: " + cuadrado);
            }
        }
    }        
}
