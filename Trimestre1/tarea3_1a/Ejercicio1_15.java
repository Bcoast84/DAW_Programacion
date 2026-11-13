/*
 * Ejercicio 1.15
 * Sin ejecutarlo, intenta explicar que hace este programa.
 * @autor: Borja Costa Rojo
 * @fecha 02/11/2026
*/
package trimestre1.tarea3a;

public class Ejercicio1_15 {

    public static void main(String[] args) {
        int hora=0;
        for (int i=1;i<=7*24;i++) { // recorre las horas de una semana
            System.out.println (hora);
            if (++hora > 23) hora=0; // cuando llega a la hora 23, vuelve a la hora 0.
        }
    } //fin main
} //fin clase
