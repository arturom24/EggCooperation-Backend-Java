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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de personas a ingresar: ");
        int N = sc.nextInt();
        String seguir = "Si";

        for (int i = 0; i < N && seguir.equalsIgnoreCase("Si"); i++) {
            String nombre = pedirNombre(i);
            int edad = pedirEdad(nombre);
            mostrarDatos(nombre, edad);
            mostrarMayorMenor(nombre, edad);

            System.out.println("Desea seguir ingresando personas? (Si/No)");
            seguir = sc.next();
        }
    }

    public static String pedirNombre(int numeroPersona) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona " + (numeroPersona + 1) + ": ");
        String nombre = sc.next();
        return nombre;
    }

    public static int pedirEdad(String nombre) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la edad de " + nombre + ": ");
        int edad = sc.nextInt();
        return edad;
    }

    public static void mostrarDatos(String nombre, int edad) {
        System.out.println(nombre + " tiene " + edad + " años.");
    }

    public static void mostrarMayorMenor(String nombre, int edad) {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " es menor de edad.");
        }
    }

}
