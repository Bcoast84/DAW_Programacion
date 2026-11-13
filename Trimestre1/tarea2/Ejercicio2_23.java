/*
 * Ejercicio 2.23
 * Realizar un programa al que se le introduzcan DIA, MES, AÑO, que calcule el 
 * día siguiente.  Suponemos que los valores son correctos, sin emplear las clases
 * de fechas de Java.Hay que hacer un tratamiento diferente según sea fin de año, 
 * fin de mes (no fin de año) o un día no fin de mes.
 * @autor: Borja Costa Rojo
 * @fecha 09/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_23 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { // Iniciamos Scanner
            
            System.out.print("Introduce el DÍA: ");
            int dia = entrada.nextInt();
            
            System.out.print("Introduce el MES (1-12): ");
            int mes = entrada.nextInt();
            
            System.out.print("Introduce el AÑO: ");
            int anio = entrada.nextInt();
            
            // 1. Calculamos los días que tiene el mes actual
            int diasDelMes = 0;
            
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                diasDelMes = 31;
            }
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                diasDelMes = 30;
            }
            if (mes == 2 && !((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0))) {
                diasDelMes = 28;
            }
            if (mes == 2 && ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0))) {
                diasDelMes = 29;
            }
            
            // 2. Calculamos el día siguiente según los 3 escenarios
            
            // CASO 1: Es fin de año (31 de Diciembre)
            if (dia == 31 && mes == 12) {
                dia = 1;
                mes = 1;
                anio++;
                
            // CASO 2: Es fin de mes (pero no fin de año)
            } else if (dia == diasDelMes) {
                dia = 1;
                mes++;
                
            // CASO 3: Es un día normal (no es fin de mes)
            } else {
                dia++;
            }
            
            System.out.println("El día siguiente será: " + dia + "/" + mes + "/" + anio);
            
        }
    }
}
