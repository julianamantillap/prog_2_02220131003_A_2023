/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package udes.modamediaaritmetica;

/**
 *
 * @author juli.mantilla
 */
public class ModaMediaAritmetica {

    public static void main(String[] args) {
       
        int[] muestra = new int[4];
        
        for(int i=0;i<muestra.length;i++){
            muestra[i]=i;
            
            //i=0  -    = muestra[0] = 0 muestra[0,  ,  ,  ]
            //i=1  -    = muestra[1] = 1 muestra[0, 1 ,  ,  ]
            //i=2  -    = muestra[2] = 2 muestra[0, 1 , 2 ,  ]
            //i=3  -    = muestra[3] = 3 muestra[0, 1 , 2 , 3 ]
 
        }
        //muestra[3]=0;
        System.out.println("El promedio es: "+media(muestra));
        System.out.println("La moda es: "+moda(muestra));
        System.out.println("La mediana es: "+mediana(muestra));
        
    }
    //Promedio o media aritmetica o media = suma todos los valores dividido entre la cantidad de valores
    public static double media(int[] muestra){
        
        double suma=0.0;
        for(int i=0;i<muestra.length;i++){
            suma+=muestra[i];
            //i=0    0.0+=muestra[0] = 0.0+0 = 0.0
            //i=1    0.0+=muestra[1] = 0.0+1 = 1.0
            //i=2    1.0+=muestra[2] = 1.0+2 = 3.0
            //i=3    3.0+=muestra[3] = 3.0+3 = 6.0
        }
        double promedio = suma/(muestra.length); //   6.0/4  /1.5
        return promedio;
        
    }
    //valor que esta en la mitad del arreglo
    public static int mediana(int [] muestra){
        
        return muestra[muestra.length/2];

    }
    
    
    //valor que se repite mas veces en un arreglo, vector, array
    public static int moda(int[] muestra){
        
        int maximoNumRepeticiones= 0;
        int moda= 0;
        
        for(int i=0; i<muestra.length; i++){
            // muestra[0, 1 , 2 , 3 ]
            int numRepeticiones= 0;
            
            for(int j=1; j<muestra.length; j++){
                
                
                if(muestra[i]==muestra[j]){
                    numRepeticiones++;
                }
                
                if(numRepeticiones>maximoNumRepeticiones){                
                    moda= muestra[i];
                    maximoNumRepeticiones = numRepeticiones;
                }
            }
        }
    return moda;
    }
           
}