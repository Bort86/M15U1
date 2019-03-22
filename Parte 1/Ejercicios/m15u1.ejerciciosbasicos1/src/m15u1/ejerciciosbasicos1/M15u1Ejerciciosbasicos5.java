/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m15u1.ejerciciosbasicos1;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class M15u1Ejerciciosbasicos5 {
        public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Introduce una frase: ");
        String frase = reader.nextLine();
        
        String frase2 = frase.replaceAll("\\s", "");
            System.out.println(frase2);
        }
}
