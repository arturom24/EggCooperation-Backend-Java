package Ejercicios.Ejercicio1.Entidades;

import java.util.Scanner;

public class Libro {

    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    public Libro() {}

    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void cargarLibro() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de ISBN: ");
        this.isbn = sc.nextLine();
        System.out.print("Ingrese el título del libro: ");
        this.titulo = sc.nextLine();
        System.out.print("Ingrese el nombre del autor: ");
        this.autor = sc.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        this.numPaginas = sc.nextInt();
    }

    public void mostrarInfo() {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPaginas);
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + '}';
    }
    
}
