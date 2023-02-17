/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package udes.tablamultiplicaraleatorio;

/**
 *
 * @author juli.mantilla
 */
public class TablaMultiplicarAleatorio {

    public static void main(String[] args) {
        
         //Formula Para Generar Números Enteros Aleatorios: Random*(X-Y+1)+Y; donde x es el número inicial y Y es el número final.
         //0.000000001 - 1.00000000 - - - 0.00000062 - - - 0.5626521 --- NO 2, 1000,5
        
        int num = (int)(Math.random()*(2023-1+1)+1);
        int maxtabla = (int)(Math.random()*(2023-1+1)+1);
        
        
        String tabla = "Tabla de Multiplicar del número: "+num+" hasta: "+maxtabla+"\n";

        //num = 796
        //maxtabla = 1008
        
        for(int i=0; i<=maxtabla; i++){
            
            tabla+= num+" x "+i+" = "+num*i+"\n";
            
            //796 x 0 = 0
            //6 x 1 = 6
            //6 x 2 = 12
            //6 x 3 = 18
            
        }
        System.out.println(tabla);   
        
    }
}

