// Fig. 17.13: Cola.java
// La clase Cola.
package com.deitel.jhtp7.cap17;

public class Cola {
    
    private Lista listaCola;
    
    // Constructor sin argumentos
    public Cola() {
        listaCola = new Lista("Cola");
    }
    
    // Agrega objeto a la cola
    public void enqueue(Object o) {
        listaCola.insertarAlFinal(o);
    }
    
    // Elimina objeto de la cola
    public Object dequeue() throws ExcepcionListaVacia {
        return listaCola.eliminarDelFrente();
    }
    
    // Determina si la cola está vacía
    public boolean estaVacia() {
        return listaCola.estaVacia();
    }
    
    // Imprime el contenido de la cola
    public void imprimir() {
        listaCola.imprimir();
    }
}
