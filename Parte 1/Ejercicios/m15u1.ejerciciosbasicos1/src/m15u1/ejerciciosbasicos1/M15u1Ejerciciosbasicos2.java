/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m15u1.ejerciciosbasicos1;

import java.util.Scanner;

/**
 * Llegeix un nombre per teclat i indica si és divisible entre 2 (resta = 0). Si
 * no ho és, també hem de indicar-ho. En cas afirmatiu que calculi el factorial
 * (n*(n-1)*...*1)
 *
 * @author bort
 */
public class M15u1Ejerciciosbasicos2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numero;
        int factor = 1;

        System.out.println("introduce un numero: ");
        numero = reader.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es par");

            while (numero != 0) {
                factor = factor * numero;
                numero--;
            }
            System.out.println("El factor del numero es: ");
            System.out.println(factor);
        } else {
            System.out.println("El numero no es par");
        }

    }
}
