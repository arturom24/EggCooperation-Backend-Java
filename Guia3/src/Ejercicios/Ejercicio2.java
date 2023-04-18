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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();
        
        if (frase.equalsIgnoreCase("eureka")) {
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto.");
        }
    }
    
}
