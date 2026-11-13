/*
 * Ejercicio 2.22
 * Realizar un programa al que se le introduzcan DIA, MES, AÑO, 
 * que verifique que los valores introducidos sean correctos, sin emplear las clases
 * de fechas de Java. Si primero calculamos los días que tiene un mes/año, luego será
 * muy fácil la verificación de la fecha.
 * @autor: Borja Costa Rojo
 * @fecha 03/10/2026
*/

package trimestre1.tarea2;

import java.util.Scanner;

public class Ejercicio2_22 {
    public static void main(String[] args) {
        
        try (Scanner entrada = new Scanner(System.in)) { // Iniciamos Scanner
            
            System.out.print("Introduce el DÍA: ");
            int dia = entrada.nextInt();
            
            System.out.print("Introduce el MES (1-12): ");
            int mes = entrada.nextInt();
            
            System.out.print("Introduce el AÑO: ");
            int anio = entrada.nextInt();
            
            int diasDelMes = 0;
            
            // Meses de 31 días: Enero(1), Marzo(3), Mayo(5), Julio(7), Agosto(8), Octubre(10), Diciembre(12)
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                diasDelMes = 31;
            }
            
            // Meses de 30 días: Abril(4), Junio(6), Septiembre(9), Noviembre(11)
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                diasDelMes = 30;
            }
            
            // Febrero en año NO bisiesto (28 días)
            if (mes == 2 && !((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0))) {
                diasDelMes = 28;
            }
            
            // Febrero en año bisiesto (29 días)
            if (mes == 2 && ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0))) {
                diasDelMes = 29;
            }
            
            // Verificación final de la fecha
            if (anio > 0 && mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasDelMes) {
                System.out.println("Fecha CORRECTA: " + dia + "/" + mes + "/" + anio);
            }
            
            // Si no cumple las condiciones de fecha correcta
            if (anio <= 0 || mes < 1 || mes > 12 || dia < 1 || dia > diasDelMes) {
                System.out.println("Fecha INCORRECTA.");
            }
            
        }
    }
}