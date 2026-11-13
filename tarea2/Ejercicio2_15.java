/*
 * Ejercicio 2.15
 * Diseñar un programa que lea tres números enteros. Si todos son negativos, 
 * mostrar el producto de los tres. Si alguno es negativo, pero no todos, mostrar
 * la suma de los tres. En caso de que todos sean positivos sumar los dos primeros
 * y multiplicar dicha suma por el tercero. ¿existe alguna combinación de los valores
 * leídos no contemplado en el algoritmo? (Suponer que el cero es un número positivo). 
 * Hacer el programa lo más sencillo posible.
 * @autor: Borja Costa Rojo
 * @fecha 02/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_15 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { // Iniciamos Scanner
            
            // Pedimos el primer número
            System.out.print("Introduce el primer número: ");
            int n1 = entrada.nextInt();
            
            // Pedimos el segundo número
            System.out.print("Introduce el segundo número: ");
            int n2 = entrada.nextInt();
            
            // Pedimos el tercer número
            System.out.print("Introduce el tercer número: ");
            int n3 = entrada.nextInt();
            
            // CASO 1: Todos son negativos
            if (n1 < 0 && n2 < 0 && n3 < 0) {
                int producto = n1 * n2 * n3;
                System.out.println("Todos son negativos. Producto: " + producto);
                
            // CASO 2: Todos son positivos (recordando que el 0 se considera positivo >= 0)
            } else if (n1 >= 0 && n2 >= 0 && n3 >= 0) {
                int resultado = (n1 + n2) * n3;
                System.out.println("Todos son positivos. Resultado (n1 + n2) * n3: " + resultado);
                
            // CASO 3: Hay alguno negativo, pero no todos (por descarte)
            } else {
                int suma = n1 + n2 + n3;
                System.out.println("Hay mezcla (alguno negativo pero no todos). Suma: " + suma);
            }
            
        }
    }
}
// No queda ninguna combinación sin contemplar.