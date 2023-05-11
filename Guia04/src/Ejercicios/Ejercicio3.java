package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de euro a convertir: ");
        double cantidadEuros = sc.nextDouble();
        System.out.println("Introduce la moneda a la que deseas convertir (libras, dolares o yenes): ");
        String moneda = sc.next().toLowerCase();
        convertirMoneda(cantidadEuros, moneda);
    }
    
    public static void convertirMoneda(double cantidadEuros, String moneda){
        double conversion;
        switch(moneda) {
            case "libras":
                conversion = cantidadEuros * 0.86;
                System.out.println(cantidadEuros + " € equivale a " + conversion + " libras.");
                break;
            case "dolares":
                conversion = cantidadEuros * 1.28611;
                System.out.println(cantidadEuros + " € equivale a " + conversion + " dólares.");
            case "yenes":
                conversion = cantidadEuros * 129.852;
                System.out.println(cantidadEuros + " € equivale a " + conversion + " yenes.");
                break;
            default:
                System.out.println("La moneda introducida no es valida.");
        }
    }
    
}
