package Ejercicios.Ejercicio4.Servicios;

import Ejercicios.Ejercicio4.Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PeliculaService {

    private final List<Pelicula> listaPeliculas;

    public PeliculaService() {
        listaPeliculas = new ArrayList<>();
    }

    public void crearPelicula() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el titulo de la pelicula:");
        String titulo = sc.nextLine();

        System.out.println("Ingrese el director de la pelicula: ");
        String director = sc.nextLine();

        System.out.println("Ingrese la duracion de la pelicula en horas:");
        while (!sc.hasNextDouble()) {
            System.out.println("El valor ingresado no es valido.");
            sc.next();
        }
        double duracion = sc.nextDouble();

        Pelicula pelicula = new Pelicula(titulo, director, duracion);

        listaPeliculas.add(pelicula);

        System.out.println("Desea crear otra pelicula? (s/n)");
        String respuesta = sc.next();

        if (respuesta.equalsIgnoreCase("s")) {
            crearPelicula();
        }
    }

    public void mostrarPeliculas() {
        System.out.println("------ Todas las películas ------");
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println("Titulo: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duracion: " + pelicula.getDuracion() + " horas.");
            System.out.println("------------------------");
        }
    }

    public void mostrarPeliculasDuracionMayorAUnaHora() {
        System.out.println("------ Películas con duración mayor a 1 hora ------");
        for (Pelicula pelicula : listaPeliculas) {
            if (pelicula.getDuracion() >= 1.0) {
                System.out.println("Titulo: " + pelicula.getTitulo());
                System.out.println("Director: " + pelicula.getDirector());
                System.out.println("Duracion: " + pelicula.getDuracion() + "h");
                System.out.println("------------------------");
            }
        }
    }

    public void ordenarPeliculasPorDuracionDescendente() {
        System.out.println("------ Películas ordenadas por duración, de mayor a menor ------");
        Collections.sort(listaPeliculas, Comparadores.porDuracionDescendente);

        for (Pelicula pelicula : listaPeliculas) {
            System.out.println("Titulo: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duracion: " + pelicula.getDuracion() + "h");
            System.out.println("------------------------");
        }
    }

    // Ejemplo de como seria usar una expresion lambda dentro de Collections.sort()
    /**
     * public void ordenarPeliculasPorDuracionDescendente() {
     * System.out.println("Películas ordenadas por duración (de mayor a
     * menor):"); Collections.sort(listaPeliculas, (p1, p2) ->
     * Double.compare(p2.getDuracion(), p1.getDuracion()));
     *
     * for (Pelicula pelicula : listaPeliculas) { System.out.println("Título: "
     * + pelicula.getTitulo()); System.out.println("Director: " +
     * pelicula.getDirector()); System.out.println("Duración: " +
     * pelicula.getDuracion() + " horas");
     * System.out.println("------------------------"); }*
     */
    public void ordenarPeliculasPorDuracionAscendente() {
        System.out.println("------ Películas ordenadas por duración, de menor a mayor ------");
        Collections.sort(listaPeliculas, Comparadores.porDuracionAscendente);

        for (Pelicula pelicula : listaPeliculas) {
            System.out.println("Titulo: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duracion: " + pelicula.getDuracion() + "h");
            System.out.println("------------------------");
        }
    }

    public void ordenarPeliculasPorTitulo() {
        System.out.println("------ Películas ordenadas por título ------");
        Collections.sort(listaPeliculas, Comparadores.porTitulo);

        for (Pelicula pelicula : listaPeliculas) {
            System.out.println("Titulo: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duracion: " + pelicula.getDuracion() + "h");
            System.out.println("------------------------");
        }
    }

    public void ordenarPeliculasPorDirector() {
        System.out.println("------ Películas ordenadas por director ------");
        Collections.sort(listaPeliculas, Comparadores.porDirector);

        for (Pelicula pelicula : listaPeliculas) {
            System.out.println("Titulo: " + pelicula.getTitulo());
            System.out.println("Director: " + pelicula.getDirector());
            System.out.println("Duracion: " + pelicula.getDuracion() + "h");
            System.out.println("------------------------");
        }
    }

}
