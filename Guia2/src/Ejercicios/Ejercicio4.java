package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int F, C;

        System.out.println("Ingrese los grados centigrados:");

        C = sc.nextInt();

        F = 32 + (9 * C / 5);

        System.out.println(C + "° Celsius equivalen a " + F + "° Fahrenheit.");
    }

}
