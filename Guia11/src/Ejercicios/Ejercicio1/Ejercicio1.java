package Ejercicios.Ejercicio1;

import Ejercicios.Ejercicio1.Entidades.Perro;
import Ejercicios.Ejercicio1.Entidades.Persona;
import Ejercicios.Ejercicio1.Servicios.PersonaService;

public class Ejercicio1 {

    public static void main(String[] args) {
        Perro perro1 = new Perro("chiquito", "beable", 3, "Pequeño");
        Perro perro2 = new Perro("lola", "caniche", 2, "Mediano");

        Persona persona1 = new Persona("Paco", "Gimenez", 12, 123142, perro1);
        Persona persona2 = new Persona("Carlos", "Perez", 16, 72123, perro2);

        PersonaService.mostrarInformacionPersona(persona1);
        System.out.println();
        PersonaService.mostrarInformacionPersona(persona2);
    }
}
