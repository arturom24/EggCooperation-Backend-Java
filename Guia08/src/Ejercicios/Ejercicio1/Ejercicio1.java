package Ejercicios.Ejercicio1;

import Ejercicios.Ejercicio1.Entidades.CuentaBancaria;
import Ejercicios.Ejercicio1.Servicios.CuentaBancariaServicio;

public class Ejercicio1 {

    public static void main(String[] args) {
        CuentaBancariaServicio servicio = new CuentaBancariaServicio();

        CuentaBancaria cuenta1 = servicio.crearCuenta();

        servicio.ingresar(cuenta1, 100);
        servicio.consultarSaldo(cuenta1);
        servicio.extraccionRapida(cuenta1);
        servicio.consultarSaldo(cuenta1);
        servicio.extraccionRapida(cuenta1);
        servicio.consultarSaldo(cuenta1);
        servicio.retirar(cuenta1, 200);
    }

}
