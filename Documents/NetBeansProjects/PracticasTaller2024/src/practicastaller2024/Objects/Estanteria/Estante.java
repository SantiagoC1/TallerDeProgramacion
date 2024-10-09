/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastaller2024.Objects.Estanteria;

/**
 *
 * @author 1cace
 */
public class Estante {
    private Libro [] vector;
    private int dl;
    private int df;

    
    public Estante (int valor){
        this.vector=new Libro [valor];
        this.dl=0;
        this.df=valor;
    }

    public void agregarAlEstante(Libro libro) {
        this.vector[dl] = libro;
        this.dl++;
    }
    
    public boolean estaLleno (){
        boolean aux = false;
        if (this.dl == this.df){ 
            aux = true;
            return aux;
        } else {
            return aux;
        }
    }
    
    public int librosAlmacenados(){
        return this.dl ;
    }
    
    
    
    public Libro encontrarTitulo(String titulo){
        String aux;
        for (int i = 0; i < dl; i++) {
            aux=this.vector[i].getTitulo();
            if(aux.equals(titulo)){
                return vector[i];
            }
        }
        return null;
    }
    

    
    
    
    
    
    
    
    
    
}
