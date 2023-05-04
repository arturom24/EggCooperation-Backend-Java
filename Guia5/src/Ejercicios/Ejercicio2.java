package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el tamaño del vector: ");
        int n = sc.nextInt();

        int[] vector = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            vector[i] = rand.nextInt(10);
        }

//        System.out.println("Vector generado:");
//        for (int i = 0; i < n; i++) {
//            System.out.print(vector[i] + " ");
//        }
        
        System.out.println("");
        System.out.println("Ingrese el numero a buscar: ");
        int numBuscar = sc.nextInt();

        int pos = -1;
        boolean repetido = false;
        for (int i = 0; i < n; i++) {
            if (vector[i] == numBuscar) {
                if (pos == -1) {
                    pos = i;
                } else {
                    repetido = true;
                }
            }
        }

        if (pos == -1) {
            System.out.println("El numero no se encuentra en el vector.");
        } else {
            System.out.println("El numero se encuentra en la posicion " + pos + " del vector.");
            if (repetido) {
                System.out.println("El numero se encuentra repetido en el vector.");
            }
        }
    }

}
