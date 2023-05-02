package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

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
