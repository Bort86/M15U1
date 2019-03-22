package m15u1.ejerciciosbasicos1;

import java.util.Scanner;

/*

 */

/** Donada una cadena, extreure la quarta i cinquena lletra usant el mètode
 *substring
 *
 * @author pablo
 */

public class M15u1Ejerciciosbasicos7 {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        System.out.println("Introduce la frase a analizar: ");
        String frase = reader.nextLine();
        
        System.out.println(frase.substring(3, 4));
        System.out.println(frase.substring(4, 5));
        
    }
}

//Faltaría meter un control para ver que tenga más de 5 letras
//se puede usar el código de otro ejercicio para sacar los espacios en blanco o comas y mirar las letras