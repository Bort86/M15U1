package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Profes de DAW M07
 */
public class UserDAO {

    private DataBase d;

    public UserDAO() {

    }

    public UserDAO(String ruta) {

        d = new DataBase(ruta + "/files/users.txt");

    }

    //retorna un boleà en funció si l'usuari hi és o no a l'aplicació   
    public boolean findOne(User u) {
        boolean flag = false;

        List<String> all = new ArrayList();
        all = d.listAllLines();

        for (String s : all) {
            String[] pieces = s.split(":");
            if (pieces[0].equals(u.getUsername()) && pieces[1].equals(u.getPassword())) {
                flag = true;
                break;
            }
        }

        return flag;
    }
    
    public int addUser(User u){
        int inserted;
        if (findOne(u)){
            inserted = -1;
        } else {
            inserted = d.insertToFile(u.toString());
        }
        return inserted;
    }

    public void deleteUser(String username) {
       User u = new User(username);
       
    }

}
