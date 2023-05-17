package Ejercicios.Servicios;

import Ejercicios.Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    private Cafetera cafetera;

    public CafeteraServicio(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public void llenarCafetera() {
        System.out.println("La cafetera ha sido llenada.");
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
    }

    public void servirTaza() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la taza (ml):");
        double taza = sc.nextDouble();
        double cantidadActual = cafetera.getCantidadActual();
        double capacidadMaxima = cafetera.getCapacidadMaxima();

        if (taza > capacidadMaxima) {
            System.out.println("La taza es demasiado grande...");
        } else if (taza > cantidadActual) {
            cafetera.setCantidadActual(0);
            System.out.println("No se pudo llenar la taza. Se sirvieron " + cantidadActual + " ml.");
        } else if (taza >= 0 && taza <= cantidadActual) {
            cafetera.setCantidadActual(cantidadActual - taza);
            System.out.println("Taza servida. Quedan " + cafetera.getCantidadActual() + " ml en la cafetera.");
        } else {
            System.out.println("Opcion invalida.");
        }
    }

    public void vaciarCafetera() {
        System.out.println("La cafetera ha sido vaciada.");
        cafetera.setCantidadActual(0);
    }

    public void agregarCafe() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de cafe que desea agregar (ml):");
        double cantidadCafe = sc.nextDouble();
        double limiteCafe = cafetera.getCapacidadMaxima() - cafetera.getCantidadActual();
        if (cantidadCafe > limiteCafe) {
            System.out.println("No puedes pasar el limite de la cafetera.");
        } else {
            cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidadCafe);
            System.out.println(cantidadCafe + " ml de cafe han sido agregados a la cafetera.");
        }
    }

    public void verEstado() {
        System.out.println("Capacidad máxima de la cafetera: " + cafetera.getCapacidadMaxima() + " ml");
        System.out.println("Cantidad actual de café en la cafetera: " + cafetera.getCantidadActual() + " ml");
    }
}
