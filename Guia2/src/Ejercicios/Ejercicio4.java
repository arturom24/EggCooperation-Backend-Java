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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int F, C;

        System.out.println("Ingrese los grados centigrados:");

        C = sc.nextInt();

        F = 32 + (9 * C / 5);

        System.out.println(C + "° Celsius equivalen a " + F + "° Fahrenheit.");
    }

}
