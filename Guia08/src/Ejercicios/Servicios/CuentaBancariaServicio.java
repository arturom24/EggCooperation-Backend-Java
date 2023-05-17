package Ejercicios.Servicios;

import Ejercicios.Entidades.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    public CuentaBancaria crearCuenta() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de la cuenta:");
        int numeroCuenta = sc.nextInt();

        System.out.print("Ingrese el DNI del cliente: ");
        long dniCliente = sc.nextLong();

        System.out.print("Ingrese el saldo actual:");
        double saldoActual = sc.nextDouble();

        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }

    public void ingresar(CuentaBancaria cuenta, double cantidad) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + cantidad);
        System.out.println("Se ha ingresado " + cantidad + " pesos en la cuenta " + cuenta.getNumeroCuenta());
    }

    public void retirar(CuentaBancaria cuenta, double cantidad) {
        if (cuenta.getSaldoActual() < cantidad) {
            cantidad = cuenta.getSaldoActual();
            cuenta.setSaldoActual(0);
            System.out.println("La cuenta " + cuenta.getNumeroCuenta() + " ha sido vaciada. Se han retirado " + cantidad + " pesos.");
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
            System.out.println("Se han retirado " + cantidad + " pesos de la cuenta " + cuenta.getNumeroCuenta());
        }
    }

    public void extraccionRapida(CuentaBancaria cuenta) {
        double cantidad = cuenta.getSaldoActual() * 0.2;
//        if (cantidad > cuenta.getSaldoActual()) {
//            cantidad = cuenta.getSaldoActual();
//        }
        cuenta.setSaldoActual(cuenta.getSaldoActual() - cantidad);
        System.out.println("Se han retirado " + cantidad + " pesos de la cuenta " + cuenta.getNumeroCuenta() + " mediante extracción rápida.");
    }

    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("El saldo actual de la cuenta " + cuenta.getNumeroCuenta() + " es de " + cuenta.getSaldoActual() + " pesos.");
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("DNI del cliente: " + cuenta.getDniCliente());
        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
    }
}
