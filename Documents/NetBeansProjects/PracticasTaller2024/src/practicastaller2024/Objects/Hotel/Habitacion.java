
package practicastaller2024.Objects.Hotel;

import PaqueteLectura.GeneradorAleatorio;

/**
 *
 * @author 1cace
 */
class Habitacion { 
    private Cliente persona;
    private double monto;
    private boolean ocupado; 

    public Habitacion () {
        GeneradorAleatorio.iniciar();
        this.monto = GeneradorAleatorio.generarDouble(8000);
        this.ocupado = false;
    }
    public void alquilarHabitacion (Cliente clien) {
        this.persona = clien; 
        this.ocupado = true;
        
    }

    public Cliente getPersona() {
        return persona;
    }

    public void setPersona(Cliente persona) {
        this.persona = persona;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    public void aumento (double precio){
        this.monto += precio;  
    }

    @Override
    public String toString() {
        if(this.isOcupado()){
            return "Habitacion{" + "persona=" + this.persona.toString() + ", monto=" + this.monto + ", ocupado=" + this.ocupado + '}';
        }
        return "No hay persona";
        
    }
    
    
}
