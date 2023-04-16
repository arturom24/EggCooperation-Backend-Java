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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase: ");
        frase = sc.nextLine();
        
        System.out.println("La frase en mayuscula es: " + frase.toUpperCase());
        System.out.println("La frase en minuscula es: " + frase.toLowerCase());
    }
    
}
