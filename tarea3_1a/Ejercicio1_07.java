/*
 * Ejercicio 1.07
 * Indica la funcionalidad del siguiente programa. ¿Tiene algún error?¿Falta alguna llave?
 * ¿Podrías reducir el recorrido del for para que el programa sea más rápido, 
 * manteniendo su funcionalidad?
 * @autor: Borja Costa Rojo
 * @fecha 30/10/2026
*/
package trimestre1.tarea3a;

import java.util.Scanner;

public class Ejercicio1_07 {

/*    public static void main(String[] args) {
    
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número natural entre 1 y 1000: ");
        num = teclado.nextInt();

        if (num <0 && num > 1000)
            System.out.println("Numero incorrecto.");
        else
            for (int i=num;num>=1;i--)
            if (num % i == 0) 
                System.out.println(i);
        }
}
*/
    
// Indica la funcionalidad del siguiente programa.
// Pide un umero entre 1 y 1000 y muestra los divisores de dicho número.

// ¿Tiene algún error?¿Falta alguna llave?
// En el bucle for se usa num en vez de i, como num no cambia, esa condicion se cumple siempre
// Se usa && que es "Y", no puede ser menor que 0 y mayor que 1000 a la vez
// Faltan llaves del for y de else

// Ejercicio corregido y mas rápido

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)){
            System.out.print("Introduce un número natural entre 1 y 1000: ");
            int num = teclado.nextInt();

            
            if (num < 1 || num > 1000) { // Corrección del error con || (OR)
                System.out.println("Número incorrecto.");
            } 
            else {
               System.out.println("Divisores de " + num + ":");
               System.out.println(num);

               // Optimización: empezamos en la mitad (num / 2)
               for (int i = num / 2; i >= 1; i--) { // Corregimos la condición: i >= 1
                    if (num % i == 0) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
}