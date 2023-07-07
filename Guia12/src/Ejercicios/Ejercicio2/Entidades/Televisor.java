package Ejercicios.Ejercicio2.Entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean sintotizadorTDT;

    public Televisor() {
        super();
        this.resolucion = 20;
        this.sintotizadorTDT = false;
    }

    public Televisor(int resolucion, boolean sintotizadorTDT, double precio, String color, char consumo, double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintotizadorTDT = sintotizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintotizadorTDT() {
        return sintotizadorTDT;
    }

    public void setSintotizadorTDT(boolean sintotizadorTDT) {
        this.sintotizadorTDT = sintotizadorTDT;
    }

    public void crearTelevisor() {
        crearElectrodomestico();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la resolucion del televisor (en pulgadas): ");
        resolucion = sc.nextInt();
        sc.nextLine();
        System.out.print("Tiene sintorizador TDT? (si/no)");
        String opcion = sc.nextLine();
        sintotizadorTDT = opcion.equalsIgnoreCase("si");
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();

        if (resolucion > 40) {
            precioFinal *= 1.3;
        }

        if (sintotizadorTDT) {
            precioFinal += 500;
        }
        return precioFinal;
    }

}
