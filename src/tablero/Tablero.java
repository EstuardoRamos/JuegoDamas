    
package src.tablero;

import src.jugadores.Jugador;


public class Tablero {

    private String casilla;
    private Jugador jugador1;
    private Jugador jugador2;
    private final String casillaBlanca = "     ";
    private final String casillaNegra = "|||||";
    private final String fichaBlanca = "||o||";
    private final String fichaNegra = "||x||";
    String[][] tabla = new String[8][8];
    private String[][] tablero;

    public Tablero() {
        this.tablero = new String[8][8];
        //llenarTablero();
    }

    public void dibujarTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    tablero[i][j] = casillaNegra;
                } else {
                    if (j % 2 == 0 && i % 2 != 0) {
                        tablero[i][j] = casillaNegra;
                    } else {
                        tablero[i][j] = casillaBlanca;
                    }
                }
            }
            // System.out.println("");
        }
    }

    public void colocarFichas() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    tablero[i][j] = fichaBlanca;
                } else {
                    if (j % 2 == 0 && i % 2 != 0) {
                        tablero[i][j] = fichaBlanca;
                    }
                }
            }
        }
        for (int i = 5; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    tablero[i][j] = fichaNegra;
                } else {
                    if (j % 2 == 0 && i % 2 != 0) {
                        tablero[i][j] = fichaNegra;
                    }
                }
            }
        }
    }

    public void imorimirTablero() {
        System.out.println("Tablero damas chinas\n");
        System.out.println("o son fichas blancas y x son negras");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    System.out.print(tablero[i][j]);
                } else {
                    if (j % 2 == 0 && i % 2 != 0) {
                        System.out.print(tablero[i][j]);
                    } else {
                        System.out.print(tablero[i][j]);
                    }
                }
            }
            System.out.println("");
        }

    }


}

