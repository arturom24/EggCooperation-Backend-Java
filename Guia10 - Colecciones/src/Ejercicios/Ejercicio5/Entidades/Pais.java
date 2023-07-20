package Ejercicios.Ejercicio5.Entidades;

import java.util.Comparator;
import java.util.Objects;

public class Pais {

    private final String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        // Verificar si los objetos son el mismo
        if (this == obj) {
            return true;
        }

        // Verificar si el objeto pasado como argumento es nulo o pertenece a una clase diferente
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Realizar casting del objeto a la clase Pais
        Pais otroPais = (Pais) obj;

        // Comparar los atributos nombre de los objetos utilizando Objects.equals()
        return Objects.equals(nombre, otroPais.nombre);
    }

    @Override
    public int hashCode() {
        // Generar un código hash basado en el atributo nombre utilizando Objects.hash()
        return Objects.hash(nombre);
    }

    public static class PaisComparator implements Comparator<Pais> {

        @Override
        public int compare(Pais pais1, Pais pais2) {
            return pais1.getNombre().compareTo(pais2.getNombre());
        }
    }

}
