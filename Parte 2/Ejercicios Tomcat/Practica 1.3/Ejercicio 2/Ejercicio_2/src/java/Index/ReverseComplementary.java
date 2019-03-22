/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Index;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bort
 */
public class ReverseComplementary {

    private String dna;
    

    //getters n setters
    public String getDna() {
        return dna;
    }

    public void setDna(String dna) {
        this.dna = dna;
    }

    //constructor
    public ReverseComplementary(String dna) {
        this.dna = dna;
    }

    public String reverseDna() {
        
        String rev_dna;
        String final_answer = "";
        char letter;
        
        Map<Character, Character> dna_bases = new HashMap<Character, Character>();        
        dna_bases.put('a', 't');
        dna_bases.put('t', 'a');
        dna_bases.put('c', 'g');
        dna_bases.put('g', 'c');

        rev_dna = new StringBuilder(this.dna).reverse().toString();
        
        for (int i = 0; i < rev_dna.length(); i++){
            letter = rev_dna.charAt(i);
            
            final_answer += dna_bases.get(letter);
        }
        return final_answer;
    }

}
