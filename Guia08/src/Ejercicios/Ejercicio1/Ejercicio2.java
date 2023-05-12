package Ejercicios.Ejercicio1;

import Ejercicios.Ejercicio1.Entidades.Cafetera;
import Ejercicios.Ejercicio1.Servicios.CafeteraServicio;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cafetera cafetera = new Cafetera();
        CafeteraServicio servicio = new CafeteraServicio(cafetera);

        boolean salir = false;
        int opcion = 0;

        System.out.println("Bienvenido al programa.");

        do {
            System.out.println("\nSeleccione una opcion:");
            System.out.println("1. LLenar la cafetera.");
            System.out.println("2. Servir una taza de cafe.");
            System.out.println("3. Vaciar la cafetera.");
            System.out.println("4. Agregar cafe a la cafetera.");
            System.out.println("5. Consultar el estado de la cafetera.");
            System.out.println("6. Salir.");
            System.out.print("Elija una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    servicio.llenarCafetera();
                    break;
                case 2:
                    servicio.servirTaza();
                    break;
                case 3:
                    servicio.vaciarCafetera();
                    break;
                case 4:
                    servicio.agregarCafe();
                    break;
                case 5:
                    servicio.verEstado();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion invalida. Seleccione una opcion valida.");
            }

            System.out.println();
        } while (!salir);

    }

}
