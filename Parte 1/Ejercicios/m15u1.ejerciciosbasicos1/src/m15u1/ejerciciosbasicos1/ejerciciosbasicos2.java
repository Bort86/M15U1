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
public class ejerciciosbasicos2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numero;
        int factor = 1;
        
        System.out.println("introduce un numero: ");
        numero = reader.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
            
            while (numero !=0) {
                factor=factor*numero;
                numero--;
            }
            System.out.println("El factor del numero es: ");
            System.out.println(factor);
        } else {
            System.out.println("El numero no es par");
        }
    
    } 
}
