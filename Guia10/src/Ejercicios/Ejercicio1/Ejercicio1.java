package Ejercicios.Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> razasDePerros = new ArrayList<>();
        
        boolean salir = false;
        
        while (!salir ) {            
            System.out.print("Ingrese la raza del perro:");
            String raza = sc.nextLine();
            razasDePerros.add(raza);
            
            System.out.print("Desea guardar otro perro? (S/N): ");
            char respuesta = sc.next().toUpperCase().charAt(0);
            sc.nextLine();
            if (respuesta == 'N') {
                System.out.println("Saliendo del programa...");
                salir = true;
            }
            
            System.out.println();
        }
        
        System.out.println("Perros guardados:");
        
        for (String raza : razasDePerros) {
            System.out.println(raza);
        }
    }

}
