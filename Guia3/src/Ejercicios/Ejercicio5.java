/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author artur
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un valor limite positivo: ");
        int limite = sc.nextInt();
        int suma = 0;
        int contador = 1;
        while (suma <= limite) {
            System.out.println("Introduce el numero " + contador + ": ");
            int numero = sc.nextInt();
            suma += numero;
            contador++;
        }
        System.out.println("La suma de los numeros introducidos supero el limite inicial.S");
        System.out.println("El total fue: " + suma);
    }
    
}
