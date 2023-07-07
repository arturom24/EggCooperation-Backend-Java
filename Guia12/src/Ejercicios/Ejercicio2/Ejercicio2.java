package Ejercicios.Ejercicio2;

import Ejercicios.Ejercicio2.Entidades.Lavadora;
import Ejercicios.Ejercicio2.Entidades.Televisor;

public class Ejercicio2 {

    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        double precioLavadora = lavadora.precioFinal();
        System.out.println("Precio final de la lavadora: $" + precioLavadora);

        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        double precioTelevisor = televisor.precioFinal();
        System.out.println("Precio final de la lavadora: $" + precioTelevisor);
    }

}
