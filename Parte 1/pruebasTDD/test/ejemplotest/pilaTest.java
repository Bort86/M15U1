/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tarda
 */
public class pilaTest {

    public pilaTest() {
    }

    @Test               //<<<<<<< esto es lo que hace que nos devuelva mensajes rojos
    public void testApilarUnElemento() {

        Pila p = new Pila();
        p.apilar(3);
        assertTrue(p.size() == 1);
        assertTrue(p.desapilar() == 3);
        assertTrue(p.size() == 0);

    }

    @Test
    public void testApilarVariosElementos() {

        Pila p = new Pila();

        p.apilar(5);
        assertTrue(p.size() == 1);
        p.apilar(8);
        assertTrue(p.size() == 2);
        assertTrue(p.desapilar() == 8);
        assertTrue(p.size() == 1);
        assertTrue(p.desapilar() == 5);
        assertTrue(p.size() == 0);

    }

}
//fail("The test case is a prototype."); >>> esto forzaría a que falle el test
