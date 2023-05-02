package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un valor limite positivo: ");
        int limite = sc.nextInt();
        int suma = 0;
        int contador = 1;
        while (suma <= limite) {
            System.out.println("Introduce el numero " + contador + ": ");
            int numero = sc.nextInt();
            suma += numero;
            contador++;
        }
        System.out.println("La suma de los numeros introducidos supero el limite inicial.S");
        System.out.println("El total fue: " + suma);
    }
    
}
