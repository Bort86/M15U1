/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pablo Rodriguez
 */
public class UserDAO {

    private DataBase d;

    public UserDAO() {
    }

    public UserDAO(String ruta) {

        d = new DataBase(ruta + "/files/users.txt");

    }
    
    public boolean findOne(User u){
       boolean flag=false;
       
       List<String> all=new ArrayList();
       all=d.listAllLines();
       
       for(String s : all){
            String[] pieces=s.split(";");
            if(pieces[0].equals(u.getUsername()) && pieces[1].equals(u.getPassword())){
                flag=true;
                u.setRol(pieces[2]); // to set the rol once we find the user
                break;
            }
      }
       return flag;
    }
}
