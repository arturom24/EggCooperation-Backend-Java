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

        System.out.println("Ingrese un numero:");

        int numero = sc.nextInt();

        System.out.println("El doble es: " + numero * 2);
        System.out.println("El triple es: " + numero * 3);
        System.out.println("La raiz cuadrada es: " + Math.sqrt(numero));
    }
    
}
