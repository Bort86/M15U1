/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Index;

/**
 * Esta clase calcula el índice de masa corporal de un invidivuo
 *
 * @author bort
 * @version 14-11
 * @
 */
public class Imc {

    private double peso;
    private double altura;
    private double imc;

    //constructor
    public Imc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    //getters n setters without atribute 'imc'
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    /**
     * Calcula el imc
     *
     * @return double imc
     */
    public double calculateImc() {
        this.imc = this.peso / Math.pow(this.altura, 2);
        return this.imc;
    }

    /**
     * Devuelve un string de acuerdo al imc
     *
     * @return String devuelve la situación acorde al peso
     */
    public String comoEstas() {
        String situation = "";

        if (this.imc < 18) {
            situation = "Estás delgado";
        } else if (this.imc > 25) {
            situation = "Vas fanegas";
        } else {
            situation = "Vas bien";
        }
        return situation;
    }

}
