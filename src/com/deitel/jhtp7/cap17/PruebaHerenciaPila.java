// Fig. 17.11: PruebaHerenciaPila.java
// La clase PruebaHerenciaPila.
package com.deitel.jhtp7.cap17;

public class PruebaHerenciaPila {

    public static void main(String[] args) {
        HerenciaPila pila = new HerenciaPila();
        
        // Usa el método push
        pila.push(-1);
        pila.imprimir();
        pila.push(0);
        pila.imprimir();
        pila.push(1);
        pila.imprimir();
        pila.push(5);
        pila.imprimir();
        
        // Eliminar elementos de la pila
        try {
            
            Object objetoEliminado = null;
             
            while(true) {
                objetoEliminado = pila.pop();   //Usa el método pop
                System.out.printf("Se saco %s\n", objetoEliminado);
                pila.imprimir();
            } 
        } 
        catch (ExcepcionListaVacia excepcionListaVacia) {
            excepcionListaVacia.printStackTrace();
        }
    }
    
}
