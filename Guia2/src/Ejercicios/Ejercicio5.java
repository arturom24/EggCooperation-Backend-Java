package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero:");

        int numero = sc.nextInt();

        System.out.println("El doble es: " + numero * 2);
        System.out.println("El triple es: " + numero * 3);
        System.out.println("La raiz cuadrada es: " + Math.sqrt(numero));
    }
    
}
