package Ejercicios.Ejercicio2;

import Ejercicios.Ejercicio2.Entidades.ParDeNumeros;
import Ejercicios.Ejercicio2.Servicios.ParDeNumerosServicio;

public class Ejercicio2 {

    public static void main(String[] args) {
        ParDeNumeros parDeNumeros = new ParDeNumeros();
        ParDeNumerosServicio servicio = new ParDeNumerosServicio(parDeNumeros);

        servicio.mostrarValores();
        servicio.devolverMayor();
        servicio.calcularPotencia();
        servicio.calcularRaiz();

    }

}
