/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastaller2024.Objects.Hotel;

/**
 *
 * @author 1cace
 */
public class Hotel {
    private Habitacion [] vector;
    private int dl; 
    private int df; 
    
    public Hotel( int valor) {
        this.df = valor; 
        this.vector = new Habitacion [this.df]; 
        this.dl = 0; 
    }
    public void agregarCliente (int numdeHabitacion, Cliente clien) { 
        this.vector[numdeHabitacion - 1].alquilarHabitacion(clien);
        
    } 
    public void aumentarMonto (double precio) { 
        for (int i = 0; i < this.dl; i++) { 
            this.vector[i].aumento(precio);
            
        }
    }

    @Override
    public String toString() {
        String aux;
        for (int i = 0; i < dl; i++) {
            aux="Habitacion "+i+this.vector[i].toString();
            return aux;
        }
        return null;
    }
    
    
    }
