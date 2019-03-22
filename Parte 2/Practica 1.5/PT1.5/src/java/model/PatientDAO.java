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
public class PatientDAO {
    
    private DataBase d;

    public PatientDAO() {
    }
    
    public PatientDAO(String ruta){
        d = new DataBase(ruta + "/files/pacientes.txt");
    }
    
    public List<Patient> listAll(){
        
        List<Patient> result = new ArrayList<Patient>();
        
        List<String> all = new ArrayList();
        all = d.listAllLines();
        
        for (String s : all){
            String[] pieces = s.split(";");
            Patient p = new Patient();
            p.setIdRegistre(Integer.parseInt(pieces[0]));
            p.setEdat(Integer.parseInt(pieces[1]));
            p.setGrupEdat(pieces[2]);
            p.setPes(Integer.parseInt(pieces[3]));
            p.setTalla(Integer.parseInt(pieces[4]));
            p.setImc(Double.parseDouble(pieces[5]));
            p.setClassificacio(pieces[6]);
            p.setMenarquia(Integer.parseInt(pieces[7]));
            p.setMenopausia(pieces[8]);
            p.setTipusMenopausia(pieces[9]);
            result.add(p);
        }
        
        return result;
        
        
        /*List<String> result = new ArrayList();
        result = d.listAllLines();
        
        return result;*/
    }
    
    
    
    public int addOne(Patient p){
        
        int registre = p.getIdRegistre();
        int edad = p.getEdat();
        String grupEdad = p.getGrupEdat();
        int peso = p.getPes();
        int talla = p.getTalla();
        double imc = p.getImc();
        String classificacio = p.getClassificacio();
        int menarquia = p.getMenarquia();
        String menopausia = p.getMenopausia();
        String tipusMenospausia = p.getTipusMenopausia();
        
        
        String new_patient = "\n" + registre + ";" + edad + ";" + grupEdad + ";" + peso + ";" 
                + talla + ";" + imc + ";" + classificacio + ";" + menarquia + ";" + menopausia + ";" + tipusMenospausia + ";";
        int result = d.insertToFile(new_patient);
        
        return result;
    }
    
    
    
}
