/*
 * Ejercicio 1.09
 * Sumar una cantidad de números que se van introduciendo por teclado
 * hasta que la suma de los mismos valga más de 100.
 * @autor: Borja Costa Rojo
 * @fecha 30/10/2026
*/
package trimestre1.tarea3a;

import java.util.Scanner;

public class Ejercicio1_09 {
   
    public static void main(String[] args) {
        
        int sum = 0;
        try(Scanner teclado = new Scanner (System.in)){
            
            while (sum<=100){ // mientras el sumatorio no valga mas de 100
                System.out.println("Introduce un número: ");
                int num = teclado.nextInt();
                sum = sum + num; // se pide un umero y se añade al sumatorio
            }  
            System.out.println("El resultado es " + sum);
        } 
    }
}
