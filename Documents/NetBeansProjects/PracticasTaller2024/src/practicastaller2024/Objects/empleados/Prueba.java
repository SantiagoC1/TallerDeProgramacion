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
public class Prueba {
    public static void main(String[] args) {
        Jugador j;
        Tecnico t;
        j=new Jugador(300,260,"Bale",300000,5);
        t=new Tecnico(8,"Bianchi",150000,5);
        System.out.println(t.toString());
        System.out.println(j.toString());
    }
    
}
