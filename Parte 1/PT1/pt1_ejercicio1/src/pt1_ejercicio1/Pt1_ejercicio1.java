/*
 Ejercicio 1 – 
Hundir la flota
Crea un programa en java que permita a un usuario jugar al “hundir la flota”. El programa debe crea
un tablero de 10 X 10 casillas y asignar las siguientes piezas: 
4 submarinos (piezas de 1x1)
3 Destructores (piezas de 1x2)
2 Cruceros (piezas de 1x3)
1 Acorazado (pieza de 1x4)
El programa asignar las posición de las piezas antes de iniciar la partida cumpliendo las siguientes 
reglas:
1 La posición de las piezas se asigna de forma aleatoria.
2 Las piezas podrán aparecer tanto en horizontal como en vertical.
3 Las piezas no deben solaparse.
4 Las piezas pueden aparecer adyacentes a otra piezas.
Una vez asignadas las piezas el programa dará comienzo a la partida e irá pidiendo al usuario que 
introduzca su jugada. El jugador deberá introducir pares compuestos por una letra y un número para
señalar la posición donde quiere atacar. El programa deberá informar al usuario del resultado de su 
tirada, con el mensaje “agua” si ha fallado, “tocado” si ha atacado a una casilla de una de las piezas 
a la que aún le queden casillas por hundir, y el nombre del barco más “hundido” si ha conseguido 
acertar a todas las casillas de la pieza. El programa deberá también informar del número de jugadas 
realizadas por el jugador, si al llegar a la jugada 40 el jugador no ha hundido todas las piezas el 
juego terminará con el mensaje “Looser”.

 */
package pt1_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author tarda
 */
public class Pt1_ejercicio1 {
    
    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       
        
        
        Mapa_batalla b= new Mapa_batalla();
        b.inicializar_mapa();
        b.construir_barcos();
        b.printar_mapa();
        b.jugar_mapa();
  

    }



}
