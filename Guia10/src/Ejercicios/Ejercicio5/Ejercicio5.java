package Ejercicios.Ejercicio5;

import Ejercicios.Ejercicio5.Servicios.PaisService;

public class Ejercicio5 {

    public static void main(String[] args) {
        PaisService servicio = new PaisService();
        
        servicio.agregarPais();
        
        servicio.mostrarPaises();
        
        servicio.mostrarPaisesOrdenados();
        
        servicio.eliminarPais();
    }

}
