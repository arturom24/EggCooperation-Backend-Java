package Ejercicios.Ejercicio3;

import Ejercicios.Ejercicio2.Entidades.Electrodomestico;
import Ejercicios.Ejercicio2.Entidades.Lavadora;
import Ejercicios.Ejercicio2.Entidades.Televisor;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {
        List<Electrodomestico> electrodomesticos = new ArrayList<>();

        electrodomesticos.add(new Lavadora(1800, "negro", 'B', 30, 15));
        electrodomesticos.add(new Televisor(55, true, 1500, "azul", 'A', 45));
        electrodomesticos.add(new Lavadora(2000, "verde", 'A', 40, 25));
        electrodomesticos.add(new Televisor(32, false, 900, "blanco", 'F', 25));

        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            double precioFinal = electrodomestico.precioFinal();
            precioTotalElectrodomesticos += precioFinal;

            if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += precioFinal;
                System.out.println("Precio final de la Lavadora: $" + precioFinal);
            } else if (electrodomestico instanceof Televisor) {
                precioTotalTelevisores += precioFinal;
                System.out.println("Precio final del Televisor: $" + precioFinal);
            }
            
        }
        System.out.println("Precio total de los electrodomésticos: $" + precioTotalElectrodomesticos);
        System.out.println("Precio total de las lavadoras: $" + precioTotalLavadoras);
        System.out.println("Precio total de los televisores: $" + precioTotalTelevisores);

    }

}
