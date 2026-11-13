/*
 * Ejercicio 1.12
 * Sacar por pantalla la suma, la media y el producto de los números pares comprendidos
 * entre dos números enteros tecleados previamente. No sabemos si el que introduce 
 * primero es menor que el segundo. No incluir en los cálculos los números introducidos,
 * solo los intermedios.
 * @autor: Borja Costa Rojo
 * @fecha 11/11/2026
*/
package trimestre1.tarea3_b;

import java.util.Scanner;

public class Ejercicio1_12 {
    
    public static void main(String[] args) {
        
        try (Scanner teclado = new Scanner(System.in)) {
            
            // Pedimos los dos números
            System.out.print("Introduzca el primer número: ");
            int n1 = teclado.nextInt();
            
            System.out.print("Introduzca el segundo número: ");
            int n2 = teclado.nextInt();
            
            // Determinamos cuál es el menor y cuál el mayor
            int menor, mayor;
            if (n1 < n2) {
                menor = n1;
                mayor = n2;
            } else {
                menor = n2;
                mayor = n1;
            }
            
            // Variables para los cálculos
            int suma = 0;
            long producto = 1; // Usamos long porque el producto crece muy rápido
            int contPares = 0; // Para saber cuántos pares encontramos y calcular la media
            
            // Bucle solo por los intermedios (menor + 1 hasta mayor - 1)
            for (int i = menor + 1; i < mayor; i++) {
                if (i % 2 == 0) { // Comprobamos si es par
                    suma += i;
                    producto *= i;
                    contPares++;
                }
            }
            
            // Mostramos los resultados
            System.out.println("----------------------------------------------");
            
            if (contPares > 0) {
                double media = (double) suma / contPares; // Hacemos cast a double para no perder decimales
                
                System.out.println("Números pares encontrados: " + contPares);
                System.out.println("Suma: " + suma);
                System.out.println("Producto: " + producto);
                System.out.println("Media: " + media);
                
            } else {
                System.out.println("No hay números pares intermedios entre " + menor + " y " + mayor + ".");
            }
        }
    }
}