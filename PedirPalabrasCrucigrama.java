/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package udes.pedirpalabrascrucigrama;
import java.util.Scanner;

/**
 *
 * @author juli.mantilla
 */
public class PedirPalabrasCrucigrama {
    
    public static void main(String[] args) {
        
        //Opcion 1. Preguntando al usuario las palabras
        Scanner sc = new Scanner(System.in);
        String[] vectorpalabras = new String[5];
        
        //Ciclo para pedir las palabras al usuario
        for(int i=0;i<vectorpalabras.length;i++){
            System.out.print("Digite la palabra #"+(i+1)+": ");
            vectorpalabras[i]=sc.next();
        }
        
        //Opcion 2, Creando el vector con las 5 palabras
        //String [] palabras = {"Casa", "Arbol", "Pera", "Pais", "Gato"};

        String raiz = vectorpalabras[0];
        System.out.print("Palabra Raíz: "+raiz+"\n");
        
        for (int i = 1; i < vectorpalabras.length; i++) {
            
            //Palabra en Pos 1: Pera
            String palabra = vectorpalabras[i];
            String cruces = "";

            for (int j = 0; j < raiz.length(); j++) {
                //Letra en posicion j = 0 de palabra raiz: A
                char letrasraiz = raiz.charAt(j);

                for (int k = 0; k < palabra.length(); k++) {
                    
                    char letraspalabra = palabra.charAt(k);
                    //Letra en posicion k = 1 de palabra: A
                    if (letrasraiz == letraspalabra) { //C=e
                        cruces+=letrasraiz;
                        //A
                        break;
                    }
                }
            }
            
            System.out.println(palabra+" ("+cruces+")");
        }
    }
}

//casa raiz
//arbol   (aa)
//pera    (aa)
//pais    (asa)
//gato    (aa)