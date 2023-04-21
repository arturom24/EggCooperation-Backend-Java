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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        double num1 = sc.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        double num2 = sc.nextDouble();

        System.out.println("Ingrese la operacion que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        int opcion = sc.nextInt();

        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = suma(num1, num2);
                break;
            case 2:
                resultado = resta(num1, num2);
                break;
            case 3:
                resultado = multiplicacion(num1, num2);
                break;
            case 4:
                resultado = division(num1, num2);
                break;
            default:
                System.out.println("Opcion invalida.");
                break;
        }

        System.out.println("EL resultado es: " + resultado);
    }

    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    public static double resta(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero.");
            return 0;
        }
        return num1 / num2;
    }
}
