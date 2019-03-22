
package index;

/**
 * Aquesta classe calcula l'index de massa corporal d'un individu
 * @author alumne
 * @version 1.0, 2018-11-14
 */
public class Imc {
    private double pes;
    private double alsada;
    private double imc;
    
    public Imc(double pes, double alsada) {
        this.pes = pes;
        this.alsada = alsada;
    }

    public double getPes() {
        return this.pes;
    }

    public double getAlsada() {
        return this.alsada;
    }

    public void setPes(double pes) {
        this.pes = pes;
    }

    public void setAlsada(double alsada) {
        this.alsada = alsada;
    }
    
    /**Mètode que fa el càlcul de l'index a partir de l pes i l'alçada
     * 
     * @return index de massa corporal
     */
    public double calculaImc(){
        this.imc=this.pes/Math.pow(this.alsada,2);
        return this.imc;
    }
    
    /**Mètode que et diu si estàs normal, prim o obès
     * 
     * @return una cadena amb el valor que correspon al teu index de massa
     */
    public String comEstas(){
       String situacio="";
       if(this.imc<18){
                   situacio= "Estàs prim";
              }
       if(this.imc>=18 &&  this.imc<=25){
                   situacio=  "FIGURÍN";
       }
       if(this.imc>25){
                   situacio=  "Tens sobrepès";
       }
       return situacio;
              
    }
    
}
