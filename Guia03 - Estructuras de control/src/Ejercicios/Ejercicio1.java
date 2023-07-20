package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println(num + " es un numero par.");
        } else {
            System.out.println(num + " es un numero impar.");
        }
    }
    
}
