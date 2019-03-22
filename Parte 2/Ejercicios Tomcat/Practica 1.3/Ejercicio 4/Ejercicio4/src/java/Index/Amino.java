/*
 Escriu un programa que, a partir d’una seqüència de nucleòtids (recorda que el 
codó AUG començarà la traducció), calcula laseqüència d'aminoàcids possibles 
(recordar que la traducció acabarà quan el ribosoma trobi un dels codons d’stop
UAA, UAG o UGA)
 */
package Index;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bort
 */
public class Amino {

    private String nucleotid;

    public String getNucleotid() {
        return nucleotid;
    }

    public void setNucleotid(String nucleotid) {
        this.nucleotid = nucleotid;
    }

    public Amino(String nucleotid) {
        this.nucleotid = nucleotid;
    }

    public String getAmino() {

        String final_answer = "";
        String nucleotid = this.nucleotid;
        
        HashMap<String,String> aminodict = new HashMap<>();
        
        aminodict.put("AUG", "S");
        
        int index_aug = nucleotid.indexOf("AUG");
        // uaa uag  uga
        
        final_answer = nucleotid.substring(index_aug);
        
        return final_answer;
    }
}
