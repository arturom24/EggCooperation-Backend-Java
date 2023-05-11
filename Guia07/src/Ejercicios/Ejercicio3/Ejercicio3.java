package Ejercicios.Ejercicio3;

import Ejercicios.Ejercicio3.Entidades.Operacion;

public class Ejercicio3 {

    public static void main(String[] args) {
        Operacion op1 = new Operacion();
        
        op1.crearOperacion();
        
        System.out.println("La suma es: " + op1.sumar());
        System.out.println("La resta es: " + op1.restar());
        System.out.println("La multiplicacion es: " + op1.multiplicar());
        System.out.println("La division es: " + op1.dividir());
    }

}
