/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.regex.Pattern;

/**
 *
 * @author pablo
 */
public class validarFecha {

    //atributo
    private String fecha1;
    private String siguientedia;

    //getter and setter
    public String getFecha1() {
        return fecha1;
    }

    public void setFecha1(String fecha1) {
        this.fecha1 = fecha1;
    }

    //constructor
    public validarFecha(String fecha) {

        /*
        * conmprobamos que lo que introdujo el usuario esté 
        * en el formato correcto de dd/mm/aaaa, si no lo está
        * asignamos a fecha1 el mensaje de error
         */
        if (Pattern.matches("\\d{1,2}/\\d{1,2}/\\d{1,4}", fecha)) {

            // primero dividimos la fecha en partes int para hacer las comprobaciones, año, mes y día       
            int año_prueba = Integer.parseInt(fecha.substring(6));
            int mes_prueba = Integer.parseInt(fecha.substring(3, 4));
            int dia_prueba = Integer.parseInt(fecha.substring(0, 2));

 
            // comprobamos que el año esté en el período correcto, sino asignamos a fecha1 el mensaje de error
            if (año_prueba >= 1900 && año_prueba <= 2100) {
                
            // comprobamos el mes, si es mayor a 12 informamos error y salimos
            
                if (mes_prueba > 12) {
                    System.out.println("El mes informado es erróneo");
                    
                } else {
            //ahora comprobamos por mes qué cantidad de días debería tener
                    switch (mes_prueba) {
                        case 4:
                        case 6:
                        case 8:
                        case 11:
                            if (dia_prueba > 30 ) {
                                fecha ="El día es erróneo";
                            }
                            break;
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 9:
                        case 10:
                        case 12:
                            if (dia_prueba > 31) {
                                fecha = "El día es erróneo";
                            }
                                break;
                            }
                    }             

            } else {
                fecha1 = "El año introducido no está entre 1900 y 2100";
            }

        } else {
            fecha1 = "La fecha introducida no tiene un formato correcto (dd/mm/aaaa)";
        }

    }

    public String nextDay() {

        siguientedia = fecha1 + "2";
        return siguientedia;
    }

}
