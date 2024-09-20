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
public class Matrices {
        public static void main(String[] args) {
             int [][] bingo;
            int posFi=5;
            int posCol=9;
            bingo=new int [posFi][posCol];
            int i,j;
            for (i=0;i<5;i++){
                for (j=0;  j< 9; j++) {
                    bingo[i][j]= GeneradorAleatorio.generarInt(20);
                }
            }
            
            for (i=0;i<5;i++){
                    System.out.println("-----------------------------------------------");
                for (j=0;  j< 9; j++) {
                    System.out.print("("+i+","+j+") "+bingo[i][j]+" | ");
                }
                System.out.println(" ");
            }
            System.out.println("---------------------------------------------------------------------------");
            
            
            
    }
    
}
