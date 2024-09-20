/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicastaller2024.Objects;

import PaqueteLectura.*;

/**
 *
 * @author Santi
 */
public class RegistroDeLasPersonas {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        /*String nombre;
        Integer dni,edad;
        System.out.println("Ingrese un nombre");
        nombre= Lector.leerString();
        System.out.println("Ingrese un dni");
        dni=Lector.leerInt();
        System.out.println("Ingrese una edad");
        edad=Lector.leerInt();
        Persona per = new Persona(nombre,dni,edad);
        System.out.println(per.toString());*/
        
        
        Persona [] personas = new Persona [15];
        String nombre;
        Integer dni,edad,i=-1;
        edad=GeneradorAleatorio.generarInt(100);
        
        while (edad!=0&&i<15){
            i++;
            nombre=GeneradorAleatorio.generarString(5);
            dni=GeneradorAleatorio.generarInt(304);
            personas[i]=new Persona(nombre,dni,edad);
            edad=GeneradorAleatorio.generarInt(100);
        }
        Integer cant=0,min=999999;
        Persona perMinDni=new Persona();
        for (int j = 0; j <= i; j++) {
            Integer num=personas[j].getEdad();
            if(num>65){
                cant++;
            }
            Integer num1 =personas[j].getDni();
            if(min>num1){
                min=num1;
                perMinDni=personas[j];
            }
        }
        System.out.println("La cantiadad de persona mayores a 65 pirulos es "+cant);
        System.out.println("La persona con menor dni es "+perMinDni.toString());
        
        
        
        
        
        
        
    }
    
}
