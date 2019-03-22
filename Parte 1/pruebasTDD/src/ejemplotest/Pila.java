/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotest;
import java.util.Stack;

/**
 *
 * @author tarda
 */
public class Pila {

    private Stack <Integer> valores = new Stack<Integer>();
   

    void apilar(int valor) {
        this.valores.push(valor);
        
    }

    int size() {
        return this.valores.size();
    }

    int desapilar() {
        
        return valores.pop();
    }

}
