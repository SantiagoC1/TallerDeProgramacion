/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastaller2024.Objects.Estanteria;

import PaqueteLectura.Lector;

/**
 *
 * @author 1cace
 */
public class Prueba {
    public static void main(String[] args) {
        Estante e= new Estante(20);
        
        Libro l1;
        String t,ed,i,n,b,o;
        
        System.out.println("Ingrese un titulo");
        t=Lector.leerString();
        System.out.println("Ingrese una editorail");
        ed=Lector.leerString();
        System.out.println("Ingrese un ISBN");
        i=Lector.leerString();
        System.out.println("Ingrese un nombre del autor");
        n=Lector.leerString();
        System.out.println("Ingrese una bibliografia del autor");
        b=Lector.leerString();
        System.out.println("Ingrese un origen del autor");
        o=Lector.leerString();
        
        l1=new Libro(t,ed,n,o,b,i);
        
        e.agregarAlEstante(l1);
        System.out.println(e.estaLleno());
        System.out.println("-------------");
        System.out.println(e.librosAlmacenados());
        String aux="margarita";
        if (e.encontrarTitulo(aux)!=null){
            System.out.println(e.encontrarTitulo(aux).getPrimerAutor().toString());
        }else{
            System.out.println("No se encontro el nombre");
        }
        
        
    }
    
}
