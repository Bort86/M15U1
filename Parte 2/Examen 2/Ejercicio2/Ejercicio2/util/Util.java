/**
 * @author Alejandro Asensio
 * @since 20181120
 */
package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author aasensio
 */
public class Util {

    /**
     * Checks if a letter is a vowel.
     *
     * @param letter char
     * @return true if the letter is a vowel; false otherwise
     */
    public static boolean isVowel(char letter) {
        boolean flag = false;
        switch (Character.toLowerCase(letter)) {
            case 'a':
            case 'e':
            case '1':
            case 'o':
            case 'u':
                flag = true;
        }
        return flag;
    }

    /**
     * Returns a copy of a text with all the vowels capitalized and the
     * consonants in lower case.
     *
     * @param text String
     * @return outputText String with vowels capitalized and consonants in lower
     * case
     */
    public static String vocalsToUpper(String text) {
        // Get an array of chars
        char[] chars = text.toCharArray();
        // Iterate the chars
        String outputText = "";
        for (char letter : chars) {
            if (isVowel(letter)) {
                letter = Character.toUpperCase(letter);
            } else {
                letter = Character.toLowerCase(letter);
            }
            outputText += Character.toString(letter);
        }
        return outputText;
    }

    /**
     * Returns a Map with the occurrences of each letter.
     *
     * @param text String
     * @return a Map with the number of occurrences of each letter in the input.
     */
    public static Map letterStats(String text) {
        Map<Character, Integer> stats = new HashMap<>();
        // Get an array of chars
        char[] chars = text.toCharArray();
        // Iterate the chars, converted into Character objects and perform the mapping
        for (Character letter : chars) {
            // If the letter is already in the map, increments 1
            stats.computeIfPresent(letter, (k, v) -> v + 1);
            // If the letter is not in the map, puts the value 1
            stats.putIfAbsent(letter, 1);
        }
        return stats;
    }

    /**
     * Returns a string with the content of a given map (key-value).
     *
     * @param mp Map of any type of object as key-value
     * @return String with the map content
     */
    public static String printMap(Map mp) {
        String output = "";
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            output += "<br>" + pair.getKey() + " = " + pair.getValue();
            it.remove(); // avoids a ConcurrentModificationException
        }
        return output;
    }

    /**
     * Returns a clean version of the input strand; this is: without whitespaces
     * and all the characters to upper case.
     *
     * @param strand
     * @return
     */
    public static String clean(String strand) {
        return strand.replaceAll("\\s+", "").toUpperCase();
    }

    /**
     * Returns the reversed strand.
     *
     * @param strand String
     * @return the reversed strand
     */
    public static String reverse(String strand) {
        return new StringBuilder(strand).reverse().toString();
    }

    /**
     * Returns the complementary strand of a DNA strand; that is: convert A to
     * T, T to A, C to G, G to C.
     *
     * @param strandIn String
     * @return the complementary strand
     */
    public static String complementary(String strandIn) {
        Map<Character, Character> COMPLEMENTARIES = new HashMap<>();
        COMPLEMENTARIES.put('A', 'T');
        COMPLEMENTARIES.put('T', 'A');
        COMPLEMENTARIES.put('C', 'G');
        COMPLEMENTARIES.put('G', 'C');

        StringBuilder strandOut = new StringBuilder();
        for (Character nucleotide : strandIn.toCharArray()) {
            strandOut.append(COMPLEMENTARIES.get(nucleotide));
        }
        // 'Use of Iterator for simple loop' NetBeans hint
//        for (Map.Entry pair : COMPLEMENTARIES.entrySet()) {
//            strandOut.append(pair.getValue());
//        }

//        compStrand.append(strand.replaceAll("\\s+",""));
//        compStrand.append(strand.replace('A', 'T'));
//        compStrand.append(strand.replace('T', 'A'));
//        compStrand.append(strand.replace('C', 'G'));
//        compStrand.append(strand.replace('G', 'C'));
        return strandOut.toString();
    }

    /**
     * Checks if a DNA strand is palindromic; that is: the sequence must be
     * equal to its reverse complementary strand.
     *
     * @param strand
     * @return
     */
    public static boolean isPalindromicDna(String strand) {
        return reverse(complementary(strand)).equals(strand);
    }

    /**
     * Returns an RNA strand, product of the transcription from a coding DNA
     * strand.
     *
     * @param dna String
     * @return rna String
     */
    public static String transcribeFromCodingStrand(String dna) {
        return dna.replaceAll("T", "U");
    }

    /**
     * Returns a DNA coding strand, product of the reverse transcription from an
     * RNA strand.
     *
     * @param rna String
     * @return dna String
     */
    public static String reverseTranscribeToTheCodingStrand(String rna) {
        return rna.replaceAll("U", "T");
    }
}
