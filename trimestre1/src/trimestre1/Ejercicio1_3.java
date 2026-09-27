/* 
* Suma, resta y división de dos números enteros
* Autor: Borja Costa Rojo
* Fecha 25/09/2026
*/
package trimestre1;

import java.util.Scanner;

public class Ejercicio1_3 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Introduce el primer número entero: ");
            int num1 = teclado.nextInt();

            System.out.print("Introduce el segundo número entero: ");
            int num2 = teclado.nextInt();

            int suma = num1 + num2;
            int resta = num1 - num2;

            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);

            if (num2 == 0) {
                System.out.println("Error: no es posible dividir entre cero.");
            } 
            else {
                double division = (double) num1 / num2;
                System.out.println("División: " + division);
            }
        }
    }
}