/*
 * Ejercicio 2.14
 * Haz 3 versiones de un mismo programa, que pida que se introduzcan por teclado
 * 2 números double sobre sendas variables llamadas ‘a’ y ‘b’ y que incluyan las
 * instrucciones que se muestran abajo. Para cada una de las versiones, 
 * ejecútalo varias veces, introduciendo cero para alguno de los valores y 
 * finalmente explica la diferencia de comportamiento entre cada una de las versiones
 * @autor: Borja Costa Rojo
 * @fecha 02/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_14 {
    
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { // Se inicia Scanner
            
            // Se solicita el primer número 
            System.out.print("Introduce el valor de 'a' (double): ");
            double a = entrada.nextDouble();
            
            // Se solicita el segundo número
            System.out.print("Introduce el valor de 'b' (double): ");
            double b = entrada.nextDouble();
            
            double r; // Se declara la variable r como double

            // VERSIÓN A: if (b !=0 && a/b==0) {r = a/b; System.out.println(r);} 
            if (b != 0 && a / b == 0) {
                r = a / b;
                System.out.println("Resultado r: " + r);
            }

            // VERSIÓN B: if (a/b==0 && b !=0) {r = a/b; System.out.println(r);}
            /*
            if (a / b == 0 && b != 0) {
                r = a / b;
                System.out.println("Resultado r: " + r);
            }
            */

            // VERSIÓN C: if (b !=0 & a/b==0) {r = a/b; System.out.println(r);}
            /*
            if (b != 0 & a / b == 0) {
                r = a / b;
                System.out.println("Resultado r: " + r);
            }
            */
            
        }
    }
}

/*
--------------------------------------------------------------------------------

2. ANÁLISIS DE CADA VERSIÓN:

• VERSIÓN A: `if (b != 0 && a / b == 0)`
  - Utiliza el operador en cortocircuito '&&'.
  - Si introducimos 'b = 0', la primera condición (b != 0) resulta 'false'.
  - al usar &&, descarta la evaluación de 'a / b == 0'.
  - Evita realizar una operación matemática innecesaria.
  - Solo entra al bloque 'if' si 'b' no es cero y 'a' es cero (ej. a=0, b=5 -> 0/5 == 0 -> imprime 0.0).

• VERSIÓN B: `if (a / b == 0 && b != 0)`
  - Primero se calcula SIEMPRE 'a / b'.
  - Si 'b = 0' y 'a = 0', 'a / b' resulta 'NaN'. Al comparar 'NaN == 0', da 'false'.
  - Si 'b = 0' y 'a = 5', 'a / b' resulta 'Infinity'. Al comparar 'Infinity == 0', da 'false'.
  - Aunque hace lo mismo que la versión A, realiza operaciones innecesarias.

• VERSIÓN C: `if (b != 0 & a / b == 0)`
  - Utiliza el operador '&' (un solo ampersand), el cual NO TIENE CORTOCIRCUITO.
  - Esto obliga a Java a evaluar SIEMPRE ambas expresiones obligatoriamente,
  - Hace las mismas operaciones innecesarias que la versión B.

*/
