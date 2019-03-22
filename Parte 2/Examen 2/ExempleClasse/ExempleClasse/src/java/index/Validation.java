/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package index;

/**
 *
 * @author alumne
 */
public class Validation {
    
    public static double validaDouble(String value){
        double result=-1;
        try{
            result=Double.parseDouble(value);
        }catch(NumberFormatException error1){
            
        }
        
        return result;
               
    }
    
}
