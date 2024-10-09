/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastaller2024.Objects.Meteorologos;

import PaqueteLectura.GeneradorAleatorio;

/**
 *
 * @author 1cace
 */
public class Prueba {
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        EstacionMeteorologica LP, MDP;
        LP = new EstacionMeteorologica ("La Plata", -57.955,-34.921); 
        MDP = new EstacionMeteorologica ("Mar Del Plata", -57.556,-38.002); 
        Servicio ser1, ser2;
        ser1 = new Servicio(LP,3,2021); 
        ser2 = new Servicio(MDP,4,2020); 
        
        
        for (int i = 2021; i < 2024; i++) {
            for (int j = 0; j < 12; j++) {
                ser1.registrarTemperatura(j, i, GeneradorAleatorio.generarDouble(40));
                System.out.println("En el mes"+j+"y anio " +i+": "+ser1.devolverTemperatura(j, i));
            }
        }
        
        for (int i = 2020; i < 2024; i++) {
            for (int j = 0; j < 12; j++) {
                ser2.registrarTemperatura(j, i, GeneradorAleatorio.generarDouble(40));
                System.out.println("En el mes"+j+"y anio " +i+": "+ser2.devolverTemperatura(j, i));
            }
        }
        
        
        
        
        System.out.println("El promedio anual de " + ser1.calcularPromedioXanio());
        System.out.println(ser1.temperaturaMax());
        System.out.println("El promedio Mensual de "+ser2.calcularPromedioXmes()); 
        System.out.println(ser2.temperaturaMax());
    }
}
