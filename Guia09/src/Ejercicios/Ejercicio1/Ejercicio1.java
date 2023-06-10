package Ejercicios.Ejercicio1;

import Ejercicios.Ejercicio1.Entidades.Cadena;
import Ejercicios.Ejercicio1.Servicios.CadenaServicio;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Cadena cadena = new Cadena();
        CadenaServicio servicio = new CadenaServicio(cadena);
        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        int opcion = 0;
        String letra, otraFrase;

        do {
            if (cadena.getFrase() != null) {
                System.out.println("FRASE ACTUAL: " + cadena.getFrase());
            } else {
                System.out.println("Ingrese una frase:");
                cadena.setFrase(sc.nextLine());
            }

            System.out.println("1. MOSTRAR VOCALES.");
            System.out.println("2. INVERTIR FRASE.");
            System.out.println("3. VECES REPETIDO.");
            System.out.println("4. COMPARAR LONGITUD.");
            System.out.println("5. UNIR FRASES.");
            System.out.println("6. REEMPLAZAR LETRA.");
            System.out.println("7. CONTIENE.");
            System.out.println("8. SALIR.");
            System.out.print("Elija una opcion: ");
            while (!sc.hasNextInt()) {
                System.out.println("El valor ingresado no es valido.");
                System.out.println("Elija una opcion:");
                sc.next();
            }
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    servicio.mostrarVocales();
                    break;
                case 2:
                    servicio.invertirFrase();
                    break;
                case 3:
                    System.out.println("Ingrese una letra:");
                    letra = sc.next();
                    servicio.vecesRepetido(letra);
                    break;
                case 4:
                    System.out.println("Ingrese una frase:");
                    sc.next();
                    otraFrase = sc.nextLine();
                    servicio.compararLongitud(otraFrase);
                    break;
                case 5:
                    System.out.println("Ingrese una frase:");
                    sc.next();
                    otraFrase = sc.nextLine();
                    servicio.unirFrases(otraFrase);
                    break;
                case 6:
                    System.out.println("Ingresa la letra que deseas reemplazar:");
                    letra = sc.next();
                    System.out.println("Ingrese el reemplazo:");
                    String reemplazo = sc.next();
                    servicio.reemplazar(letra, reemplazo);
                    break;
                case 7:
                    System.out.println("Ingrese una letra:");
                    letra = sc.next();
                    System.out.println(servicio.contiene(letra) == true ?
                            "La frase contiene la letra ingresada." :
                            "La frase no contiene la letra ingresada.");
                    break;
                case 8:
                    System.out.println("Desea continuar? (S/N)");
                    char confirmacion = sc.next().toUpperCase().charAt(0);

                    if (confirmacion == 'S') {
                        salir = true;
                        System.out.println("Saliendo del programa...");
                    } else if (confirmacion == 'N' || confirmacion == 'n') {
                        salir = false;
                    } else {
                        System.out.println("Opcion invalida.");
                    }
                    break;
                default:
                    System.out.println("Error.");
            }
            System.out.println();
        } while (!salir);
    }

}
