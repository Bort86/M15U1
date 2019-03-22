/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductorsimple;

import java.util.HashMap;

/**
 *
 * @author tarda
 */
class Traductor {

    private HashMap<String, String> diccionario = new HashMap<String, String>();

    void añadirPalabra(String esp_palabra, String ing_palabra) {
        this.diccionario.put(esp_palabra, ing_palabra);
    }

    String traducirPalabra(String esp_palabra) {

        return this.diccionario.get(esp_palabra);
    }

    String traducirFrase(String frase) {

        String[] frase_ar = frase.split(" ");
        String respuesta = "";
        for (String palabra : frase_ar) {
            for (String palabra2 : this.diccionario.keySet()) {
                if (palabra.equals(palabra2)) {
                    palabra = this.diccionario.get(palabra2);
                }
            }
            respuesta = respuesta + palabra + " ";
        }
        return respuesta;
    }

}
