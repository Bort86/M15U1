/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Index;

/**
 *
 * @author bort
 */
public class Validation {

    public static double validaDoubles(String value) {
        double result = -1;
        try {
            result=Double.parseDouble(value);
            
        }catch(NumberFormatException error){
            
        }
        
        return result;
    }
}
