package Ejercicios.Ejercicio3.Servicios;

import java.util.Arrays;
import java.util.Random;

public class ArregloServicio {

    private Random random;

    public ArregloServicio() {
        random = new Random();
    }

    public void inicializarA(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.round((random.nextDouble() * 10) * 100d) / 100d;
        }
    }

    public void mostrar(double[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }

    public void ordenar(double[] arreglo) {
        Arrays.sort(arreglo);

        int i = 0;
        int j = arreglo.length - 1;

        while (i < j) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[j];
            arreglo[j] = temp;
            System.out.println("Intercambio: " + temp + " -> " + arreglo[i] + " <-> " + arreglo[j]);
            i++;
            j--;
        }

    }

    public void inicializarB(double[] arregloA, double[] arregloB) {
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        Arrays.fill(arregloB, 10, arregloB.length, 0.5);
    }

}
