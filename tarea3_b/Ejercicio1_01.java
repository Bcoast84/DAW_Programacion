/*
 * Ejercicio 1.01 
 * Programar el siguiente juego. El ordenador genera un número al azar entre 0 y 99
 * que habrá que adivinar. El jugador intentará adivinar el número y el programa le
 * responderá si es mayor, menor o si ha acertado. Se dispone de un máximo de 5 intentos.
 * @autor: Borja Costa Rojo
 * @fecha 4/11/2026
*/
package trimestre1.tarea3_b;

import java.util.Scanner;

public class Ejercicio1_01 {

    public static void main(String[] args) {
        
        // Generamos un decimal, lo multiplicamos por 100 y descartamos los decimales al declararlo entero
        int numeroSecreto = (int) (Math.random() * 100);
        int count = 0;
        boolean acertado = false;
     
        try (Scanner teclado = new Scanner (System.in)){
            
            System.out.print("Introduzca un número entre 1 y 99: ");
            
            while (count < 5){
                
                count++;
                int num = teclado.nextInt();

                if (num < numeroSecreto){
                    System.out.println("El número es mayor que " + num + ".");
                }

                if (num > numeroSecreto){
                    System.out.println("El número es menor que " + num + ".");
                }

                if (num == numeroSecreto){
                    System.out.println("Ha acertado el número!!! El número era el " + numeroSecreto);
                    acertado = true;
                    break;
                }
                if (count < 5) {
                    System.out.print("Introduce otro número: ");
                }    
            } 
            
            System.out.println();
            
            if (!acertado){
                System.out.println("Has agotado los cinco intentos, otra vez será... El número era: " + numeroSecreto);
            }
        }       
    }       
}
