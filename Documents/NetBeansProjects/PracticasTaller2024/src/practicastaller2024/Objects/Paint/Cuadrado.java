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
public class Cuadrado extends Figura { 
    private  double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double cacularArea() {
        return this.lado * this.lado;
    }

    @Override
    public double calcularPerimetro() {
        return this.lado * 4; 
    }

    @Override
    public String toString() {
       return (super.toString() + this.getLado());
    }
    
}
