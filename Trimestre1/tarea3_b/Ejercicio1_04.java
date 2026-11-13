/*
 * Ejercicio 1.04
 * Diseña un algoritmo capaz de obtener la letra del DNI a partir del número de DNI.
 * Consiste en dividir dicho número entre 23 y tomar el resto de la división asignándole
 * la letra correspondiente según la siguiente tabla (Hacer con switch, no empleando ni arrays ni String)
 * @autor: Borja Costa Rojo
 * @fecha 4/11/2026
*/
package trimestre1.tarea3_b;

import java.util.Scanner;

public class Ejercicio1_04 {

    public static void main(String[] args) {
         try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Introduce el número de DNI (sin letra): ");
            int dni = teclado.nextInt();
            // Validamos que el número introducido sea positivo
            if (dni <= 0) {
                System.out.println("Error: El número de DNI debe ser positivo.");
            } else {
                // Obtenemos el resto de dividir el DNI entre 23
                int resto = dni % 23;
                char letra;
                // Estructura switch para asignar la letra según la tabla
                switch (resto) {
                    case 0:  letra = 'T'; break;
                    case 1:  letra = 'R'; break;
                    case 2:  letra = 'W'; break;
                    case 3:  letra = 'A'; break;
                    case 4:  letra = 'G'; break;
                    case 5:  letra = 'M'; break;
                    case 6:  letra = 'Y'; break;
                    case 7:  letra = 'F'; break;
                    case 8:  letra = 'P'; break;
                    case 9:  letra = 'D'; break;
                    case 10: letra = 'X'; break;
                    case 11: letra = 'B'; break;
                    case 12: letra = 'N'; break;
                    case 13: letra = 'J'; break;
                    case 14: letra = 'Z'; break;
                    case 15: letra = 'S'; break;
                    case 16: letra = 'Q'; break;
                    case 17: letra = 'V'; break;
                    case 18: letra = 'H'; break;
                    case 19: letra = 'L'; break;
                    case 20: letra = 'C'; break;
                    case 21: letra = 'K'; break;
                    case 22: letra = 'E'; break;
                    default: letra = '?'; break; // Para evitar error 
                }
                System.out.println("El resto es: " + resto);
                System.out.println("La letra correspondiente es: " + letra);
                System.out.println("DNI completo: " + dni + letra);
            }
        }
    }
}