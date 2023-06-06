package Ejercicios.Servicios;

import Ejercicios.Entidades.Persona;

public class PersonaService {

    public static void mostrarInformacionPersona(Persona persona) {
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Documento: " + persona.getDocumento());
        System.out.println("Perro:");
        System.out.println("Nombre: " + persona.getPerro().getNombre());
        System.out.println("Raza: " + persona.getPerro().getRaza());
        System.out.println("Edad: " + persona.getPerro().getEdad());
        System.out.println("Tamaño: " + persona.getPerro().getTamaño());
    }
}
