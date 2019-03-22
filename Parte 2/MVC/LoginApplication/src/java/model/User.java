/**
 * Modeliza al Usuario a través de dos entradas: nombre de usuario
 * y la contraseña
 * @author Pablo Rodriguez
 * @version 1.0 2019/01/15
 */
package model;

/**
 *
 * @author alumne
 */
public class User {
    //atributos
    private String username;
    private String password;
    
    //constructores
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username) {
        this.username = username;
    }
    
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String toString(){
        return "\n" + this.username + ":" + this.password + ":";
    }
    
    //podrían interesarnos más métodos generales
    
    
}
