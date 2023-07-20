package Ejercicios.Ejercicio3.Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {

    List<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<>();
        String[] palos = {"espadas", "bastos", "oros", "copas"};

        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, palo));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No hay mas cartas en la baraja.");
            return null;
        }
        return cartas.remove(0);
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public List<Carta> darCartas(int numeroCartas) {
        if (numeroCartas > cartas.size()) {
            System.out.println("No hay suficientes cartas disponibles.");
            return null;
        }
        List<Carta> mano = new ArrayList<>();
        for (int i = 0; i < numeroCartas; i++) {
            mano.add(cartas.remove(0));
        }
        return mano;
    }

    public List<Carta> cartasMonton() {
        List<Carta> monton = new ArrayList<>();
        for (Carta carta : cartas) {
            monton.add(new Carta(carta.getNumero(), carta.getPalo()));
        }
        return monton;
    }

    public void mostrarBaraja() {
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}
