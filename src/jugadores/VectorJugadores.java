
package src.jugadores;

import src.juego.IngresoDatos;


public class VectorJugadores {
    private Jugador[] jugadores = new Jugador[5];
    private int cont =1;
    
    public void agregarJugador(String nombre, int edad){
        if (cont > 5){
            System.out.println("Límite de jugadores alcanzado");
        }
        else{
            jugadores[(cont-1)] = new Jugador( nombre,cont, edad);
        }
        cont++;
    }

    public void agregarJugador(){
        String nombre = IngresoDatos.getTexto("Ingrese nombre: ");
        int edad = IngresoDatos.getEntero("Ingrese edad: ", false);
        agregarJugador(nombre, edad);
    }
    
    public void mostrarInfo(){
        System.out.println("\n\n Estadisticas jugadores");
        for (int i = 0; i < (cont-1); i++) {
            System.out.println("-"+i+") "+jugadores[i].getInformacion());
        }

        System.out.println("\n\n");
    }
       
    
}