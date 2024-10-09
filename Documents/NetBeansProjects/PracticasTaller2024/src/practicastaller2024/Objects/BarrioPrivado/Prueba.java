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
public class Prueba {
    public static void main(String[] args) {
        Persona p;
        Trabajador t;
        
        p=new Persona("juancito",434353,20);
        
        t=new Trabajador("Hacedor de marcos","Marco",34343,67);
        
        System.out.println(p.toString());
        System.out.println(t.toString());
        
        
    }
    
}
