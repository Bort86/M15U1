
package Index;

import java.util.HashMap;

/**
 * Clase para el ejercicio1
 * Contiene dos métodos, uno que formatea el nombre pasando consonantes a 
 * minúsculas y vocales a mayúsculas, y otro que cuenta cada letra
 * @author Pablo Rodriguez
 */
public class Rewrite_n {
    
    //constante: un array de chars con las vocales
    static final char[] VOCALES = {'a', 'e', 'i', 'o', 'u'};
    
    //atributos
    private String nombre;

    //constructors
    public Rewrite_n(String nombre) {
        this.nombre = nombre;
    }

    public Rewrite_n() {
    }

    //getterns 'n setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que formatea letras, consonantes a minúsculas y vocales a 
     * mayúsculas
     * @return string con el nombre formateado correctamente
     */
    public String formatName() {
        
        //Paso todo el nombre a minúsculas
        String nombre_minus = this.nombre.toLowerCase();
        
        //Declaro una variable vacía donde guardaré el resultado final
        String final_string = "";

        //abro un for para iterar el nombre introducido
        for (int i = 0; i < nombre_minus.length(); i++) {
            char c = nombre_minus.charAt(i); //convertimos cada letra en char
            for (char c2 : VOCALES) {        //comparo ese char con el array de vocales
                if (c == c2) {               //si es una vocal, lo paso a mayúsculas
                    c = Character.toUpperCase(c);
                }
            }
            final_string += c;    //se la letra que sea, la añado al final de la respuesta final

        }
        return final_string;
    }
    
    
    /**
     * Método para contar letras
     * Guardará cada letra en un mapa donde las llaves son las letras y el valor,
     * el contador de sus ocurrencias en la palabra
     * @return un string donde guardamos el mapa de las letras
     */
    public String contLetters(){
        
        String first_name = this.nombre.toLowerCase();    //recojo el atributo nombre en una variable
        String resultado;  //declaro la variable final vacía
     
        // le quito los posibles espacios en blanco dentro del nombre
        String nom_tocount = first_name.replace(" ", ""); 
        
        //Declaro un map vacío donde las llaves son los chars y los values, el contador
        HashMap <Character, Integer> contador = new HashMap<Character, Integer>();
        
        //leo la palabra con un for, convirtiendo las letras en chars y consultando 
        //si ese char es una llave del mapa; si lo es, aumenta su valor en 1; si no
        //agrega esa llave con contador = 1
        for (int i = 0; i < nom_tocount.length(); i++) {
            char c = nom_tocount.charAt(i);
            if (contador.containsKey(c)){
                contador.put(c,contador.get(c)+1);
            }else{
                contador.put(c,1);
            }
        }
        resultado = contador.toString(); //paso el mapa a string
        return resultado;
    }

}
