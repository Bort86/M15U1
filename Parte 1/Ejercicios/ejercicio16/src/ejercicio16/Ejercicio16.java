/*
 Crear un joc de proves per validar dates amb les següents regles:
a) L'any ha d'estar comprès entre 1900 i 2100 (tots dos inclosos)
b) Ha de complir el format: dd/mm/aaaa:
ajuda:
if(Pattern.matches("\\d{1,2}/\\d{1,2}/\\d{1,4}", data))
c) Ha de validar els dies segons el mes. Compte amb els anys de traspàs
d) Finalment imprimirà el dia següent de la data validada
Es crearan dues classes: la principal i la classe que fa la validació.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner (System.in);
        
        System.out.println("Introduzca la fecha con formato correcto (dd/mm/aaaa), entre los años 1900 y 2100: ");
        
        validarFecha nuevafecha = new validarFecha(reader.nextLine());
        
        System.out.println("Fecha: "+ nuevafecha.getFecha1());
        System.out.println("Siguente dia: " + nuevafecha.nextDay());
             
    }
    
}


// public class validator ()
//  public void validacion (String fecha)
    //si true: imprime
    // si es false, 

//simple date format
//add calendar