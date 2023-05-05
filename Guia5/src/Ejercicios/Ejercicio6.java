package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer de consola
        Scanner scanner = new Scanner(System.in);

        // Definimos la matriz de ejemplo
        int[][] matriz = new int[3][3];

        // Pedimos al usuario que introduzca los números
        System.out.println("Introduce los números para crear el cuadrado mágico:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Pedimos un número hasta que se introduzca uno válido
                int num;
                do {
                    System.out.print("Fila " + (i+1) + ", columna " + (j+1) + ": ");
                    num = scanner.nextInt();
                } while (num < 1 || num > 9);

                // Guardamos el número en la matriz
                matriz[i][j] = num;
            }
        }

        // Imprimimos la matriz
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Comprobamos si la matriz es un cuadrado mágico
        int suma = matriz[0][0] + matriz[0][1] + matriz[0][2];
        boolean esCuadradoMagico = true;
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;
            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }
            if (sumaFila != suma || sumaColumna != suma) {
                esCuadradoMagico = false;
                break;
            }
        }
        int sumaDiagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int sumaDiagonal2 = matriz[0][2] + matriz[1][1] + matriz[2][0];
        if (sumaDiagonal1 != suma || sumaDiagonal2 != suma) {
            esCuadradoMagico = false;
        }

        // Imprimimos el resultado
        if (esCuadradoMagico) {
            System.out.println("La matriz es un cuadrado mágico.");
        } else {
            System.out.println("La matriz no es un cuadrado mágico.");
        }
    }
}

