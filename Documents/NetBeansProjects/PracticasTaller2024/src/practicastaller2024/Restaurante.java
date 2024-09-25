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
public class Restaurante {
    public static void main(String[] args) {
        int resta[][]=new int [5][4];
        double promedio;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Ingrese la calificacion del 1..10");
                resta[i][j]=Lector.leerInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            promedio=0.0;
            for (int j = 0; j < 5; j++) {
                promedio+=resta[j][i];
                
            }
            promedio=promedio/5;
            System.out.println("El promedio del aspecto "+i+" es de: "+promedio);
        }
        
        
    }
}
