package Ejercicios.Ejercicio3;

import Ejercicios.Ejercicio3.Servicios.AlumnoService;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        AlumnoService servicio = new AlumnoService();
        servicio.crearAlumno();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del alumno para calcular su nota:");
        String nombreAlumno = sc.nextLine();
        
        double notaFinal = servicio.notaFinal(nombreAlumno);
        if (notaFinal != -1) {
            System.out.println("La nota final de " + nombreAlumno + " es: " + notaFinal);
        } else {
            System.out.println("El alumno no se encuentra en la lista.");
        }
        
        servicio.mostrarAlumnos();
    }

}
