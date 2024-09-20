
package practicastaller2024;

import PaqueteLectura.*;


public class UsoPaqueteDeLectura {
    public static void main(String[] args) {
       //Lector 
        String nombre;
        int numero;
        System.out.println("Ingrese su nombre");
        nombre=Lector.leerString();
        System.out.println("Ingrese su edad");
        numero=Lector.leerInt();
        System.out.println("el alumno "+nombre+" tiene "+numero+" anios");
        //GeneradorAleatorio
        GeneradorAleatorio.iniciar();//siempre iniciarlo una vez
        System.out.println(GeneradorAleatorio.generarInt(10)); //genera int entre 0 y 9 (genera un valor aleatorio entre 0 y el parametro -1)
        System.out.println(GeneradorAleatorio.generarDouble(10));
        System.out.println(GeneradorAleatorio.generarBoolean());
        System.out.println(GeneradorAleatorio.generarString(100));// genera un string de longitud 5
    }
}
