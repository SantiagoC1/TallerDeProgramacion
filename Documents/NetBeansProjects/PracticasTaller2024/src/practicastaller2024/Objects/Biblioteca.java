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
public class Biblioteca {
    public static void main(String[] args) {
        Libro l1;
        String t,e,i,n,b,o;
        
        System.out.println("Ingrese un titulo");
        t=Lector.leerString();
        System.out.println("Ingrese una editorail");
        e=Lector.leerString();
        System.out.println("Ingrese un ISBN");
        i=Lector.leerString();
        System.out.println("Ingrese un nombre del autor");
        n=Lector.leerString();
        System.out.println("Ingrese una bibliografia del autor");
        b=Lector.leerString();
        System.out.println("Ingrese un origen del autor");
        o=Lector.leerString();
        
        l1=new Libro(t,e,n,o,b,i);
        
        System.out.println(l1.getPrimerAutor().toString());
    }
    
}
