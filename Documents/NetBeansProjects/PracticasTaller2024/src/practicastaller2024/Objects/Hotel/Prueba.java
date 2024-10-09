/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastaller2024.Objects.Hotel;

import PaqueteLectura.Lector;

/**
 *
 * @author 1cace
 */
public class Prueba {
    public static void main(String[] args) {
        String nombre;
        int edad,dni;
        Hotel h;
        h=new Hotel(20);
        
        Cliente c1,c2,c3;
        System.out.println("Ingrese un nombre");
        nombre=Lector.leerString();
        System.out.println("Ingrese un dni");
        dni=Lector.leerInt();
        System.out.println("Ingrese la edad");
        edad=Lector.leerInt();
        
        c1= new Cliente(nombre,edad,dni);
        
    }
    
}
