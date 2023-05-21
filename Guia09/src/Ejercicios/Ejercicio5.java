package Ejercicios;

import Ejercicios.Entidades.Persona;
import Ejercicios.Servicios.PersonaServicio;

public class Ejercicio5 {

    public static void main(String[] args) {
        PersonaServicio servicio = new PersonaServicio();
        
        Persona persona = servicio.crearPersona();

        int edad = servicio.calcularEdad(persona);
        System.out.println("El usuario tiene: " + edad + " años.");

        int edadConsultada = 18;
        boolean esMenor = servicio.menorQue(persona, edadConsultada);
        System.out.println(esMenor ? "La persona es menor que " + edadConsultada + " años" : "La persona es mayor que " + edadConsultada + " años.");

        servicio.mostrarPersona(persona);

    }

}
