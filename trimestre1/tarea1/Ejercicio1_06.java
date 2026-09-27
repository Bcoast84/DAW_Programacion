/* 
* Ejercicio 1.06
* Cálculo del coste final de un vehículo
* @autor: Borja Costa Rojo
* @fecha 26/09/2026
*/
package trimestre1.tarea1;

import java.util.Scanner;

public class Ejercicio1_06 {
    public static void main(String[] args) {
            final double PORCENTAJE_TIENDA = 10.0;
        final double PORCENTAJE_IMPUESTO = 20.0;

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Introduce el coste de fábrica del vehículo (€): ");
            double costeFabrica = teclado.nextDouble();

            double gananciaTienda = costeFabrica * (PORCENTAJE_TIENDA / 100.0);
            double precioConBeneficio = costeFabrica + gananciaTienda;

            double impuestos = precioConBeneficio * (PORCENTAJE_IMPUESTO / 100.0);
            double costeFinal = precioConBeneficio + impuestos;

            System.out.println("--- Desglose del Precio ---");
            System.out.printf("Coste de fábrica: %.2f €%n", costeFabrica);
            System.out.printf("Ganancia de la tienda (%.0f%%): %.2f €%n", PORCENTAJE_TIENDA, gananciaTienda);
            System.out.printf("Impuestos estatales (%.0f%%): %.2f €%n", PORCENTAJE_IMPUESTO, impuestos);
            System.out.printf("Coste total para el comprador: %.2f €%n", costeFinal);
        }
    }
}