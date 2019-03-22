/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Index;

/**
 *
 * @author bort
 */
public class Validation {

    
    public static String validateDNA(String dna) {

        String result = "";

        dna = dna.replace(" ", "");
        dna = dna.toLowerCase();

        boolean regex = !dna.matches("[atcg]*");

        if (regex == false) {
            
            result = dna;
        } 
        return result;
    }
}
