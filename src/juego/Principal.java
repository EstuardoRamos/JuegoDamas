package src.juego;

import src.tablero.Tablero;
import src.jugadores.VectorJugadores;


public class Principal {

    public static void main(String[] args) {
        Principal principal = new Principal();
    }
    private Tablero t = new Tablero();
    private VectorJugadores j = new VectorJugadores();

    public Principal() {
        int menu = 0;
        while (menu >= 0) {
            System.out.println("Juego de damas");
            System.out.println("1. Jugar ");
            System.out.println("2. Registrar jugadores. ");
            System.out.println("3. Ver estadisticas. ");
            menu = IngresoDatos.getEntero("Ingrese la opcion", true);
            switch (menu) {
                case 1:
                    t.dibujarTablero();
                    t.imorimirTablero();
                    t.colocarFichas();
                    System.out.println("\n Colocando fichas...\n");
                    t.imorimirTablero();
                    break;
                case 2:
                    j.agregarJugador();
                    break;
                case 3:
                    j.mostrarInfo();
                    break;
                case 4:
                    System.out.println("Adios");
                    break;

            }
        }
    }

}