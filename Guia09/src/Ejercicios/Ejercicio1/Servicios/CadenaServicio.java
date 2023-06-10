package Ejercicios.Ejercicio1.Servicios;

import Ejercicios.Ejercicio1.Entidades.Cadena;

public class CadenaServicio {

    private Cadena cadena;

    public CadenaServicio(Cadena cadena) {
        this.cadena = cadena;
    }

    public void mostrarVocales() {
        int contador = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            String letra = cadena.getFrase().toUpperCase().substring(i, i + 1);
            if ("A".equals(letra) || "E".equals(letra) || "I".equals(letra) || "O".equals(letra) || "U".equals(letra)) {
                contador++;
            }
        }
        System.out.println("La frase contiene " + contador + " vocales.");
    }

    public void invertirFrase() {
        String frase = cadena.getFrase();
        String fraseInvertida = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }
        System.out.println("Frase invertida: " + fraseInvertida);
    }

    public void vecesRepetido(String letra) {
        String frase = cadena.getFrase().toUpperCase();
        char caracter = letra.toUpperCase().charAt(0);
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == caracter) {
                contador++;
            }
        }

        System.out.println("EL catacter '" + letra + "' se repite " + contador + " veces.");
    }

    public void compararLongitud(String otraFrase) {
        int longitudActual = cadena.getLongitud();
        int longitudOtraFrase = otraFrase.length();

        if (longitudActual == longitudOtraFrase) {
            System.out.println("La longitud de la frase actual es igual a la longitud de la otra frase.");
        } else if (longitudActual > longitudOtraFrase) {
            System.out.println("La longitud de la frase actual es mayor a la longitud de la otra frase.");
        } else {
            System.out.println("La longitud de la frase actual es menor a la longitud de la otra frase.");
        }
    }

    public void unirFrases(String otraFrase) {
        String fraseActual = cadena.getFrase();
        String fraseResultante = fraseActual + " " + otraFrase;

        System.out.println("Frase resultante: " + fraseResultante);
    }

    public void reemplazar(String letra, String reemplazo) {
        String frase = cadena.getFrase();
        String fraseReemplazada = frase.replace(letra, reemplazo);

        System.out.println("Frase resultante: " + fraseReemplazada);
    }

    public boolean contiene(String letra) {
        String frase = cadena.getFrase().toUpperCase();
        char caracter = letra.toUpperCase().charAt(0);

        return frase.contains(String.valueOf(caracter));
    }

}
