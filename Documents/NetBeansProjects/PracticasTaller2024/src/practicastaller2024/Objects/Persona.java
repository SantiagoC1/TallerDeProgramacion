/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicastaller2024.Objects;

/**
 *
 * @author Santi
 */
public class Persona {
    private String nombre;
    private Integer dni;
    private Integer edad;

    public Persona() {
    }

    public Persona(String nombre, Integer dni, Integer edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        String aux;
        aux="Mi nombre es "+nombre + " mi DNI es "+dni+ " y tengo " +edad+  " años.";
        return aux;
    }
    
    
    
    
}
