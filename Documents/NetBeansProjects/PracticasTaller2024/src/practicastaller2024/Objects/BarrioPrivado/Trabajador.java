/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastaller2024.Objects.BarrioPrivado;

/**
 *
 * @author 1cace
 */
public class Trabajador extends Persona {
    private String oficio;

    public Trabajador(String oficio, String unNombre, int unDNI, int unaEdad) {
        super(unNombre, unDNI, unaEdad);
        this.oficio = oficio;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    @Override
    public String toString() {
        return super.toString()+ " y mi oficio es: " + this.getOficio();
    }
    
    
    
    
}
