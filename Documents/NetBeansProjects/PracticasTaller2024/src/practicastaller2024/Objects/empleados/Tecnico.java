/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastaller2024.Objects.empleados;

/**
 *
 * @author 1cace
 */
public class Tecnico extends Empleado {
    private int cantidadCampeonatosGanados;

    public Tecnico(int cantidadCampeonatosGanados, String nombre, double sueldoBasico, int antiguedad) {
        super(nombre, sueldoBasico, antiguedad);
        this.cantidadCampeonatosGanados = cantidadCampeonatosGanados;
    }

    public int getCantidadCampeonatosGanados() {
        return cantidadCampeonatosGanados;
    }

    public void setCantidadCampeonatosGanados(int cantidadCampeonatosGanados) {
        this.cantidadCampeonatosGanados = cantidadCampeonatosGanados;
    }
    
    @Override
    public double calcularSueldo(){
        double aux,nuevoSueldo;
        nuevoSueldo=super.calcularSueldo();
        aux=this.cantidadCampeonatosGanados;
        if (aux>=1&&aux<=4){
            nuevoSueldo+=5000;
        }else {
            if(aux>=5&&aux<=10){
                nuevoSueldo+=30000;
            }
            if(aux>10){
                nuevoSueldo+=50000;
            }
        }
        return nuevoSueldo;
    }

    @Override
    public double calcularEfectividad() {
        double aux;
        aux=(double)this.getCantidadCampeonatosGanados()/this.getAntiguedad();
        return aux;
    }

    @Override
    public String toString() {
        return super.toString()+" y cobra $"+this.calcularSueldo()+" con una efectividad de: "+this.calcularEfectividad();
    }
    
    
    
    
    
    
}
