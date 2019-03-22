/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Bombeta {

    Scanner reader = new Scanner(System.in);

    //atributos
    private boolean estado = false;
    private int potencia;
    private String color;
    private float hores = 10;

    //métodos
    //encender la bombilla
    public void encender_Bombeta() {

        if (hores > 0) {

            this.estado = true;

            System.out.println("Introduce las horas que estará encendida ");
            this.hores -= reader.nextFloat();
        }
    }

    //apagar la bombilla
    public void apagar_Bombeta() {
        this.estado = true;
    }

    //devolver el estado de la bombilla
    public boolean ver_estado() {
        return estado;
    }

    //cambiar potencia
    public void cambiar_potencia(int nueva_potencia) {
        this.potencia = nueva_potencia;
    }

    //ver potencia
    public int ver_Potencia() {
        return potencia;
    }

    //cambiar color, primero comprueba si está apagada,
    //si es así le cambia el color
    public void cambiar_Color(String nuevo_color) {

        if (this.estado == true) {
            this.estado = false;
            this.color = nuevo_color;
        }

    }

    //ver color
    public String ver_color() {
        return color;

    }
    
    //recargar, pregunta cuantas horas recargamos y las añade a hores
    
    public void recargar_Bombeta(){
        System.out.println("Informe de las horas a recargar: ");
        this.hores += reader.nextFloat();
    }

}
