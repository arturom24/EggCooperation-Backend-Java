package Ejercicios.Ejercicio3.Servicios;

import Ejercicios.Ejercicio3.Entidades.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlumnoService {
    private final List<Alumno> listaAlumnos;
    
    public AlumnoService () {
        listaAlumnos = new ArrayList<>();
    }
    
    public void crearAlumno () {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del alumno:");
        String nombre = sc.nextLine();
        
        List<Integer> notas = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            System.out.println("Ingrese la nota " + i + " del alumno:");
            int nota = sc.nextInt();
            notas.add(nota);
        }
        
        Alumno alumno = new Alumno(nombre, notas);
        listaAlumnos.add(alumno);
        
        System.out.print("Desea crear otro alumno? (s/n)");
        String respuesta = sc.next();
        if (respuesta.equalsIgnoreCase("s")) {
            crearAlumno();
        }
    }
    
    public double notaFinal (String nombreAlumno) {
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                List<Integer> notas = alumno.getNotas();
                double promedio = calcularPromedio(notas);
                return promedio;
            }
        }
        return -1;
    }
    
    public double calcularPromedio(List<Integer> notas) {
        int suma = 0;
        for (int nota : notas) {
            suma += nota;
        }
        return (double) suma / notas.size();
    }
    
    public void mostrarAlumnos() {
        for (Alumno alumno : listaAlumnos) {
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Notas: " + alumno.getNotas());
            System.out.println("-------------------------");
        }
    }
}
