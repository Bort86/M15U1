/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductorsimple;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tarda
 */
public class TraductorSimpleTest {
    
    public TraductorSimpleTest() {
    }

    /**
     * Test of main method, of class TraductorSimple.
     */
   
    @Test
    public void traducirFraseTest(){
        Traductor trad = new Traductor();
        trad.añadirPalabra("hola", "hello");
        trad.añadirPalabra("perro", "dog");
        trad.añadirPalabra("gato", "cat");
        String frase ="hola tengo un perro";
        assertTrue(trad.traducirFrase(frase).equals("hello tengo un dog "));
    }
    
    @Test
    public void añadirVariasPalabrasTest(){
        Traductor trad = new Traductor();
        trad.añadirPalabra("hola", "hello");
        trad.añadirPalabra("perro", "dog");
        trad.añadirPalabra("gato", "cat");
        assertTrue(trad.traducirPalabra("hola").equals("hello"));
        assertTrue(trad.traducirPalabra("perro").equals("dog"));
        assertTrue(trad.traducirPalabra("gato").equals("cat"));
    }
    
    @Test
    public void añadirPalabraTest(){
        Traductor trad = new Traductor();
        trad.añadirPalabra("hola", "hello");
        assertTrue(trad.traducirPalabra("hola").equals("hello"));
    }
}
