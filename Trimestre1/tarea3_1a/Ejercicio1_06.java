/*
 * Ejercicio 1.06
 * Diseñar un programa que muestre los números pares comprendidos
 * entre 100 y 1 en orden descendente.
 * @autor: Borja Costa Rojo
 * @fecha 29/10/2026
*/
package trimestre1.tarea3a;

public class Ejercicio1_06 {

    public static void main(String[] args) {
       int n = 100;
        while (n >= 1){ // mientras n sea igual o mayor que 1
            if ( n % 2 == 0){ // si n es par se imporime
                System.out.println(n);
            }
            n -= 2; // se resta 2 a n, para llegar al siguiente par
        }
    }    
}
// podriamos eliminar el if puesto que al restarle 2 siempre van a ser pares.
// Lo dejo porque así, si se le da otro valor a n, el algoritmo funcionaría igual.