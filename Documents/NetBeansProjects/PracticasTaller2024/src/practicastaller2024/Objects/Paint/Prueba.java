/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastaller2024.Objects.Paint;

import PaqueteLectura.Lector;

/**
 *
 * @author 1cace
 */
public class Prueba {
    public static void main(String[] args) {
        Circulo c;
        Triangulo t;
        String cl,cr;
        double l1,l2,l3,r;
        
        
        System.out.println("Ingrese un color de relleno");
        cr=Lector.leerString();
        System.out.println("Ingrese un color de linea");
        cl=Lector.leerString();
        System.out.println("Ingrese un lado ");
        l1=Lector.leerDouble();
        System.out.println("Ingrese un lado ");
        l2=Lector.leerDouble();
        System.out.println("Ingrese un lado");
        l3=Lector.leerDouble();
        
        t= new Triangulo(l1,l2,l3,cl,cr);
        System.out.println("Ya se leyo el triangulo");
        
        System.out.println("Ingrese un radio");
        r=Lector.leerDouble();
        System.out.println("Ingrese un color de relleno");
        cr=Lector.leerString();
        System.out.println("Ingrese un color de linea");
        cl=Lector.leerString();
        c=new Circulo(r,cl,cr);
        
        System.out.println(c.toString());
        System.out.println(t.toString());
        t.despintar();
        System.out.println(t.toString());
        
    }
    
}
