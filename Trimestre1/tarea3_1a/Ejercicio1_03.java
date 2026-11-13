/*
 * Ejercicio 1.03
 * Diseñar un algoritmo que permita introducir números positivos
 * y nos vaya informando uno a uno si es par o impar. El programa finalizará
 * cuando se introduzca un número negativo.
 * Hacer dos versiones, una primera con una lectura de teclado adelantada 
 * (antes de entrar en el bucle) y otra versión en la que la lectura de 
 * datos se haga únicamente al principio del bucle.
 * @autor: Borja Costa Rojo
 * @fecha 29/10/2026
*/

package trimestre1.tarea3a;

import java.util.Scanner;

public class Ejercicio1_03 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) { // Iniciamos Scanner
            System.out.println("Introduzca un numero (negativo para salir):  ");
            int n = entrada.nextInt(); // pedimos n
            
            while (n>0){ // mientras n sea mayor que cero
                if (n%2 == 0){ // comprobamos si es par
                    System.out.println("El número es par");
                }
                else{
                    System.out.println("El número es impar");
                }
                System.out.println("Introduzca otro numero (negativo para salir)");
                n = entrada.nextInt(); // pedimos n de nuevo 
            }
        }      
    } 
}

/*
public class Ejercicio1_03 {

    public static void main(String[] args) {

        try (Scanner entrada = new Scanner(System.in)) { // Iniciamos Scanner
            
            while (true){
                
                System.out.println("Introduzca un numero (negativo para salir):  ");
                int n = entrada.nextInt(); // pedimos n
                
                if (n < 0) { // si n es menor que 0, se sale del algoritmo
                    break; 
                }
                if (n%2 == 0){ // si es resto 0, es par
                    System.out.println("El número es par");
                }
                else{
                    System.out.println("El número es impar");
                }
            }    
        }
    }
}
*/