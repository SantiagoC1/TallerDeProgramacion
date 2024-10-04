/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastaller2024.Objects.Meteorologos;

/**
 *
 * @author 1cace
 */
public class EstacionMeteorologica {
    private String nombre;
    private Integer longitud;
    private Integer latitud;
    

    public EstacionMeteorologica(String nombre, Integer longitud, Integer latitud) {
        this.nombre = nombre;
        this.longitud = longitud;
        this.latitud = latitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public Integer getLatitud() {
        return latitud;
    }

    public void setLatitud(Integer latitud) {
        this.latitud = latitud;
    }
    
    
    
}
