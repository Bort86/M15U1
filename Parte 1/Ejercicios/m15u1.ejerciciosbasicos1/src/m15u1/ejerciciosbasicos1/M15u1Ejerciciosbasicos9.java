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
public class M15u1Ejerciciosbasicos9 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Introduzca el número de año a analizar: ");
        int año = reader.nextInt();

        if ((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}