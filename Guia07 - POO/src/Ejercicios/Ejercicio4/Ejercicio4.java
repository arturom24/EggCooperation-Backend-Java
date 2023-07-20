package Ejercicios.Ejercicio4;

import Ejercicios.Ejercicio4.Entidades.Rectangulo;

public class Ejercicio4 {

    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo(10, 10);

        System.out.println("Base: " + miRectangulo.getBase());
        System.out.println("Altura: " + miRectangulo.getAltura());
        System.out.println("Superficie: " + miRectangulo.calcularSuperficie());
        System.out.println("Perimetro: " + miRectangulo.calcularPerimetro());

        miRectangulo.dibujarRectangulo();
        
        miRectangulo.setAltura(5);
        miRectangulo.setBase(15);

        System.out.println("Base: " + miRectangulo.getBase());
        System.out.println("Altura: " + miRectangulo.getAltura());
        System.out.println("Superficie: " + miRectangulo.calcularSuperficie());
        System.out.println("Perimetro: " + miRectangulo.calcularPerimetro());
        
        miRectangulo.dibujarRectangulo();
    }

}
