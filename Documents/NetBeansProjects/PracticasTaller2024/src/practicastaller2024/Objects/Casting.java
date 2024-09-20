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
public class Casting {
    public static void main(String[] args) {
        Persona [][] personas = new Persona [5][8];
    
        String nombre;
        Integer dni,edad,i=-1,j=-1;
        
        System.out.println("Ingrese un nombre");
        nombre=Lector.leerString();
        while (!nombre.equals("ZZZ")&&i<5){
            i++;
            j=-1;
            while(!nombre.equals("ZZZ")&&j<8){
                j++;
                
                    System.out.println("Ingrese la edad");
                    edad=Lector.leerInt();
                    System.out.println("Ingrese un dni");
                    dni=Lector.leerInt();
                    personas[i][j]=new Persona(nombre,dni,edad);
                    System.out.println("Ingrese un nombbre");
                    nombre=Lector.leerString();
                
            }
        }
        
        //recorrrer
        Integer x=0,y;
        while(x<=i){
            y=0;
            while(y<=j){
                Integer aux1,aux2;
                aux1=x;
                aux1++;
                aux2=y;
                aux2++;
                System.out.println("El dia "+aux1+" del turno "+aux2+" esta la persona"+personas[x][y].toString());
                y++;
            }
            x++;
        }
        
        
    
    }
    
    
    
}
