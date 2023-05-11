package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int numero1, numero2;
        boolean salir = false;
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el primer numero: ");
                    numero1 = sc.nextInt();
                    System.out.println("Introduce el segundo numero: ");
                    numero2 = sc.nextInt();
                    System.out.println("La suma es: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("Introduce el primer numero: ");
                    numero1 = sc.nextInt();
                    System.out.println("Introduce el segundo numero: ");
                    numero2 = sc.nextInt();
                    System.out.println("La resta es: " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("Introduce el primer numero: ");
                    numero1 = sc.nextInt();
                    System.out.println("Introduce el segundo numero: ");
                    numero2 = sc.nextInt();
                    System.out.println("EL producto es: " + (numero1 * numero2));
                    break;
                case 4:
                    System.out.println("Introduce el primer numero: ");
                    numero1 = sc.nextInt();
                    System.out.println("Introduce el segundo numero: ");
                    numero2 = sc.nextInt();
                    if (numero2 != 0) {
                        System.out.println("La division es: " + ((double) numero1 / numero2));
                    } else {
                        System.out.println("No se puede dividir por cero.");
                    }
                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir del programa (S/N?");
                    char confirmacion = sc.next().charAt(0);
                    if (confirmacion == 'S' || confirmacion == 's') {
                        salir = true;
                        System.out.println("Saliendo del programa...");
                    } else if (confirmacion == 'N' || confirmacion == 'n') {
                        salir = false;
                    } else {
                        System.out.println("Opcion invalida.");
                    }
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println("");
        } while (!salir);
    }

}
