/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicastaller2024;

import PaqueteLectura.Lector;

/**
 *
 * @author Santi
 */
public class Edificio {
    public static void main(String[] args) {
        int edificio [][] = new int [8][4];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) { 
              edificio[i][j] = 0;
                
            }
            
        }
        int piso, oficina;
        System.out.println("Ingrese un piso 0..8");
        piso = Lector.leerInt();
        while(piso != 9){ 
            System.out.println("Ingrese una oficina 0..3");
         oficina = Lector.leerInt(); 
         edificio[piso][oficina] ++; 
          System.out.println("Ingrese un piso 0..8");
          piso = Lector.leerInt();
            }
         for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) { 
                System.out.println("En el piso " +i+" en la oficina "+j+" entraron "+edificio[i][j]+" personas");
                
            }
            
        } }
}
