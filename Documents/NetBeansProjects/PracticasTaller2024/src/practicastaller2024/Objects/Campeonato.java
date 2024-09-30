/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicastaller2024.Objects;

import PaqueteLectura.Lector;


public class Campeonato {
    public static void main(String[] args) {
        //declaracion de vector e inicializacion
        Partido [] fechas=new Partido[20]; // de 0 a 19
        
        //declaracion de variables
        int dl=0,golL,golV,ganoR=0,golesB=0;
        String local,visitante,ganador;
        
        System.out.println("Ingrese equipo visitante");
        visitante=Lector.leerString();
        while(!visitante.equals("ZZZ")&&dl<20){
            System.out.println("Ingrese los goles del visitante");
            golV=Lector.leerInt();
            System.out.println("Ingrese el equipo Local");
            local=Lector.leerString();
            System.out.println("Ingrese los goles del local");
            golL=Lector.leerInt();
            fechas[dl]= new Partido(local,visitante,golL,golV);
            dl++;
            System.out.println("Ingrese equipo visitante");
            visitante=Lector.leerString();
        }
        
        for (int i = 0; i < dl; i++) {
            System.out.println(fechas[i].repre());
            ganador=fechas[i].getGanador();
            if(ganador.equals("river")){
                ganoR++;
            }
            local=fechas[i].getLocal();
            if(local.equals("boca")){
                golesB+=fechas[i].getGolesLocal();
            }
        }
        
        System.out.println("La cantidad de partidos que gano river fue de: "+ganoR);
        System.out.println("La cantidad de goles que metio boca de local es de: "+golesB);
        
        
        
    }
    
}
