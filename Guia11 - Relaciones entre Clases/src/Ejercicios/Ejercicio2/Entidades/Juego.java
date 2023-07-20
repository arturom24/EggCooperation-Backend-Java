package Ejercicios.Ejercicio2.Entidades;

import java.util.ArrayList;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private RevolverAgua revolver;

    public void iniciarJuego() {
        revolver = new RevolverAgua();
        revolver.llenarRevolver();

        jugadores = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            jugadores.add(new Jugador("Jugador"));
        }

        llenarJuego(jugadores, revolver);
        ronda();
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverAgua r) {
        this.jugadores = jugadores;
        this.revolver = r;
    }

    public void ronda() {
        int numJugadores = jugadores.size();
        int jugadorActual = 0;

        while (!jugadores.get(jugadorActual).disparo(revolver)) {
            jugadorActual = (jugadorActual + 1) % numJugadores;
        }

        System.out.println("¡El jugador " + jugadores.get(jugadorActual).toString() + " se ha mojado!");

    }
}
