package Ejercicios.Entidades;

import java.util.Random;

public class ParDeNumeros {

    private double num1;
    private double num2;

    public ParDeNumeros() {
        Random random = new Random();
        this.num1 = random.nextDouble() * 10;
        this.num2 = random.nextDouble() * 10;
    }

    public ParDeNumeros(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "ParDeNumeros{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }

}
