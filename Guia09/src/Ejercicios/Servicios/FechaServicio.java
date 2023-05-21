package Ejercicios.Servicios;

import java.util.Date;
import java.util.Scanner;

public class FechaServicio {
    private static Scanner sc = new Scanner(System.in);
                
    public static Date fechaNacimiento () {
        System.out.println("Ingrese su fecha de nacimiento:");
        System.out.print("Dia:");
        int dia = sc.nextInt();
        System.out.print("Mes:");
        int mes = sc.nextInt() -1;
        System.out.print("Año:");
        int anio = sc.nextInt() -1900;
        
        return new Date(anio, mes, dia);
    }
    
    public static Date fechaActual () {
        return new Date();
    }
    
    public static int diferencia (Date fecha1, Date fecha2) {
        int anio1 = fecha1.getYear();
        int anio2 = fecha2.getYear();
        
        return Math.abs(anio1 - anio2);
    }
}
