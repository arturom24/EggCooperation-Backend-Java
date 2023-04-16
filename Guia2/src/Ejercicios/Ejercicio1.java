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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, num2, resultado;
        
        System.out.println("Ingrese el primer numero entero: ");
        num1 = sc.nextInt();
        
        System.out.println("Ingrese el segundo numero entero: ");
        num2 = sc.nextInt();
        
        resultado = num1 + num2;
        
        System.out.println("El resultado de la suma es: " + resultado);
    }
    
}
