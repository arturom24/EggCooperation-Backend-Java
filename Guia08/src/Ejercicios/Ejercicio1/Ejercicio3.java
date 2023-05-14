package Ejercicios.Ejercicio1;

import Ejercicios.Ejercicio1.Entidades.Persona;
import Ejercicios.Ejercicio1.Servicios.PesonaServicio;

public class Ejercicio3 {

    public static void main(String[] args) {
        Persona persona = new Persona();

        PesonaServicio servicio = new PesonaServicio();

        servicio.crearPersona(persona);

        System.out.println("La persona es mayor de edad: " + servicio.esMayorDeEdad(persona));

        int imc = servicio.calcularIMC(persona);

        if (imc == -1) {
            System.out.println("La  persona esta por debajo de su peso ideal.");
        } else if (imc == 0) {
            System.out.println("La persona esta en su peso ideal.");
        } else {
            System.out.println("La persona tiene sobrepeso.");
        }

    }

}
