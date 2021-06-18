package src.jugadores;

public class Jugador {

    private String nombre;
    private boolean gano;
    private int noJugador;
    private String fichas;
    private int edad;
    private int puntaje;
    private int partidasGanadas;

    public Jugador(String nombre, int noJugador, int edad) {
        this.nombre = nombre;
        this.noJugador = noJugador;
        this.edad = edad;
    }

    public Jugador(String nombre, boolean gano, String fichas, int puntaje) {
        this.nombre = nombre;
        this.gano = gano;
        this.fichas = fichas;
        this.puntaje = puntaje;
    }

    public Jugador(String nombre, int partidasGanadas) {
        this.nombre = nombre;
        this.partidasGanadas = partidasGanadas;
    }

    public void moverFicha() {

    }

    public String getInformacion() {
        String resultado = " Nombre del jugador: " + nombre + " Puntos: " + puntaje + " Partidas ganadas: " + partidasGanadas;
        return resultado;
    }

}