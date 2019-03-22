/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trad_idm;

import java.util.HashMap;

/**
 *
 * @author tarda
 */
class Traductor {

    private HashMap<String, HashMap<String, String>> diccionario = new HashMap<String, HashMap<String, String>>();

    String traducirFrase(String idioma, String frase) {
        String[] frase_ar = frase.split(" ");
        String respuesta = "";
        for (String palabra : frase_ar) {
            for (String palabra2 : (this.diccionario.get(idioma)).keySet()) {
                if (palabra.equals(palabra2)) {
                    palabra = this.diccionario.get(idioma).get(palabra2);
                }
            }
            respuesta = respuesta + palabra + " ";
        }
        return respuesta;
    }
    
    void añadirIdioma(String idioma) {
        this.diccionario.put(idioma, new HashMap<String, String>());
    }

    void añadirPalabra(String idioma, String palabra_esp, String palabra_ext) {
        this.diccionario.get(idioma).put(palabra_esp, palabra_ext);
    }

    String traducirPalabra(String idioma, String palabra_esp) {
        return this.diccionario.get(idioma).get(palabra_esp);
    }

    

}

/**
 * Tema tests: en fase zona verde, añadimos tests y a medida que los añadimos, 
 * tenemos que ir cambiando el código para que se ejecute y salga verde
 */
