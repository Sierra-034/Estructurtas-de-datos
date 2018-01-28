// Fig. 17.10: HerenciaPila.java
// Se deriva de la clase Lista.
package com.deitel.jhtp7.cap17;

public class HerenciaPila extends Lista {
    
    // Constructor sin argumentos
    public HerenciaPila() {
        super("Pila heredada");
    }
    
    // Agrega objeto a la pila
    public void push(Object objeto) {
        insertarAlFrente(objeto);
    }
    
    // Elimina objeto de la pila
    public Object pop() throws ExcepcionListaVacia {
        return eliminarDelFrente();
    }
}
