package Ejercicios.Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> razasPerros = new ArrayList<>();

        boolean salir = false;
        char confirmacion;

        while (!salir) {
            System.out.print("Ingrese la raza del perro:");
            razasPerros.add(sc.nextLine());

            System.out.print("Desea guardar otro perro? (s/n)");
            while (true) {
                String input = sc.nextLine().toLowerCase();
                if (input.length() == 1 && input.charAt(0) == 's' || input.charAt(0) == 'n') {
                    confirmacion = input.charAt(0);
                    break;
                } else {
                    System.out.print("Ingrese un valor valido (s/n)");
                }
            }
            if (confirmacion == 'n') {
                salir = true;
            }

        }

        System.out.println("\nPerros guardados:");
        mostrarListaOrdenada(razasPerros);

        System.out.print("\nIngrese un perro a eliminar:");
        String perroEliminar = sc.nextLine();

        Iterator<String> iterator = razasPerros.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            String raza = iterator.next();

            if (raza.equalsIgnoreCase(perroEliminar)) {
                iterator.remove();
                encontrado = true;
            }
        }

        System.out.println("\nLista actualizada:");
        mostrarListaOrdenada(razasPerros);

        if (!encontrado) {
            System.out.println("\nEl perro no se encuentra en la lista:");
        }

    }

    private static void mostrarListaOrdenada(ArrayList<String> lista) {
        Collections.sort(lista);

        for (String raza : lista) {
            System.out.println(raza);
        }
    }

}
