package Ejercicios.Servicios;

import Ejercicios.Entidades.Pelicula;
import java.util.Comparator;

public class Comparadores {

    //COMPARADORES DEL EJERCICIO 4   
    //expresión lambda
    public static Comparator<Pelicula> porDuracionDescendente = (Pelicula p1, Pelicula p2) -> Double.compare(p2.getDuracion(), p1.getDuracion());

    //Comparator:
    /**
     * public static Comparator<Pelicula> porDuracionDescendente = new
     * Comparator<Pelicula>() {
     *
     * @Override public int compare(Pelicula p1, Pelicula p2) { return
     * Double.compare(p2.getDuracion(), p1.getDuracion()); } };
    *
     */
    public static Comparator<Pelicula> porDuracionAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return Double.compare(p1.getDuracion(), p2.getDuracion());
        }
    };

    public static Comparator<Pelicula> porTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareToIgnoreCase(p2.getTitulo());
        }
    };

    public static Comparator<Pelicula> porDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareToIgnoreCase(p2.getDirector());
        }
    };

}
