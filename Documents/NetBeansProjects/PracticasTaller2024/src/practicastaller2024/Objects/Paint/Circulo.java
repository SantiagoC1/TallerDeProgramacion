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
public class Circulo extends Figura { 
    
    private double radio; 
    
    public Circulo(double radio,String colorL,String colorR) {
        super.setColorL(colorL);
        super.setColorR(colorR);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double cacularArea() {
        return Math.PI*this.radio*this.radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2*(Math.PI)*this.radio;
    }

    @Override
    public String toString() {
        return (super.toString()+ this.getRadio());
    }
    
}
