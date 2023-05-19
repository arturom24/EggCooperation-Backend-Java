package Ejercicios;

import Ejercicios.Entidades.ParDeNumeros;
import Ejercicios.Servicios.ParDeNumerosServicio;

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
