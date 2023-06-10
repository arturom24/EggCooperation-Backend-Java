package Ejercicios.Ejercicio4;

import Ejercicios.Ejercicio4.Servicios.FechaServicio;
import java.util.Date;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        Date fechaNacimiento = FechaServicio.fechaNacimiento();
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        
        Date fechaActual = FechaServicio.fechaActual();
        System.out.println("Fecha actual: " + fechaActual);
        
        int diferenciaAnios = FechaServicio.diferencia(fechaNacimiento, fechaActual);
        System.out.println("Edad del usuario: " + diferenciaAnios + " años.");
    }

}
