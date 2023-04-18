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
        System.out.println("Introduce una frase o palabra de 8 caracteres: ");
        String palabra = sc.nextLine();
        if (palabra.length() == 8) {
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto.");
        }
    }
    
}
