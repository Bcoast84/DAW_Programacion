/*
 * Ejercicio 1.13
 * Hacer un programa para llevar el control de venta de entradas. Lo primero 
 * que ha de hacer es pedir la cantidad de entradas que se pondrán a la venta, 
 * después irá solicitando la cantidad de entradas que quiere comprar, 
 * estando limitado a un máximo de 10 por cliente. El programa finalizará 
 * cuando se agoten las entradas mostrando la cantidad de entradas 
 * que se ha llevado el que más ha comprado.
 * @autor: Borja Costa Rojo
 * @fecha 13/11/2026
*/
package trimestre1.tarea3_b;

import java.util.Scanner;

public class Ejercicio1_13 {
    
    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {

            // Pedimos la cantidad total de entradas iniciales
            System.out.print("Introduce la cantidad total de entradas que se ponen a la venta: ");
            int entradasRestantes = teclado.nextInt();

            int maxCompradas = 0; // Para recordar el récord de entradas compradas por un cliente
            int cliente = 1;

            // Mientras queden entradas...
            while (entradasRestantes > 0) {
                System.out.println("\n----------------------------------------------");
                System.out.println("Entradas disponibles: " + entradasRestantes);
                System.out.print("Cliente " + cliente + ", ¿cuántas entradas desea comprar? (máximo 10): ");
                int compra = teclado.nextInt();

                // Comprobamos que sea viable
                if (compra <= 0) {
                    System.out.println("Error: La cantidad debe ser al menos 1 entrada.");
                } 
                
                else if (compra > 10) {
                    System.out.println("Error: No se permite comprar más de 10 entradas por cliente.");
                } 
                
                else if (compra > entradasRestantes) {
                    System.out.println("Error: No quedan suficientes entradas. Solo quedan " + entradasRestantes + " disponibles.");
                } 
                
                else {
                    // Venta realizada
                    entradasRestantes -= compra;
                    System.out.println("¡Compra realizada con éxito! Ha comprado " + compra + " entradas.");

                    // Actualizamos el maximo de entradas compradas
                    if (compra > maxCompradas) {
                        maxCompradas = compra;
                    }

                    cliente++; // Pasamos al siguiente cliente solo si la compra fue válida
                }
            }

            // Cuando no quedan entradas, se finaliza
            System.out.println("\n==============================================");
            System.out.println("¡Todas las entradas se han agotado!");
            System.out.println("La mayor cantidad de entradas comprada por un único cliente ha sido: " + maxCompradas);
        }
    }
}
