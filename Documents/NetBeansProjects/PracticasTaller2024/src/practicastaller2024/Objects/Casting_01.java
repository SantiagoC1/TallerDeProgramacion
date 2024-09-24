/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicastaller2024.Objects;

import PaqueteLectura.Lector;

/**
 *
 * @author Santi
 */
public class Casting_01 {
    public static void main (String[] args){
        //matriz de personas
        Persona [][] personas = new Persona [5][8];
        //vector de diml
        int dias []=new int [5];
        
        //Inicializar vector
        for (int i = 0; i < 5; i++) {
            dias[i]=0;
        }
        
        //declaracion de variables
        String nombre;
        int dni,edad,d,cant=0;
        
        System.out.println("Ingrese su nombre");
        nombre=Lector.leerString();
        
        while (!nombre.equals("ZZZ")&&cant<40){
            System.out.println("Ingrese el dia que quiere asistir de 1 a 5");
            d=Lector.leerInt();
            d--;
            if (dias[d]<7) {
                System.out.println("Ingrese su dni");
                dni=Lector.leerInt();
                System.out.println("Ingrese su edad");
                edad=Lector.leerInt();
                personas[d][dias[d]] = new Persona (nombre,dni,edad);
                cant++;
                dias[d]++;
                
            }else{
                System.out.println("Veni mañana perrito");
            }
            System.out.println("Ingrese su nombre");
            nombre=Lector.leerString();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(dias[i]);
        }
        
        System.out.println(personas[0][1].toString());
        
        for (int i = 0; i < 5; i++) {
        if(dias[i]!=0){
        int aux=dias[i];
        for (int j = 0; j < aux; j++) {
        System.out.println(i+" "+j);
        System.out.println("El dia "+i+ " los anotados son: "+personas[i][j].toString());
        }
        } else {
        System.out.println("El dia "+i+ " No hay personas anotadas");
        
        }
        
        }
        
    }
    
}
