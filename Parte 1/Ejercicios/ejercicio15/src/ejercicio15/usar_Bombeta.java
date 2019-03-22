/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

/**
 *
 * @author pablo
 */
public class usar_Bombeta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bombeta nueva_bombilla= new Bombeta();
        
        nueva_bombilla.encender_Bombeta();
        
        nueva_bombilla.apagar_Bombeta();
        
        System.out.println(nueva_bombilla.ver_estado());
        
        nueva_bombilla.cambiar_potencia(50);
        
        System.out.println(nueva_bombilla.ver_Potencia()); 
        
        nueva_bombilla.cambiar_Color("Ultrarrojo");
        
        System.out.println(nueva_bombilla.ver_color());
        
        nueva_bombilla.recargar_Bombeta();
        
    }
    
}
