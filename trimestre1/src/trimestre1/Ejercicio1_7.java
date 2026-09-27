/* 
* Cálculo del consumo de un vehículo
* Autor: Borja Costa Rojo
* Fecha 26/09/2026
*/
package trimestre1;

import java.util.Scanner;

public class Ejercicio1_7 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.print("Introduce el kilometraje del último repostaje: ");
            double kmAnterior = teclado.nextDouble();

            System.out.print("Introduce el kilometraje actual: ");
            double kmActual = teclado.nextDouble();

            System.out.print("Litros en el depósito tras el último repostaje: ");
            double litrosAnteriores = teclado.nextDouble();

            System.out.print("Litros en el depósito actuales: ");
            double litrosActuales = teclado.nextDouble();

            double distancia = kmActual - kmAnterior;
            double litrosConsumidos = litrosAnteriores - litrosActuales;
            // Validación de datos: no se puede tener kilometraje negativo, litros negativos, distancia negativa o litros consumidos negativos.
            if (kmAnterior < 0 || kmActual < 0 || litrosAnteriores < 0 || litrosActuales < 0 || distancia <= 0 || litrosConsumidos < 0) {
                System.out.println("Error: los datos introducidos no son coherentes.");
            } else {
                double consumoMedio = (litrosConsumidos / distancia) * 100.0;
                System.out.printf("Distancia recorrida: %.1f km%n", distancia);
                System.out.printf("Combustible consumido: %.2f litros%n", litrosConsumidos);
                System.out.printf("Consumo medio: %.2f L/100 km%n", consumoMedio);
            }
        }
    }
}