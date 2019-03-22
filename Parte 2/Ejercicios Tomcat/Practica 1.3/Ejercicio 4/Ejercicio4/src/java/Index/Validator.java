/*
Escriu un programa que, a partir d’una seqüència de nucleòtids (recorda que el 
codó AUG començarà la traducció), calcula laseqüència d'aminoàcids possibles 
(recordar que la traducció acabarà quan el ribosoma trobi un dels codons d’stop
UAA, UAG o UGA)
 */
package Index;

/**
 *
 * @author bort
 */
public class Validator {

    public static String validateNucleotid(String nucleotid) {

        String resultado = "";
        nucleotid = nucleotid.replace(" ", "");
        nucleotid = nucleotid.toUpperCase();

        boolean regex_nucleotid = !nucleotid.matches("[UCAG]*");
        if (regex_nucleotid == false) {

            resultado = nucleotid;
        }
        return resultado;
    }
}
