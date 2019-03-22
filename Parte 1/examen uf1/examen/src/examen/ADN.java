/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author tarda
 */
class ADN {

    //declaramos la funcion con un atributo llamado texto donde guardaremos
    //el string de la cadena
    String texto;

    //constructor de la clase donde ya llamamos el método readFile para printar en
    //su atributo texto el contenido del fichero adn.txt
    
    ADN() throws IOException {
        this.texto = this.readFile();
    }

    /**
     * Método para buscar una sequencia y nos devolverá la cantidad de matches
     * @param string_to_search string que se quiere buscar
     * @return contador un int con la cantidad de veces que aparece el string buscado
     */
    int searchSequence(String string_to_search) {
        // mi intención era transformar los dos string en arrays de char
        //luego iterar el array texto de adn, y ver para cada char si había un match
        //con el primer char del string que buscamos
        //si lo hay, que siga mirando los siguientes hasta que deje de haber matchesa
        //luego contaría la cantidad de matches y si era igual al length del stirng que
        //buscabamos, contaba como un match entero y se sumaba al contador
        //pero me devuelve todo el tiempo error en la línea 36, al salir del while
        // no logro entender el error, por lo que lo dejo comentado
        
        
        int contador=0;
        int contador_interno=0;
        char[] base = this.texto.toCharArray();
        char[] letras = string_to_search.toCharArray();
        
        
//        for (int i = 0; i<base.length;i++){
//            int j = 0;
//            int c = i;
//            while (letras[j]==base[c]){
//                j++;
//                c++;
//                contador_interno++;
//            }
//            if (contador_interno==letras.length){
//                contador++;
//            }
//        }
        return contador;
    }

    /**
     * Método que confirma si un string está en nuestro adn
     * @param seq_searched string de búsqueda
     * @return true si lo contiene y false si no está
     */
    public boolean isSequence(String seq_searched) {
        return this.texto.contains(seq_searched);
    }

    /**
     * Método para eliminar un string
     * @param string_to_erase lo que queremos borrar del string
     * @return el string modificado
     */
    String erase_Sequence(String string_to_erase) {
        
        String replace ="";
        replace = this.texto.replace(string_to_erase, "");
        return replace;
    }

    /**
     * Método para leer un fichero
     * @return un string con el fichero guardado
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public String readFile() throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(System.in);

        String file = "/home/tarda/NetBeansProjects/examen/src/adn.txt";
        String cadena;
        FileReader f = new FileReader(file);
        BufferedReader b = new BufferedReader(f);
        cadena = b.readLine();
        return cadena;
    }
}
