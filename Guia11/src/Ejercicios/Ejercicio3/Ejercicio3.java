package Ejercicios.Ejercicio3;

import Ejercicios.Ejercicio3.Entidades.Baraja;
import Ejercicios.Ejercicio3.Entidades.Carta;
import java.util.List;

public class Ejercicio3 {

    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.barajar();

        Carta siguienteCarta = baraja.siguienteCarta();
        System.out.println("Siguiente carta: " + siguienteCarta);

        int cartasDisponibles = baraja.cartasDisponibles();
        System.out.println("Cartas disponibles: " + cartasDisponibles);

        List<Carta> mano = baraja.darCartas(3);
        if (mano != null) {
            System.out.println("Cartas en la mano:");
            for (Carta carta : mano) {
                System.out.println(carta);
            }
        }

        List<Carta> cartasMonton = baraja.cartasMonton();
        System.out.println("Cartas en el montón:");
        if (cartasMonton.isEmpty()) {
            System.out.println("No ha salido ninguna carta.");
        } else {
            for (Carta carta : cartasMonton) {
                System.out.println(carta);
            }
        }

        System.out.println("Mostrando baraja completa:");
        baraja.mostrarBaraja();
    }

}
