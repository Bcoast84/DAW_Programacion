/*
 * Ejercicio 1.03
 * Mostrar las tablas de multiplicar del 1 al 9.
 * @autor: Borja Costa Rojo
 * @fecha 4/11/2026
*/
package trimestre1.tarea3_b;

public class Ejercicio1_03 {

    public static void main(String[] args) {
        
        int count = 1;
        int multiplo = 1;
        
        while (count < 10){
            
            System.out.println("-----------------------------");
            System.out.println("Tabla del " + count + ".");
            System.out.println("-----------------------------");
            
            while (multiplo <= 10){
                System.out.println(count + "x" + multiplo + " = " + count * multiplo);
                multiplo++;
            }
            multiplo = 1;
            count++;
        }  
    }   
}
