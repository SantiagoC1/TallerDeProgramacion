/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicastaller2024.Objects.Meteorologos;


public class Servicio {
    private EstacionMeteorologica estacion;
    private Double [] [] temperaturas;
    private double []  promAnios;
    private double []  promMeses;
    private Integer aniosConsecutivos;
    private Integer anioInicio;

    public Servicio(EstacionMeteorologica estacion, Integer aniosConsecutivos, Integer anioInicio) {
        this.estacion = estacion;
        this.aniosConsecutivos = aniosConsecutivos;
        this.anioInicio = anioInicio;
        this.temperaturas= new Double [this.aniosConsecutivos][12];
        for (int i = 0; i < this.aniosConsecutivos; i++) {
            for (int j = 0; j < 12; j++) {
                temperaturas[i][j]=99.9;
            }
        }
    }
 
    //metodo para llenar la matriz
    public void registrarTemperatura (int mes,int anio,double temperatura){
        int aux= anio-this.anioInicio;
        temperaturas[aux][mes-1]=temperatura;
    }
    
    public double devolverTemperatura(int mes,int anio){
        double aux;
        int aux1= anio-this.anioInicio;
        aux=temperaturas[aux1][mes-1];
        return aux;
    }
    
    public String temperaturaMaxSteel(){
        String aux;
        double maxT=-1;
        Integer maxM=-1,maxA=-1;
        for (int i = 0; i < this.aniosConsecutivos; i++) {
            for (int j = 0; j < 12; j++) {
                if(temperaturas[i][j]>maxT){
                    maxT=temperaturas[i][j];
                    maxM=j;
                    maxA=i;
                }
            }
        }
        aux="El anio con mas temperatura es: "+(maxA+this.anioInicio)+" y el mes es: "+(maxM+1);
        return aux;
    }
    
    public String calcularPromedioXanio(){
        String aux2=estacion.toString();
        this.promAnios=new double [this.aniosConsecutivos];
        double aux;//suma todas las temperaturas
        for (int i = 0; i < 10; i++) {
            aux=0.0;
            for (int j = 0; j < 10; j++) {
                aux+=this.temperaturas[i][j];
            }
            aux2+=" En el anio:" + (i+this.anioInicio)+" temperatura: "+(aux/12)+" \n";
        }
        return aux2;
    }
    
    public void calcularPromedioXmes(){
        
    }
    
    
    
}
