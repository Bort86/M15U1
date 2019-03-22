/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m15u1.ejerciciosbasicos1;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class M15u1Ejerciciosbasicos8 {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        
        System.out.println("Introduce la frase a partir: ");
        String frase = reader.nextLine();
        
        String[] arr = frase.split("\\W+");
        System.out.println(Arrays.toString(arr));
    }
}
