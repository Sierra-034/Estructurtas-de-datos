// Fig. 17.12: ComposicionPila.java
// Definición de la clase ComposicionPila con un objeto Lista compuesto.
package com.deitel.jhtp7.cap17;

public class ComposicionPila {
    
    private Lista listaPila;
    
    // Constructor sin argumentos
    public ComposicionPila() {
        listaPila = new Lista("Pila compuesta");
    }
    
    // Agrega objecto a la pila
    public void push(Object objeto) {
        listaPila.insertarAlFrente(objeto);
    }
    
    // Elimina objecto de la pila
    public Object pop() throws ExcepcionListaVacia {
        return listaPila.eliminarDelFrente();
    }
    
    // Determina si la pila está vacía
    public boolean estaVacia() {
        return listaPila.estaVacia();
    }
    
    // Imprime el contenido de la pila
    public void imprimir() {
        listaPila.imprimir();
    }
}
