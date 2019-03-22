/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m15u1.ejerciciosbasicos1;

import java.util.Scanner;

/**
 *
 * @author bort
 */
public class M15u1Ejerciciosbasicos3 {

    // aqui podemos hacer el iva como una constante e iniciarla antes del main
    // final static double iva = 0.21;
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        float precio;

        System.out.println("Introduce un precio: ");
        precio = reader.nextInt();

        System.out.println("El precio con iva es " + precio * 1.21);

    }
}
