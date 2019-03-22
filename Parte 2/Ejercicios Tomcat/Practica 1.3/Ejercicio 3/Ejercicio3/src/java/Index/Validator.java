/*
 Escriu un programa que, a partir d’una seqüència d'ADN, calcula la seqüència d’ARN i viceversa. Se’ns deixa escollir què volem
mitjançant un petit menú
 */
package Index;

/**
 *
 * @author bort
 */
public class Validator {

    public static String validateProtein(String protein, String radio) {

        String resultado = "";

        protein = protein.replace(" ", "");
        protein = protein.toLowerCase();

        boolean regex_dna = !protein.matches("[atcg]*");
        boolean regex_rna = !protein.matches("[arcg]*");

        switch (radio) {
            case "dna":
                if (regex_dna == false) {

                    resultado = protein;
                }
                break;
            case "rna":
                if (regex_rna == false) {

                    resultado = protein;
                }
                break;

        }

        return resultado;

    }
}
