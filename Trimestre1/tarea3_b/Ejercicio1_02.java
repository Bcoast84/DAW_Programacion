/*
 * Ejercicio 1.02
 * Diseñar un algoritmo al que se le introduzcan las notas de un alumno en los nueve
 * módulos de un ciclo y nos informe si puede ir a la FCT (todos aprobados). 
 * ¿Hay que solicitarle al usuario siempre las notas de los nueve módulos?
 * @autor: Borja Costa Rojo
 * @fecha 4/11/2026
*/

// No es necesario pedir las 9 notas siempre, ya que en el momento en el que se introduce
// un módulo suspenso, ya no puede realizar las FCT

package trimestre1.tarea3_b;

import java.util.Scanner;

public class Ejercicio1_02 {

    public static void main(String[] args) {
        
        boolean apto = true;
        int count = 0;
        double nota;
        
        try(Scanner teclado = new Scanner(System.in)){
            
            while (count < 9 && apto){

                count++;
                System.out.print("Introduzca la nota de otro módulo " + count + " de 9: ");
                nota = teclado.nextDouble();
                
                if(nota <5){
                    apto = false;
                    break;
                }
            }
            if (apto){
                System.out.print("El alumno tiene todo aprobado y puede cursar el FCT");
            }
            else{
                System.out.print("El alumno NO puede ir a la FCT porque ha suspendido al menos un módulo.");
            }
        }    
    }
}
