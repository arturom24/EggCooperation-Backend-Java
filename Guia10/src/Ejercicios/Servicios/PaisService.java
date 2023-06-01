package Ejercicios.Servicios;

import Ejercicios.Entidades.Pais;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PaisService {

    private Set<Pais> paises;

    public PaisService() {
        paises = new HashSet<>();
    }

    public void agregarPais() {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Ingrese un pais:");
            String nombre = sc.nextLine();

            Pais pais = new Pais(nombre);

            if (paises.contains(pais)) {
                System.out.println("El pais ya esta en el conjunto.");
            } else {
                paises.add(pais);
                System.out.println("Pais agregado correctamente.");
            }

            while (true) {
                System.out.println("Desea guardar otro pais? (s/n)");
                String respuesta = sc.nextLine().trim().toLowerCase(); //.trim elimina espacios en blanco antes o despues de la entrada

                if (respuesta.equals("n")) {
                    salir = true;
                    break;
                } else if (respuesta.equals("s")) {
                    break;
                } else {
                    System.out.println("Valor ingresado no valido");
                }
            }

        }
    }

    public void mostrarPaises() {
        System.out.println("------Paises-----");

        for (Pais pais : paises) {
            System.out.println(pais.getNombre());
        }
    }

    public void mostrarPaisesOrdenados() {
        Set<Pais> paisesOrdenados = new TreeSet<>(new Pais.PaisComparator());

        paisesOrdenados.addAll(paises);

        System.out.println("------Paises Ordenados-----");
        for (Pais pais : paisesOrdenados) {
            System.out.println(pais.getNombre());
        }
    }

    public void eliminarPais() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un país a eliminar: ");
        String nombrePais = sc.nextLine();
        
        Iterator<Pais> iterator = paises.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            Pais pais = iterator.next();
            if (pais.getNombre().equalsIgnoreCase(nombrePais)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("País eliminado correctamente.");
            mostrarPaises();
        } else {
            System.out.println("El país no se encuentra en el conjunto.");
        }
    }

}
