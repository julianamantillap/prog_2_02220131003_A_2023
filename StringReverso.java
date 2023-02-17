/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package udes.stringreverso;
import java.util.Scanner;

/**
 *
 * @author juli.mantilla
 */
public class StringReverso {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digita un texto para invertir");
        String texto = sc.next();
        
        System.out.println("Palabra normal: "+texto);
        
        int tam = texto.length();
        String palinv = "";
        
        
        for(int i = 0;i<tam;i++){
        
            palinv+= texto.charAt(tam-i-1);
            //casa
            //muestra[1];
            //texto[tam-i-1]
            //tam=4 - i=0 -  1
            //4-0-1 = 3
            //texto[3]
            //palinv = a
            
            //tam=4 - i=1 -  1
            //4-1-1 = 2
            //texto[2]
            
            //palinv = a
            //palinv = as
            
            //tam=4 - i=2 -  1
            //4-2-1 = 1
            //texto[1]
            
             //palinv = as
            //palinv = 
            
            //tam=4 - i=3 -  1
            //4-3-1 = 0
            //texto[0]
            
            //palinv = asa
            //palinv = asac
        }
        
        System.out.println("Palabra invertida: "+palinv);
    }
}
