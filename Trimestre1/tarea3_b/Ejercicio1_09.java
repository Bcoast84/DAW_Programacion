/*
 * Ejercicio 1.09
 * Programa que permita introducir números y nos muestre el resultado de sumarlos, hasta
 * que aparezca un número mayor que 1000. Si no se introduce un número mayor que 1000 el
 * programa finalizará después de introducidos 15 números. (Ojo: es fácil equivocarse y hacer que
 * solicite un numero de más o bien que no sume correctamente)
 * @autor: Borja Costa Rojo
 * @fecha 7/11/2026
*/
package trimestre1.tarea3_b;

import java.util.Scanner;

public class Ejercicio1_09 {


    public static void main(String[] args) {
        
        int num, suma = 0, count = 0;
        
        try(Scanner teclado = new Scanner (System.in)){
            
            while (count< 15){ // Mientras el contador sea menor de 15, se solicita numero
                
                System.out.println("Introduzca un número: ");
                num = teclado.nextInt();
                count++;
                
                if (num>1000){ // si el numero es mayor de 1000, se finaliza
                    System.out.println("Has introducido un número mayor que 1000 ");
                    break;
                }
                else{ // sino: se suma el numero al sumatorio
                    
                    suma += num;
                }
            }
            {
                
            }
            System.out.println("La suma de todos los números es: " + suma); // cuando se finalice, se muestra el sumatorio
        }
    }  
}
