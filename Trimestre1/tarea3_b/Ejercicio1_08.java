/*
 * Ejercicio 1.08
 * Hacer un programa que permita calcular el sueldo final de los vendedores de un
 * concesionario de coches. Para cada uno se introducirá: sueldo base, cantidad de 
 * horas extras realizadas y cantidad de ventas. El sueldo final será el sueldo base 
 * más las horas extras (se pagan a 100€ la hora) y un plus en función de las ventas: 
 * entre 10 y 20 ventas 500€, entre 21 y 30 ventas  1000€ y si supera las 30 
 * ventas  1300 €. Después de tratar cada vendedor se preguntará al usuario y hay más
 * vendedores a tratar, finalizando el programa si contesta negativamente. Al final el
 * programa mostrará el total de ventas y el salario final del que más ventas ha realizado
 * (supón que al menos introducen los datos de un empleado).
 * @autor: Borja Costa Rojo
 * @fecha 7/11/2026
*/
package trimestre1.tarea3_b;

import java.util.Scanner;

public class Ejercicio1_08 {
    

    public static void main(String[] args) {
        // declaración de variables
        double base, hExtras, ventas, sueldo, topVentas = 0, topSalario = 0;
        int plusVentas;
        int vendedor = 1, topVendedor = 1;
        boolean otroVendedor = true;
        
        try (Scanner teclado = new Scanner (System.in)){
            while (otroVendedor==true){ // mientras haya mas vendedores, leemos parametros
                
                System.out.print("Introduzca el sueldo base del vendedor "+ vendedor + ":  ");
                base = teclado.nextDouble();
                
                System.out.print("Introduzca las horas extras del vendedor "+ vendedor + ":  ");
                hExtras = teclado.nextDouble() * 100;
                
                System.out.print("Introduzca las ventas del vendedor "+ vendedor + ":  ");
                ventas = teclado.nextDouble();               
                
                if (ventas > 30) { // se le asigna el plus de ventas
                    plusVentas = 1300;
                } 
                else if (ventas >= 21) {
                    plusVentas = 1000;
                } 
                else if (ventas >= 10) {
                    plusVentas = 500;
                } 
                else {
                    plusVentas = 0;
                }
                
                sueldo = base + hExtras + plusVentas; // se calcula el sueldo
                System.out.println("El sueldo final del trabajador " + vendedor + " es " + sueldo);
                
                if (ventas > topVentas){ // si es record de ventas, se guardan datos
                topVentas = ventas;
                topSalario = sueldo;
                topVendedor = vendedor;
                }   
                
                vendedor++;        // se aumenta el contador      

                System.out.print("¿Hay más vendedores? (S/N): "); // se pregunta si hay mas vendedores
                String respuesta = teclado.next();
                otroVendedor = respuesta.equalsIgnoreCase("S") || respuesta.equalsIgnoreCase("Y");
                
            }
            
            System.out.print("El vendedor " + topVendedor + " ha hecho " + topVentas + " con un salario de " + topSalario);
        }

    }
    
}
