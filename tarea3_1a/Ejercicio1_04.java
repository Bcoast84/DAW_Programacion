/*
 * Ejercicio 1.04
 * Diseñar un programa capaz de leer un valor entero, que verifique que esté 
 * comprendido entre 1 y 10, y mostrar su tabla de multiplicar.
 * @autor: Borja Costa Rojo
 * @fecha 29/10/2026
*/
package trimestre1.tarea3a;

import java.util.Scanner;

public class Ejercicio1_04 {

    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { // Iniciamos Scanner
            
            int n = 0; //declaramos variable para numero y para el multiplicando
            int m = 1;
            while (1 > n || n > 10){ // Obligamos a que sea entre 1 y 10
                System.out.println("Introduce un número entre 1 y 10: ");
                n = entrada.nextInt(); 
            }        
            while (m<=10){ // Devolvemos la tabla de multiplicar de n
                System.out.println(n + "x" + m + "=" + m*n);
                m++;
            }
        }
    }
}