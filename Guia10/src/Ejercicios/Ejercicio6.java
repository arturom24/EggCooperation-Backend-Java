package Ejercicios;

import Ejercicios.Servicios.TiendaService;
import java.util.Scanner;

public class Ejercicio6 {
    
    public static boolean salir = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TiendaService servicio = new TiendaService();

        while (!salir) {
            System.out.println("Tienda App");
            System.out.println("1. Cargar producto.");
            System.out.println("2. Modificar precio.");
            System.out.println("3. Eliminar producto.");
            System.out.println("4. Mostrar producto.");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.println("Elige una opcion:");
            while (!sc.hasNextInt()) {
                System.out.println("Ingrese un numero!");
                sc.next();
            }
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    servicio.cargarProducto();
                    break;
                case 2:
                    servicio.modificarPrecio();
                    break;
                case 3:
                    servicio.eliminarProducto();
                    break;
                case 4:
                    servicio.mostrarProductos();
                    break;
                case 5:
                    salirMenu();
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
            }
            System.out.println();
        }

    }

    public static void salirMenu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Esta seguro que desea salir del programa? (s/n)");
            String respuesta = sc.nextLine().trim().toLowerCase();
            
            if (respuesta.equals("s")) {
                System.out.println("Saliendo del programa...");
                salir = true;
                break;
            } else if ( respuesta.equals("n")) {
                break;
            } else {
                System.out.println("Valor ingresado no valido.");
            }
        }
    }

}
