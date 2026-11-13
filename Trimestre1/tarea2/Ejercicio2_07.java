/*
 * Ejercicio 2.07
 * Leer dos números enteros y diga si uno y solo uno es mayor de 10.
 * @autor: Borja Costa Rojo
 * @fecha 02/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;
public class Ejercicio2_07 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { //Se inicia Scanner
            
            // Pedimos el primer número
            System.out.print("Introduce el primer número: ");
            int num1 = entrada.nextInt();
            
            // Pedimos el segundo número
            System.out.print("Introduce el segundo número: ");
            int num2 = entrada.nextInt();
            
            // Comprobamos si (num1 es mayor que 10 Y num2 no lo es) O (num1 no lo es Y num2 sí)
            if ((num1 > 10 && num2 <= 10) || (num1 <= 10 && num2 > 10)) {
                System.out.println("Uno y solo uno de los números es mayor de 10.");
            } else {
                System.out.println("No se cumple la condición (o los dos son mayores, o ninguno lo es).");}
        }
    }
}