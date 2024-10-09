/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastaller2024.Objects.Paint;

/**
 *
 * @author 1cace
 */
public abstract class  Figura  {
    private String colorR; 
    private String colorL; 

    public String getColorR() {
        return colorR;
    }

    public void setColorR(String colorR) {
        this.colorR = colorR;
    }

    public String getColorL() {
        return colorL;
    }

    public void setColorL(String colorL) {
        this.colorL = colorL;
    }
    public abstract double cacularArea ();
    
    public abstract double calcularPerimetro ();
    
    @Override
    public  String toString(){
        return this.getColorL()+" "+ this.getColorR()+" "+this.calcularPerimetro();
       
    }
    
    public void despintar (){
        this.setColorL("Negro");
        this.setColorR("blanco");
    }
    
}
