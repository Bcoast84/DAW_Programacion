/*
 * Ejercicio 1.05
 * Programa que lea números de entrada y que informa si están ordenados ascendentemente
 * o no. El programa finaliza si se introduce cero o en cuanto se detecte que los
 * números no están ordenados.
 * @autor: Borja Costa Rojo
 * @fecha 4/11/2026
*/
package trimestre1.tarea3_b;

import java.util.Scanner;

public class Ejercicio1_05 {

    public static void main(String[] args) {
        
        int memoria = 0;
        boolean ordenados = true;
        try(Scanner teclado = new Scanner (System.in)){
            
            
            System.out.print("Introduzca un número (cero para salir):  ");
            int numero = teclado.nextInt();
            
            while (numero != 0 && ordenados == true){
                
                System.out.print("Introduzca el siguiente número (cero para salir):  ");
                numero = teclado.nextInt();
                
                if (numero > memoria ){
                    memoria = numero; 
                }
                
                if (numero < memoria){
                    ordenados = false;
                    break;
                }   
            }
            
            if (numero == 0){
            System.out.print("Hasta pronto!");
            }
            
            if (ordenados == false){
            System.out.print("Ha introducido un número desordenado.");
                
            }
        }
    }
}
