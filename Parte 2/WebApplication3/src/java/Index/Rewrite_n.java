/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Index;

import java.util.HashMap;

/**
 *
 * @author bort
 */
public class Rewrite_n {

    private String nombre;

    static final char[] VOCALES = {'a', 'e', 'i', 'o', 'u'};

    //constructors
    public Rewrite_n(String nombre) {
        this.nombre = nombre;
    }

    public Rewrite_n() {
    }

    //getterns 'n setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String formatName() {

        String nombre_minus = this.nombre.toLowerCase();
        
        String final_string = "";

        for (int i = 0; i < nombre_minus.length(); i++) {
            char c = nombre_minus.charAt(i);
            for (char c2 : VOCALES) {
                if (c == c2) {
                    c = Character.toUpperCase(c);
                }
            }
            final_string += c;

        }
        return final_string;
    }
    
    public String contLetters(){
        
        String nom_tocount = this.nombre;
        
        HashMap <Character, Integer> contador = new HashMap<Character, Integer>();
        
        for (int i = 0; i < nom_tocount.length(); i++) {
            char c = nom_tocount.charAt(i);
        }
    }

}
