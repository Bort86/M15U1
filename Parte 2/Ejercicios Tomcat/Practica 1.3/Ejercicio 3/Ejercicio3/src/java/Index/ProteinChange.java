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
public class ProteinChange {
    
    private String protein;
    private String radio;

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public ProteinChange(String protein, String radio) {
        this.protein = protein;
        this.radio = radio;
    }
    
    
    public  String protChanger() {
        
        String final_answer="";
        
        switch(this.radio){
            case "dna":
                final_answer = this.protein.replace("t", "r");
                break;
            case "rna":
                final_answer = this.protein.replace("r", "t");
                break;
        }
        return final_answer;
    }
}
