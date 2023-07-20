package Ejercicios.Ejercicio3.Entidades;

import java.util.List;

public class Alumno {
    private String nombre;
    private List<Integer> notas;
    
    
    public Alumno (String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }
    
    public String getNombre () {
        return nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    } 
    
}
