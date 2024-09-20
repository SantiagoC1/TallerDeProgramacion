
package practicastaller2024;
import PaqueteLectura.*;

public class PracticasTaller2024 {
    
    public static void main(String[] args) {
        // tipo nombre de variable
        Integer numero;
        String nombreDelAlumno;
        // = es para asignacion
        Boolean esArgentino=true;
        //tipo de datos primitivos 
        boolean ok;
        char letra;
        int entero;
        double real;
        
        // para guardar cadena de caracteres
        String parrafo;
        // con "" se le asigna valor 
        parrafo="Habia una vez un pato";
        
        //Operadores para tipos primitivos y String
            //operadores artimeticos
                int a, b,c;
                double r,s,t;
                a=10;
                b=30;
                r=12.4;
                s=4.5;
                c=a+b;
                c=a-b;
                c=a*b;
                c=a/b; //division entera
                t=r/s; //division real
                c=a%b;//mod de pascal
            //operadores relacionales (tipo de datos primitivos)
                char d,e,f;
                d='a';
                e='b';
                f='c';
                if (d==e){} //igual
                if (d!=e){} //distinto
                if (d>e){} 
                if (d>=f){} 
                if (d<f){}
                if (d<=f){}
            //operadores unarios aritmeticos(tipo de datos numericos)
                a++; //le suma uno
                a--; //le resta uno
            //operadores condicionales
                //if (d>e) && (f!=e){} 
                //if (d>e) || (f!=e){} 
                //if (d>e) ! (f!=e){} 
                
            //operador de concatenacion para string
                nombreDelAlumno= parrafo+" verde y amarillo";
                nombreDelAlumno += " con alas grandes";
            // para mostrar en pantalla
                System.out.println(f);
                System.out.print("");
        //Estructuras de control        
            //seleccion
               if(a>b) {}
               else{}
            
            //iteracion PreCondicional
               while (d!=f){}
            //iteracion PostCondicional
               do{}while (f==e);
            // repeticion
               for (int i=1;i<=11;i++) //inicializo/evaluo/modifico
               {}
               
               
     //VECTORES
        //la dimF se determina al momento de la ejecucion del programa
        // el endice entero y arranca en 0
        //declaracion
            String [] alumnos;
        //creacion
            alumnos=new String[8]; //de 0 a 7
        //acceso a elemento
            alumnos[0]="santaigo";
     
     
     //MATRICES
        //ahora tiene 2 indices
            //primer indice fila(vertical)
            //segundo indice columna (horizontal) 
        //declaracion
            int [][] bingo;
            int posFi=5;
            int posCol=9;
            //creacion
            bingo=new int [posFi][posCol];
            int i,j;
            for (i=0;i<5;i++){
                for (j=0;  j< 9; j++) {
                    bingo[i][j]= GeneradorAleatorio.generarInt(20);
                }
            }
            
            for (i=0;i<5;i++){
                for (j=0;  j< 9; j++) {
                    System.out.println(bingo[i][j]);
                }
            }
            
             
             
        
        
        
        
        
        
               
    }
    
}
