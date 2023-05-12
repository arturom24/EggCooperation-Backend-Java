package Ejercicios.Ejercicio1.Entidades;

public class Cafetera {

    private double capacidadMaxima;
    private double cantidadActual;

    public Cafetera() {
        this.capacidadMaxima = 2000;
        this.cantidadActual = 0;
    }

    public double getCapacidadMaxima() {
        return this.capacidadMaxima;
    }

    public double setCapacidadMaxima(double capacidadMaxima) {
        return this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public double setCantidadActual(double cantidadActual) {
        return this.cantidadActual = cantidadActual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
}
