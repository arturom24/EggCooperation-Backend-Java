package Ejercicios.Ejercicio2.Entidades;

import java.util.Scanner;

public abstract class Electrodomestico {

    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
        this.precio = 1000;
        this.color = "blanco";
        this.consumoEnergetico = 'F';
        this.peso = 1;
    }

    public Electrodomestico(double precio, String color, char consumo, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumoEnergetico;
    }

    public void setConsumo(char consumo) {
        this.consumoEnergetico = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comprobarConsumoEnergetico() {
        if (consumoEnergetico < 'A' || consumoEnergetico > 'F') {
            consumoEnergetico = 'F';
        }
    }

    public void comprobarColor() {
        String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean colorValido = false;
        for (String colorDisponible : coloresDisponibles) {
            if (color.equalsIgnoreCase(colorDisponible)) {
                colorValido = true;
                break;
            }
        }
        if (!colorValido) {
            color = "blanco";
        }
    }

    public void crearElectrodomestico() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el color del electrodomoestico: ");
        color = sc.nextLine();
        comprobarColor();
        System.out.print("Ingrese el consumo energetico (letras entre A y F): ");
        consumoEnergetico = sc.nextLine().toUpperCase().charAt(0);
        comprobarConsumoEnergetico();
        System.out.print("Ingrese el peso del electrodomestico: ");
        peso = sc.nextDouble();
        sc.nextLine();
    }

    public double precioFinal() {
        double precioFinal = precio;

        switch (consumoEnergetico) {
            case 'A':
                precioFinal += 1000;
                break;
            case 'B':
                precioFinal += 800;
                break;
            case 'C':
                precioFinal += 600;
                break;
            case 'D':
                precioFinal += 500;
                break;
            case 'E':
                precioFinal += 300;
                break;
            case 'F':
                precioFinal += 100;
                break;
        }

        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (precio >= 80) {
            precioFinal += 1000;
        }
        return precioFinal;
    }
}
