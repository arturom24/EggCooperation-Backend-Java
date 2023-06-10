package Ejercicios.Ejercicio3;

import Ejercicios.Ejercicio3.Servicios.ArregloServicio;

public class Ejercicio3 {

    public static void main(String[] args) {
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        ArregloServicio servicio = new ArregloServicio();
        
        servicio.inicializarA(arregloA);
        servicio.mostrar(arregloA);
        servicio.ordenar(arregloA);
        servicio.mostrar(arregloA);
        servicio.inicializarA(arregloB);
        servicio.mostrar(arregloB);
        servicio.inicializarB(arregloA, arregloB);
        servicio.mostrar(arregloB);
    }
    
}
