package Ejercicios.Ejercicio6.Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaService {

    private Map<String, Double> productos;
    private final Scanner sc;

    public TiendaService() {
        productos = new HashMap<>();
        sc = new Scanner(System.in);

    }

    public void cargarProducto() {

        boolean agregarProductos = true;

        while (agregarProductos) {
            System.out.println("Ingrese el nombre del producto:");
            String nombre = sc.nextLine();

            System.out.println("Ingrese el precio del producto:");
            while (!sc.hasNextDouble()) {
                System.out.println("Ingrese un valor numerico");
                sc.next();
            }
            double precio = sc.nextDouble();

            productos.put(nombre, precio);

            System.out.println("Producto cargado correctamente.");
            sc.nextLine();

            while (true) {
                System.out.println("Desea agregar mas productos? (s/n)");
                String respuesta = sc.nextLine().toLowerCase();
                if (respuesta.equals("s")) {
                    break;
                } else if (respuesta.equals("n")) {
                    agregarProductos = false;
                    break;
                } else {
                    System.out.println("Valor ingresado no valido");
                }
            }
        }

    }
    
    public void modificarPrecio () {
        System.out.println("Ingrese el nombre del producto:");
        String nombre = sc.nextLine();
        
        if (productos.containsKey(nombre)) {
            System.out.println("Ingrese el nuevo precio del producto:");
            double precio = sc.nextDouble();
            productos.put(nombre, precio);
            System.out.println("Precio del producto modificado.");
        } else {
            System.out.println("El producto no existe.");
        }
        sc.nextLine();
    }
    
    public void eliminarProducto () {
        System.out.println("Ingrese el nombre del producto:");
        String nombre = sc.nextLine();
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("El producto no existe.");
        }
    }

    public void mostrarProductos() {
        System.out.println("Lista de productos:");

        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();

            System.out.println(key + ": $" + value);
        }
    }
}
