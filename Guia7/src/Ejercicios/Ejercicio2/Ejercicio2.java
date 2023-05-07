package Ejercicios.Ejercicio2;

import Ejercicios.Ejercicio2.Entidades.Circunferencia;

public class Ejercicio2 {

    public static void main(String[] args) {
        Circunferencia circ1 = new Circunferencia();
        
        circ1.crearCircunferencia();
        System.out.println("Circunferencia 1:");
        System.out.println("Radio: " + circ1.getRadio());
        System.out.println("Area: " + circ1.area());
        System.out.println("Perimetro: " + circ1.perimetro());
    }

}
