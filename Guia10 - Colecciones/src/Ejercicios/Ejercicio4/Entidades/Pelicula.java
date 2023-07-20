package Ejercicios.Ejercicio4.Entidades;

public class Pelicula {

    private final String titulo;
    private final String director;
    private final double duracion;

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public double getDuracion() {
        return duracion;
    }
}
