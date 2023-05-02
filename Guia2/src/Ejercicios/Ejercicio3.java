package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase: ");
        frase = sc.nextLine();
        
        System.out.println("La frase en mayuscula es: " + frase.toUpperCase());
        System.out.println("La frase en minuscula es: " + frase.toLowerCase());
    }
    
}
