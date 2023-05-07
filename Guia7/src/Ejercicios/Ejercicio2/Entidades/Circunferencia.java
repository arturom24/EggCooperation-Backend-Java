package Ejercicios.Ejercicio2.Entidades;

import java.util.Scanner;

public class Circunferencia {

    private double radio;

    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio:");
        double radio = sc.nextDouble();
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }

}
