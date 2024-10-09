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
public class Triangulo extends Figura  { 
    private double lado1; 
    private double lado2; 
    private double lado3; 

    public Triangulo(double lado1, double lado2, double lado3,String colorL,String colorR) {
        super.setColorL(colorL);
        super.setColorR(colorR);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    
    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double cacularArea() {
      return (this.lado1 + this.lado2) / 2; 
    }

    @Override
    public double calcularPerimetro() {
        return this.lado1 + this.lado2 + this.lado3;
    }

    @Override
    public String toString() {
      return super.toString()+" "+ this.getLado1()+" " + this.getLado2()+" "+ this.getLado3();
    
    }


}