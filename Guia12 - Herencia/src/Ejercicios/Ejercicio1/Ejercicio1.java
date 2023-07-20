package Ejercicios.Ejercicio1;

import Ejercicios.Ejercicio1.Entidades.Animal;
import Ejercicios.Ejercicio1.Entidades.Caballo;
import Ejercicios.Ejercicio1.Entidades.Gato;
import Ejercicios.Ejercicio1.Entidades.Perro;

public class Ejercicio1 {

    public static void main(String[] args) {
        Animal perro1 = new Perro("Stich", "Carnes", 15, "Doberman");
        perro1.alimentarse();

        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentarse();

        Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato1.alimentarse();

        Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo1.alimentarse();

    }

}
