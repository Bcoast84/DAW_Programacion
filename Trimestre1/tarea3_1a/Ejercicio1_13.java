/*
 * Ejercicio 1.13
 * Programa al que le introduzcas un número y que garantice que es positivo, 
 * es decir si lo introducimos menor o igual que cero nos obligará a volver
 * a introducirlo las veces que sea necesario hasta que se introduzca uno positivo.
 * @autor: Borja Costa Rojo
 * @fecha 02/11/2026
*/
package trimestre1.tarea3a;

import java.util.Scanner;

public class Ejercicio1_13 {

    public static void main(String[] args) {
        
        int num;
        
        try (Scanner teclado = new Scanner(System.in)){
            
            do{ // sale error hasta que no se introduzca un número válido
                System.out.println("Introduce un numero positivo: ");
                num = teclado.nextInt();  
                
                if (num <= 0) {
                    System.out.println("Error: El número debe ser mayor que cero.");
                }
            }
            while (num <= 0); // una vez se introduce un número válido, se muestra el número
            
             System.out.println("¡Correcto! Has introducido el número: " + num);
        }
    }
}
