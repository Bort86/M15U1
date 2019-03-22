/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m15u1.ejerciciosbasicos1;

import java.util.Scanner;

/**
 * el primer if es para iniciar el contador y se igualan el mínimo y el máximo 
 * al primer número, para tenerlos de referencia
 * @author pablo
 */
public class M15u1Ejerciciosbasicos4 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int mayor = 0;
        int menor = 0;
        int número = 0;
        String numerototal = "";

        do {
            System.out.println("Introduce un numero: ");
            número = reader.nextInt();
            
          //  numerototal += Integer.toString(número);

            if (número > mayor) {
                mayor = número;

            }

            
            if (número < menor) {
                menor = número;
            }
            
        } while (número != -1);

        System.out.println("El número más grande es " + mayor);
        System.out.println("El número más pequeño es " + menor);

        /*
         char [] matriz = numerototal.toCharArray();
         
         int contador = 0;
         int control = 0;
         
         for (int i = 0; i < matriz.length(); i++) {
             for (int a = 0; a < matriz.length(); a++ ) {
                 if (matriz(i) == matriz(0)) {
                     contador ++;    
                 }
                 if (contador > control) {
                     control = contador;
                 }
             }
         }
         */
    }

}
