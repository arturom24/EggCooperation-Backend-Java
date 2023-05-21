package Ejercicios.Servicios;

import Ejercicios.Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    private final Scanner sc;

    public PersonaServicio() {
        this.sc = new Scanner(System.in);
    }

    public Persona crearPersona() {
        System.out.print("Ingrese el nombre:");
        String nombre = sc.nextLine().toUpperCase();

        System.out.println("Ingrese su fecha de nacimiento");
        System.out.print("Dia:");
        int dia = sc.nextInt();
        System.out.print("Mes:");
        int mes = sc.nextInt() - 1;
        System.out.print("Año:");
        int anio = sc.nextInt() - 1900;

        Date fechaNacimiento = new Date(anio, mes, dia);

        return new Persona(nombre, fechaNacimiento);
    }

    public int calcularEdad(Persona persona) {
        Date fechaActual = new Date();
        Date fechaNacimiento = persona.getFechaNacimiento();
        int diferencia = Math.abs(fechaNacimiento.getYear() - fechaActual.getYear());
        if (fechaNacimiento.getMonth() > fechaActual.getMonth()) {
            return diferencia - 1;
        } else {
            return diferencia;
        }
    }

    public boolean menorQue(Persona persona, int edad) {
        int edadPersona = calcularEdad(persona);
        return edadPersona < edad;
    }

    public void mostrarPersona(Persona persona) {

        if (persona.getNombre() == null && persona.getFechaNacimiento() == null) {
            System.out.println("Sin datos.");
        } else {
            System.out.println("Nombre:" + persona.getNombre());
            System.out.println("Fecha nacimiento: " + persona.getFechaNacimiento().toLocaleString());
            System.out.println("Edad: " + calcularEdad(persona) + " años.");
        }
    }
}
