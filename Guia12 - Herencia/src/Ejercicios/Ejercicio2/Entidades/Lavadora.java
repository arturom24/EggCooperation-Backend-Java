package Ejercicios.Ejercicio2.Entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(double precio, String color, char consumo, double peso, double carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        crearElectrodomestico();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la carga de la lavadora: ");
        carga = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (carga > 30) {
            precioFinal += 500;
        }
        return precioFinal;
    }

}
