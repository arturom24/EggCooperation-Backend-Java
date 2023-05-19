package Ejercicios.Servicios;

import Ejercicios.Entidades.ParDeNumeros;
import java.text.DecimalFormat;

public class ParDeNumerosServicio {

    private ParDeNumeros parDeNumeros;

    public ParDeNumerosServicio(ParDeNumeros parDeNumeros) {
        this.parDeNumeros = parDeNumeros;
    }

    public void mostrarValores() {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Numero 1: " + (df.format(parDeNumeros.getNum1())));
        System.out.println("Numero 2: " + (df.format(parDeNumeros.getNum2())));
    }

    public void devolverMayor() {
        double num1 = parDeNumeros.getNum1();
        double num2 = parDeNumeros.getNum2();

        if (num1 > num2) {
            System.out.println("El mayor valor es: " + Math.round(num1 * 100d) / 100d);
        } else {
            System.out.println("El valor mayor es: " + Math.round(num2 * 100d) / 100d);
        }

    }

    public void calcularPotencia() {
        double num1 = parDeNumeros.getNum1();
        double num2 = parDeNumeros.getNum2();
        double mayor = (num1 > num2) ? num1 : num2;
        double menor = (num1 < num2) ? num1 : num2;

        menor = Math.round(menor * 100d) / 100d;
        mayor = Math.round(mayor * 100d) / 100d;

        double potencia = Math.pow(mayor, menor);

        System.out.println("La potencia del mayor valor elevado al menor valor es: " + Math.round(potencia * 100d) / 100d);
    }

    public void calcularRaiz() {
        double num1 = parDeNumeros.getNum1();
        double num2 = parDeNumeros.getNum2();

        double menor = (num1 < num2) ? num1 : num2;

        menor = Math.abs(menor);

        double raiz = Math.sqrt(menor);

        System.out.println("La raíz cuadrada del menor valor es: " + Math.round(raiz * 100d) / 100d);
    }
}
