/*
 * Ejercicio 1.10
 * Programa al que se le introduzcan las edades de los alumnos (-1 para finalizar)
 * y nos informe si hay alguno menor de edad. En cuanto encuentre un menor de edad,
 * la respuesta va a ser “Sí hay alguno”, aunque luego sigamos introduciendo edades,
 * esta situación ya no va a cambiar.
 * @autor: Borja Costa Rojo
 * @fecha 30/10/2026
*/
package trimestre1.tarea3a;

import java.util.Scanner;

public class Ejercicio1_10 {

    public static void main(String[] args) {
        int edad;
        boolean hayMenor = false; 
        
        try (Scanner teclado = new Scanner (System.in)){
            
            System.out.println("Introduzca la edad del alumno (-1 para finalizar): ");
            edad = teclado.nextInt();
            while (edad != -1){ // Mientras la edad introducida no sea -1, se ejecuta el algoritmo
                
                if (edad<18){ // Si es menor de edad, se activa que hay menor de edad
                    hayMenor = true;
                }
                
                System.out.println("Introduzca la edad de otro alumno (-1 para finalizar): ");
                edad = teclado.nextInt();
                
                if (hayMenor){ // si ya hay algun menor se avisa
                    System.out.println("Si hay alguno. Introduzca la edad de otro alumno(-1 para salir): ");
                }
                
                else{ // si no hay ningun menor de edad, se avisa
                    System.out.println("No hay ningun menor de edad, introduzca la edad de otro alumno (-1 para salir): ");
                }
            }
        }
    
    }
    
}
