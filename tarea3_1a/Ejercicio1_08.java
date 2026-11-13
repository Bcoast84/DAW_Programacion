/*
 * Ejercicio 1.08
 * Calcular la suma de los 100 números siguientes a uno tecleado previamente.
 * @autor: Borja Costa Rojo
 * @fecha 30/10/2026
*/
package trimestre1.tarea3a;

import java.util.Scanner;

public class Ejercicio1_08 {

    public static void main(String[] args) {
        int count = 1;
        int sum = 0;
        
        try (Scanner teclado = new Scanner (System.in)){
            System.out.println("Introduce un número: ");
            int num = teclado.nextInt();
             
            while (count <= 100){ // mientras contador menor o igual a 100
                count++; // se aumenta en 1 el contador
                sum = sum + (num + count); // se suma el numero actual al sumatorio
            }
            System.out.println("El resultado del sumatorio es " + sum);

        }               
    }   
}
