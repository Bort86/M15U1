package model.persist;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;

import model.Patient;
import model.User;

public class UserDAO {

    private final Properties queries;
    private static String PROPS_FILE;
    private static DBConnect dataSource;

    public UserDAO(String ruta) throws IOException, ClassNotFoundException {
        queries = new Properties();
        PROPS_FILE = ruta + "/user_queries.properties";
        queries.load(new FileInputStream(PROPS_FILE));

        dataSource = DBConnect.getInstance();
    }

    public String getQuery(String queryName) {
        return queries.getProperty(queryName);
    }

    /**
     * <strong>getDataSource()</strong>
     *
     * @return object to connect to database.
     */
    public static DBConnect getDataSource() {
        return dataSource;
    }
    
    public String findOne(User user) {
        String result = null;
        try ( Connection conn = dataSource.getConnection();
              PreparedStatement st = conn.prepareStatement(getQuery("FIND")); )
        {
            st.setString(1, user.getUsername());
            st.setString(2, user.getPassword());
            ResultSet res = st.executeQuery();
            while (res.next()){
                user.setRol(res.getString("rol"));
            }
            result = user.getRol();
                       
        } catch (SQLException e) {
            result = null;
        }

        return result;
    }
    
    /*
     public Collection<Patient> findAll() {
        Collection<Patient> list = new ArrayList<>();
        
        try ( Connection conn = dataSource.getConnection();
              Statement st = conn.createStatement(); )
        {
            ResultSet res = st.executeQuery(getQuery("FIND_ALL"));
            while (res.next()) {
                Patient patient = new Patient();
                patient.setIdRegistre(res.getInt("idRegistre"));
                patient.setEdat(res.getInt("edat"));
                patient.setGrupEdat(res.getString("grupEdat"));
                patient.setPes(res.getInt("pes"));
                patient.setTalla(res.getInt("talla"));
                patient.setImc(res.getDouble("IMC"));
                patient.setClassificacio(res.getString("classificació"));
                patient.setMenarquia(res.getInt("menarquia"));
                patient.setMenopausia(res.getString("menopausia"));
                patient.setTipusMenopausia(res.getString("tipusMenopausia"));
                
                list.add(patient);
            }
        } catch (SQLException e) {
            list = new ArrayList<>();
        }
        
        return list;
    }

    public int insert(Patient patient) {
        int rowsAffected = 0;
        
        try ( Connection conn = dataSource.getConnection();
              PreparedStatement pst = conn.prepareStatement(getQuery("INSERT")); )
        {
            pst.setString(1, patient.getPhone());
            pst.setString(2, patient.getName());
            pst.setInt(3, patient.getAge());
            pst.setString(4, patient.getCategoryId());
            rowsAffected = pst.executeUpdate();
        } catch (SQLException e) {
            rowsAffected = 0;
        }
        
        return rowsAffected;
    }

    
    /*    
   
    public int delete(Patient patient) {
        int rowsAffected;

        try ( Connection conn = dataSource.getConnection();
              PreparedStatement pst = conn.prepareStatement(getQuery("DELETE")); )
        {
            pst.setInt(1, patient.getFriendID());
            rowsAffected = pst.executeUpdate();
        } catch (SQLException e) {
            rowsAffected = -2;
        }

        return rowsAffected;
    }

    
    public int modify(Patient patient) {
       int rowsAffected;

        try ( Connection conn = dataSource.getConnection();
              PreparedStatement pst = conn.prepareStatement(getQuery("UPDATE")); )
        {
            pst.setString(1, patient.getName());
            pst.setString(2, patient.getPhone());
            pst.setInt(3, patient.getAge());
            pst.setString(4, patient.getCategoryId());
            pst.setInt(5, patient.getFriendID());
            rowsAffected = pst.executeUpdate();
        } catch (SQLException e) {
            rowsAffected = 0;
        }
        return rowsAffected;
    }
*/

}
