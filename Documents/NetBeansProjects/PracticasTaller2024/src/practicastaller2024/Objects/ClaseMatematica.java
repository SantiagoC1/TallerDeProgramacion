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
public class ClaseMatematica {
    public static void main(String[] args) {
        double l1,l2,l3;
        String cL,cR;
        Triangulo t1;
        
        System.out.println("Ingrese un lado ");
        l1=Lector.leerDouble();
        System.out.println("Ingrese un lado ");
        l2=Lector.leerDouble();
        System.out.println("Ingrese un lado ");
        l3=Lector.leerDouble();
        System.out.println("Ingrese un color de linea ");
        cL=Lector.leerString();
        System.out.println("Ingrese un color de relleno ");
        cR=Lector.leerString();
        
        
        t1= new Triangulo(l1,l2,l3,cL,cR);
        
        System.out.println(t1.calcularArea(l1, l2, l3));
        System.out.println("------------");
        System.out.println(t1.calcularPerimetro(l1, l2, l3));
       
        
        
    }
    
}
