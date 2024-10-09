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
public class Jugador extends Empleado {
    private int goles;
    private int partidos;

    public Jugador(int goles, int partidos, String nombre, double sueldoBasico, int antiguedad) {
        super(nombre, sueldoBasico, antiguedad);
        this.goles = goles;
        this.partidos = partidos;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }
    @Override
    public double calcularSueldo(){
        double aux,nuevoSueldo;
        aux=this.calcularEfectividad();
        if (aux>0.5){
            nuevoSueldo=super.calcularSueldo()+this.getSueldoBasico();
        }else {
            nuevoSueldo=super.calcularSueldo();
        }
        return nuevoSueldo;
    }

    @Override
    public double calcularEfectividad() {
        double aux;
        aux=(double)this.getGoles()/this.getPartidos();
        return aux;
    }

    @Override
    public String toString() {
        return super.toString()+" que cobra $"+this.calcularSueldo()+" con una efectividad de: "+this.calcularEfectividad();
    }
    
    
    
    
    
}
