/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Class Patient
 * @author Pablo Rodriguez
 */
public class Patient {
    private int idRegistre;
    private int edat;
    private String grupEdat;
    private int pes;
    private int talla;
    private double imc;
    private String classificacio;
    private int menarquia;
    private String menopausia;
    private String tipusMenopausia;

    public Patient() {
    }

    public Patient( int edat, String grupEdat, int pes, int talla, double imc, String classificacio, int menarquia, String menopausia, String tipusMenopausia) {
        this.idRegistre = idRegistre;
        this.edat = edat;
        this.grupEdat = grupEdat;
        this.pes = pes;
        this.talla = talla;
        this.imc = imc;
        this.classificacio = classificacio;
        this.menarquia = menarquia;
        this.menopausia = menopausia;
        this.tipusMenopausia = tipusMenopausia;
    }

    public Patient(int edat, int pes, int talla, double imc, String classificacio, int menarquia, String menopausia, String tipusMenopausia) {
        this.edat = edat;
        this.pes = pes;
        this.talla = talla;
        this.imc = imc;
        this.classificacio = classificacio;
        this.menarquia = menarquia;
        this.menopausia = menopausia;
        this.tipusMenopausia = tipusMenopausia;
    }

    public int getIdRegistre() {
        return idRegistre;
    }

    public void setIdRegistre(int idRegistre) {
        this.idRegistre = idRegistre;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String getGrupEdat() {
        return grupEdat;
    }

    public void setGrupEdat(String grupEdat) {
        this.grupEdat = grupEdat;
    }
    
    public void setGrupEdat(int age) {
        // less than 45, 45-49, 50-54, 55-59, 60-64, 65-69, more than 69
        String grupEdat = "";
        if (age < 45) {
            grupEdat = "<45";
        } else if (age >= 45 && age < 50) {
            grupEdat = "45-49";
        } else if (age >= 50 && age < 55) {
            grupEdat = "50-54";
        } else if (age >= 55 && age < 60) {
            grupEdat = "55-59";
        } else if (age >= 60 && age < 65) {
            grupEdat = "60-64";
        } else if (age >= 65 && age < 70) {
            grupEdat = "65-69";
        } else {
            grupEdat = ">69";
        }
        this.grupEdat = grupEdat;
    }

    public int getPes() {
        return pes;
    }

    public void setPes(int pes) {
        this.pes = pes;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getClassificacio() {
        return classificacio;
    }

    public void setClassificacio(String classificacio) {
        this.classificacio = classificacio;
    }

    public int getMenarquia() {
        return menarquia;
    }

    public void setMenarquia(int menarquia) {
        this.menarquia = menarquia;
    }

    public String getMenopausia() {
        return menopausia;
    }

    public void setMenopausia(String menopausia) {
        this.menopausia = menopausia;
    }

    public String getTipusMenopausia() {
        return tipusMenopausia;
    }

    public void setTipusMenopausia(String tipusMenopausia) {
        this.tipusMenopausia = tipusMenopausia;
    }
    
    
}
