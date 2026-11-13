/*
 * Ejercicio 1.11
 * Mostrar por pantalla alternativamente “hola” y “adiós” hasta completar x líneas, 
 * siendo x un número entero positivo tecleado previamente 
 * (ojo: el número x puede ser par o impar)
 * @autor: Borja Costa Rojo
 * @fecha 11/11/2026
*/
package trimestre1.tarea3_b;

import java.util.Scanner;

public class Ejercicio1_11 {

    public static void main(String[] args) {
        
        int count = 0;
        int num;
        
        try (Scanner teclado = new Scanner (System.in)){
            
            System.out.println("Introduzca el número de líneas:  ");
            num = teclado.nextInt();
            
            for (int i = 1; i <= num; i++) {
                count++;
                
                if (i % 2 != 0){
                    
                    // System.out.println("Linea: " + count);
                    System.out.println("hola");               
                }
                else{
                    
                    // System.out.println("Linea: " + count);
                    System.out.println("adios");
                }
            } 
        }
    } 
}
// Primero lo hice usando while pero he leido que siempre que se sepa con anterioridad 
// el numero de iteraciones debemos utilizar FOR