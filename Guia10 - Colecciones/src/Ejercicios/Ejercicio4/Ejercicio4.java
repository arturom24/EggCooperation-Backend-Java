package Ejercicios.Ejercicio4;

import Ejercicios.Ejercicio4.Servicios.PeliculaService;

public class Ejercicio4 {

    public static void main(String[] args) {
        PeliculaService servicio = new PeliculaService();

        servicio.crearPelicula();
        
        servicio.mostrarPeliculas();
        
        servicio.mostrarPeliculasDuracionMayorAUnaHora();
        
        servicio.ordenarPeliculasPorDuracionDescendente();
        
        servicio.ordenarPeliculasPorDuracionAscendente();
        
        servicio.ordenarPeliculasPorTitulo();
        
        servicio.ordenarPeliculasPorDirector();
    }
    
    

}
