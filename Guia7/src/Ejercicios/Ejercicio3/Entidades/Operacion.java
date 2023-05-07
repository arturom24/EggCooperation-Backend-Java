package Ejercicios.Ejercicio3.Entidades;

import java.util.Scanner;

public class Operacion {
    private double num1, num2;

    public Operacion() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del numero 1:");
        double num1 = sc.nextInt();
        
        System.out.println("Ingrese el valor del numero 2:");
        double num2 = sc.nextInt();
        
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public double sumar() {
        return num1 + num2;
    }
    
    public double restar() {
        return num1 - num2;
    }
    
    public double multiplicar() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error: no se puede multiplicar por cero.");
            return 0;
        } else {
            return num1 * num2;
        }
    }
    
    public double dividir() {
        if (num2 == 0) {
            System.out.println("Error: no se puede dividir por cero.");
            return 0;
        } else {
            return num1 / num2;
        }
    }
}
