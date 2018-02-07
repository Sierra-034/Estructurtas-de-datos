// Fig. 17.18: PruebaArbol.java
// Este programa prueba la clase Arbol.
package com.deitel.jhtp7.cap17;

import java.util.Random;

public class PruebaArbol {

    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        Random ran = new Random();
        int valor;
        
        System.out.println("Insertando los siguientes valores");
        
        // Inserta 10 enteros aleatorios de 0 a 99 en el arbol
        for(int i = 1; i <= 10; i++) {
            valor = ran.nextInt(100);
            System.out.print(valor + " ");
            arbol.insertarNodo(valor);
        }
        
        System.out.println("\n\nRecorrido preorden");
        arbol.recorridoPreorden();  // Realiza recorrido preorden de arbol
        
        System.out.println("\n\nRecorrido inorden");
        arbol.recorridoInorden();   // Realiza recorrido inorden de arbol
        
        System.out.println("\n\nRecorrido postorden");
        arbol.recorridoPostorden(); // Realiza recorrido postorden de arbol
        System.out.println();
    }
    
}
