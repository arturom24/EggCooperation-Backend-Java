package Ejercicios.Servicios;

import Ejercicios.Entidades.Persona;
import java.util.Scanner;

public class PesonaServicio {

    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }

    public void crearPersona(Persona persona) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        persona.setNombre(sc.next());

        System.out.print("Ingrese la edad: ");
        while (!sc.hasNextInt()) {
            System.out.println("El valor ingresado no es valido.");
            System.out.print("Ingrese la edad: ");
            sc.next();
        }
        int edad = sc.nextInt();
        persona.setEdad(edad);
        sc.nextLine();

        System.out.print("Ingrese el sexo (H, M, O): ");
        char sexo = sc.nextLine().toUpperCase().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("El sexo ingresado no es correcto.");
            System.out.print("Ingrese el sexo (H, M, O): ");
            sexo = sc.nextLine().toUpperCase().charAt(0);
        }
        persona.setSexo(sexo);

        System.out.print("Ingrese el peso en kg: ");
        while (!sc.hasNextDouble()) {
            System.out.println("El valor ingresado no es válido.");
            System.out.print("Ingrese el peso en kg: ");
            sc.next(); // Consumir el token inválido
        }
        double peso = sc.nextDouble();
        persona.setPeso(peso);

        System.out.print("Ingrese la altura: ");
        while (!sc.hasNextDouble()) {
            System.out.println("El valor ingresado no es válido.");
            System.out.print("Ingrese la altura: ");
            sc.next(); // Consumir el token inválido
        }
        double altura = sc.nextDouble();
        persona.setAltura(altura);

    }

    public int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / (Math.pow(persona.getAltura(), 2));

        if (imc < 20) {
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return 1;
        }
    }
}
