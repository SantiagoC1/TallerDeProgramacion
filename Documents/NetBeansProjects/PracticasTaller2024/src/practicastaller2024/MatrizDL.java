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
        int i=0,j=0;
        //dimension logica
            int [][]bingo1=new int[posFi][posCol];
            System.out.println("Ingrese un dato");
            int dato=Lector.leerInt();
            i=-1;
                while(i<5&&dato!=0){
                    i++;
                    j=-1;
                    while(j<9&&dato!=0){
                        
                        if (dato!=0){
                            j++;
                            System.out.println(i+","+j);
                            bingo1[i][j]=dato;
                        }
                        
                        System.out.println("Ingrese un dato");
                        dato=Lector.leerInt();
                    }
                    
                    System.out.println("Ingrese un dato");
                    dato=Lector.leerInt();
                }
                
                int x=0;
                while (x<=i){
                    int y=0;
                    while(y<=j){
                         System.out.print("("+x+","+y+") "+bingo1[x][y]+" | ");
                         y++;
                    }
                    x++;
                }
                
                /*for (i=0;i<5;i++){
                System.out.println("-----------------------------------------------");
                for (j=0;  j< 9; j++) {
                System.out.print("("+i+","+j+") "+bingo1[i][j]+" | ");
                }
                System.out.println(" ");
                }
                System.out.println("---------------------------------------------------------------------------");*/
            
    }
    
}
