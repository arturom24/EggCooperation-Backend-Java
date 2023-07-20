package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        
        System.out.println("Por favor, ingrese su nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("Hola " + nombre + ", ¡bienvenido!");
    }
    
}
