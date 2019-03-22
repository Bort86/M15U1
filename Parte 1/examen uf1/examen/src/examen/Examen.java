/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Clase examen, que implementa la clase ADN
 * Logro hacer un printout de la cadena importada
 * 
 * @author tarda
 */
public class Examen {

    /** url bitbucket https://bort86@bitbucket.org/bort86/examen_java.git
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //creamos un objeto de la clase adn
        ADN a= new ADN();
        
        //probamos de printar su atributo texto
        System.out.println("Esto es " + a.texto);
        
        //esta funcionalidad no he logrado desarrollarla, es la de searchSequence()
        int c = a.searchSequence("CCC");
        System.out.println(c);
        
        //probamos la funcionalidad isSequence correctamente
        System.out.println(a.isSequence("CCC"));
        
        //probamos la funcionalidad erase_sequence correctamente
        System.out.println(a.erase_Sequence("CCC"));
    }
    
}
