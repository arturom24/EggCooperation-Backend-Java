package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        Random rand = new Random();

        int n, digito;

        System.out.println("Cuantos numeros deseas cargar de manera aleatoria?");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = rand.nextInt(30000);
            digito = contarDigitos(num);
            if (digito >= 1 && digito <= 5) {
                numeros[digito - 1]++;
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Cantidad de numeros con " + (i + 1) + " digito(s):" + numeros[i]);
        }
    }

    public static int contarDigitos(int num) {
        int contador = 0;
        while (num != 0) {
            num /= 10;
            contador++;
        }
        return contador;
    }

}
