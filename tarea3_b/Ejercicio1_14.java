/*
 * Ejercicio 1.13
 * Modificar el programa anterior para que si un cliente introduce un número 
 * negativo o mayor que 10 le informe de su error y le obligue a meter correctamente 
 * las entradas que desea, las veces que sea necesario hasta que lo haga bien.
 * @autor: Borja Costa Rojo
 * @fecha 13/11/2026
*/
package trimestre1.tarea3_b;
import java.util.Scanner;
public class Ejercicio1_14 {
    public static void main(String[] args) {
        
        try (Scanner teclado = new Scanner(System.in)) {
            
            // Usamos un do-while para obligar a introducir valores válidos
            int entradasRestantes;
            do {
                System.out.print("Introduce la cantidad de entradas puestas a la venta (mínimo 1): ");
                entradasRestantes = teclado.nextInt();
                
                if (entradasRestantes <= 0) {
                    System.out.println("Error: Debe ponerse a la venta al menos 1 entrada.");
                }
                
            } while (entradasRestantes <= 0);
            
            int maxCompradas = 0; // Registro del cliente con más entradas
            int cliente = 1;
            
            // Se ejecuta hasta agotar las entradas
            while (entradasRestantes > 0) {
                System.out.println("\n----------------------------------------------");
                System.out.println("Entradas disponibles: " + entradasRestantes);
                
                int compra;
                // Obligamos de nuevo a introducir un número correcto
                do {
                    System.out.print("Cliente " + cliente + ", ¿cuántas entradas desea comprar? (máximo 10): ");
                    compra = teclado.nextInt();
                    
                    if (compra <= 0 || compra > 10) {
                        System.out.println("Error: Cantidad no permitida. Debe pedir entre 1 y 10 entradas.");
                    } else if (compra > entradasRestantes) {
                        System.out.println("Error: No quedan suficientes entradas. Solo quedan " + entradasRestantes + " disponibles.");
                    }
                } while (compra <= 0 || compra > 10 || compra > entradasRestantes);
                
                // Si sale del do-while, procesamos la compra
                entradasRestantes -= compra;
                System.out.println("¡Compra realizada con éxito! Ha adquirido " + compra + " entradas.");
                
                // Comprobamos si es el récord de compra
                if (compra > maxCompradas) {
                    maxCompradas = compra;
                }
                
                cliente++; // Pasamos al siguiente cliente
            }
            
            System.out.println("\n==============================================");
            System.out.println("¡Todas las entradas se han agotado!");
            System.out.println("La mayor cantidad de entradas comprada por un único cliente ha sido: " + maxCompradas);
        }
    }
}