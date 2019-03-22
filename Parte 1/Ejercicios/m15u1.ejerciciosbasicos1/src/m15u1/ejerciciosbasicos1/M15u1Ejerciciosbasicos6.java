package m15u1.ejerciciosbasicos1;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pablo
 */
public class M15u1Ejerciciosbasicos6 {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        
        System.out.println("Introduce la frase a cambiar: ");
        String frase1 = reader.nextLine();
        
        System.out.println("Escribe M para mayúscula o m para minúscula: ");
        String func = reader.nextLine();
        
        if (func.equals("M")) {
            System.out.println(frase1.toUpperCase());
        }
        if (func.equals("m")) {
            System.out.println(frase1.toLowerCase());
        }
        
    }
}
