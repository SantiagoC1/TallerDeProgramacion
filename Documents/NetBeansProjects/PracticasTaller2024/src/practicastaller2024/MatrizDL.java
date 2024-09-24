/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicastaller2024;

import PaqueteLectura.*;

/**
 *
 * @author Santi
 */
public class MatrizDL {
    public static void main(String[] args) {
        int posFi=5,posCol=9;
        int i=-1,j,cant=0,x=0,y;
        //dimension logica
            int [][]bingo1=new int[posFi][posCol];
            System.out.println("Ingrese un dato");
            int dato=Lector.leerInt();
            while (i<5&&dato!=0){
               i++;
               j=0;
               while(j<9&&dato!=0){
                   System.out.println(i+","+j);
                    bingo1[i][j]=dato;
                    
                    cant++;
                    j++;
                    System.out.println("Ingrese un dato");
                    dato=Lector.leerInt();
               }
            }
            System.out.println("CANTIDAD"+cant);
            //Imprimir matriz
            while(cant>0){
                while(cant>0&&x<5){
                    y=0;
                    while(cant>0&&y<9){
                        System.out.println(bingo1[x][y]);
                        y++;
                        cant--;
                    }
                    x++;
                }
            }

    
}
    
}
