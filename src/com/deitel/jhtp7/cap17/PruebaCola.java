// Fig. 17.14: PruebaCola.java
// La clase PruebaCola.
package com.deitel.jhtp7.cap17;

public class PruebaCola {
    
    public static void main(String[] args) {
        
        Cola cola = new Cola();
        
        // Usa el método enqueue
        cola.enqueue(-1);
        cola.imprimir();
        cola.enqueue(0);
        cola.imprimir();
        cola.enqueue(1);
        cola.imprimir();
        cola.enqueue(5);
        cola.imprimir();
        
        Object objetoEliminado = null;
        while(true) {
            objetoEliminado = cola.dequeue();
            System.out.printf("%s se elimino de la cola\n", objetoEliminado);
            cola.imprimir();
        }
    }
    
}
