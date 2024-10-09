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
public class Rectangulo extends Figura { 
    private double base; 
    private double altura; 
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    

    @Override
    public double cacularArea() {
        return this.base * this.altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2*this.base + 2*this.altura;
    }

    @Override
    public String toString() {
    return super.toString() + this.getBase() + this.getAltura();
    }
    
}
