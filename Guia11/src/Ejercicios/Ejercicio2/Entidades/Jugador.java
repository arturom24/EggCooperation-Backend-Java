package Ejercicios.Ejercicio2.Entidades;

public class Jugador {

    private static int contadorJugadores = 1;

    private final int id;
    private final String nombre;
    private boolean mojado;

    public Jugador(String nombre) {
        this.id = contadorJugadores++;
        this.nombre = "Jugador " + id;
        this.mojado = false;
    }

    public boolean disparo(RevolverAgua r) {
        r.siguienteChorro();
        boolean aguaTirada = r.mojar();

        if (aguaTirada) {
            mojado = true;
            System.out.println(nombre + " se mojó. ¡Fin del juego!");
        }

        return aguaTirada;
    }

    public boolean estaMojado() {
        return mojado;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
