package Ejercicios;

import java.util.Random;

public class Ejercicio4 {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Random rand = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = rand.nextInt(10);
            }
        }
        //mostramos la matriz original
        System.out.println("Matriz original:");
        mostrarMatriz(matriz);

        //creamos la matriz traspuesta
        int[][] traspuesta = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                traspuesta[i][j] = matriz[j][i];
            }
        }

        System.out.println("Matriz traspuesta:");
        mostrarMatriz(traspuesta);
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }

}
