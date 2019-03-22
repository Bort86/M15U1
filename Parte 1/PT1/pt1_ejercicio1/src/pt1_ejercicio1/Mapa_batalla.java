/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt1_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author tarda
 */
class Mapa_batalla {

    //atributos
    int filas = 10;
    int columnas = 10;
    char[][] mapa = new char[filas][columnas];
    char agua = 'a';
    char barco = 'b';
    int contador_barco4 = 1;
    int contador_barco3 = 2;
    int contador_barco2 = 3;
    int contador_barco1 = 4;
    char acorazado = 'A';
    char crucero = 'C';
    char destructor = 'D';
    char submarino = 'S';
    int numero_jugadas = 0;

    /**
     * constructor de la clase, lo dejamos vacío
     */
    public Mapa_batalla() {
  
    }

    /**
     * función para inicializar el mapa, llenando cada casilla de agua
     */
    public void inicializar_mapa() {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                mapa[i][j] = agua;
            }
        }

    }

    /**
     * función para printa por pantalla el mapa
     */
    public void printar_mapa() {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(mapa[i][j]);

            }
            System.out.println();
        }
        System.out.println();

    }

    /**
     * función para construir barcos, llama a los 4 constructores diferentes
     * de tipo de barcos
     */
    public void construir_barcos() {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                acorazado(i, j);
                crucero(i, j);
                destructor(i, j);
                submarino(i, j);

            }
        }
    }

    /**
     * función para construir acorazados
     * @param fil
     * @param col 
     */
    public void acorazado(int fil, int col) {
        if (mapa[fil][col] == agua) {
            if (contador_barco4 > 0) {  // primero miramos que el contador de los barcos no esté a cero

                if (Math.random() < 0.15) {  //luego tiramos una moneda para ver si construimos o no un barco

                    if (Math.random() < 0.5) { // luego tiramos otra moneda para ver si es vertical o no
                        // si sale menos de 0.5, miramos que se pueda hacer horizontal

                        if (col < 7) {      //si la columna es menor a 6, podemos construir

                            for (int j = col; j < (col + 4); j++) {  // printamos horizontal
                                mapa[fil][j] = acorazado;
                            }

                        }

                    } else {            // si la segunda moneda es mayor a 0.5, intentamos vertical
                        if (fil < 6) {    //si la fila es menor de 6, hay espacio para printar, por lo que printamos
                            for (int i = fil; i < (fil + 4); i++) {
                                mapa[i][col] = acorazado;
                            }
                        }

                    }
                    contador_barco4--;
                }
            }
        }

    }
    
    /**
     * función para construir cruceros 
     * @param fil
     * @param col 
     */
    public void crucero(int fil, int col) {
        if (mapa[fil][col] == agua) {
            if (contador_barco3 > 0) {

                if (Math.random() < 0.15) {

                    if (Math.random() < 0.5) {

                        if (col < 8) {

                            for (int j = col; j < (col + 3); j++) {
                                mapa[fil][j] = crucero;
                            }

                        }

                    } else {
                        if (fil < 8) {
                            for (int i = fil; i < (fil + 3); i++) {
                                mapa[i][col] = crucero;
                            }
                        }

                    }
                    contador_barco3--;
                }
            }
        }

    }

    /**
     * función para construir destructores
     * @param fil
     * @param col 
     */
    public void destructor(int fil, int col) {
        if (mapa[fil][col] == agua) {
            if (contador_barco2 > 0) {

                if (Math.random() < 0.15) {

                    if (Math.random() < 0.5) {

                        if (col < 9) {

                            for (int j = col; j < (col + 2); j++) {
                                mapa[fil][j] = destructor;
                            }

                        }

                    } else {
                        if (fil < 9) {
                            for (int i = fil; i < (fil + 2); i++) {
                                mapa[i][col] = destructor;
                            }
                        }

                    }
                    contador_barco2--;
                }
            }
        }

    }

    /**
     * función para construir submarinos
     * Estos no tienen que confirmar la distancia de las columnas o filas
     * porque solo constan de 1 casilla
     * @param fil
     * @param col 
     */
    public void submarino(int fil, int col) {
        if (mapa[fil][col] == agua) {

            if (contador_barco1 > 0) {
                if (Math.random() < 0.15) {
                    mapa[fil][col] = submarino;

                    contador_barco1--;
                }
            }
        }
    }

    /**
     * función para empezar a jugar
     * pide al usuario que introduzca una fila  y columna
     * y se las pasa a la función juego_batalla para ver si ha
     * tocado algo
     * Esta función cuenta las jugadas y se acaba en la 40
     */
    public void jugar_mapa() {
        int fila;
        int columna;
        Scanner reader = new Scanner(System.in);
        while (numero_jugadas < 40) {

            System.out.println("Introduce fila: ");
            fila = reader.nextInt();

            System.out.println("Introduce columna: ");
            columna = reader.nextInt();

            juego_batalla(fila, columna);

            numero_jugadas++;
        }
        System.out.println("Looser");
    }

    /**
     * función para confirmar si la jugada toca o no a algún barco
     * y printa a cuál en caso de tocar
     * @param fil
     * @param col 
     */
    public void juego_batalla(int fil, int col) {
        if (mapa[fil][col] == agua) {
            System.out.println("Has elegido agua");
        }
        if (mapa[fil][col] == acorazado) {
            System.out.println("Has tocado al acorazado");
        }
        if (mapa[fil][col] == crucero) {
            System.out.println("Has tocado al crucero");
        }

        if (mapa[fil][col] == destructor) {
            System.out.println("Has tocado al destructor");
        }

        if (mapa[fil][col] == submarino) {
            System.out.println("Has tocado al submarino");
        }
    }
}
