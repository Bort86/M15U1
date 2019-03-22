/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trad_idm;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tarda
 */
public class Trad_IdmTest {
    
    public Trad_IdmTest() {
    }
    
        /**
     * Test of main method, of class Trad_Idm.
     */
    
    @Test
    public void traducirFrase(){
        Traductor diccionario = new Traductor();
        String frase ="hola tengo un perro";
        diccionario.añadirIdioma("inglés");
        diccionario.añadirPalabra("inglés", "hola", "hello");
        diccionario.añadirPalabra("inglés", "perro", "dog");
        assertTrue(diccionario.traducirFrase("inglés", frase).equals("hello tengo un dog "));
    }
    
    @Test
    public void traducirMasPalabras(){
        Traductor diccionario = new Traductor();
        diccionario.añadirIdioma("inglés");
        diccionario.añadirIdioma("francés");
        diccionario.añadirPalabra("inglés", "hola", "hello");
        diccionario.añadirPalabra("francés", "hola", "bonjour");
        assertTrue(diccionario.traducirPalabra("inglés","hola").equals("hello"));
        assertTrue(diccionario.traducirPalabra("francés","hola").equals("bonjour"));
    }
    
    @Test
    public void añadirMásPalabras(){
        Traductor diccionario = new Traductor();
        diccionario.añadirIdioma("inglés");
        diccionario.añadirPalabra("inglés", "hola", "hello");
        diccionario.añadirPalabra("inglés", "adios", "bye");
        assertTrue(diccionario.traducirPalabra("inglés","hola").equals("hello"));
        assertTrue(diccionario.traducirPalabra("inglés","adios").equals("bye"));
    }
    
    @Test
    public void añadirPalabraIdiTest() {
        Traductor diccionario = new Traductor();
        diccionario.añadirIdioma("inglés");
        diccionario.añadirPalabra("inglés", "hola", "hello");
        assertTrue(diccionario.traducirPalabra("inglés","hola").equals("hello"));
        
    }
    
}
