package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctCount = 0;
        int incorrectCount = 0;
        while (true) {
            System.out.print("Ingrese una cadena (debe tener 5 caracteres, comenzar con X y terminar con O): ");
            String input = sc.nextLine();
            if (input.equals("&&&&&")) {
                break;
            }
            if (input.length() != 5) {
                System.out.println("La cadena debe tener exactamente 5 caracteres.");
                incorrectCount++;
            } else if (input.charAt(0) != 'X') {
                System.out.println("La cadena debe comenzar con X.");
                incorrectCount++;
            } else if (input.charAt(4) != 'O') {
                System.out.println("La cadena debe terminar con O.");
                incorrectCount++;
            } else {
                System.out.println("Cadena válida.");
                correctCount++;
            }
        }
        System.out.println("Numero de lecturas correctas: " + correctCount);
        System.out.println("Numero de lecturas incorrectas: " + incorrectCount);
    }

}
