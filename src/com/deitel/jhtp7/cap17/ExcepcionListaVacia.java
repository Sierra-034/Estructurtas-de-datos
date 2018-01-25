// Fig. 17.4: ExcepcionListaVacia.java
// Definición de la clase ExcepcionListaVacia.
package com.deitel.jhtp7.cap17;

class ExcepcionListaVacia extends RuntimeException {
    
    // Constructor sin argumentos
    public ExcepcionListaVacia() {
        this("lista");  // Llama a otro constructor de ExcepcionListaVacia
    }// Fin del constructor ExcepcionListaVacia
    
    // Constructor con un argumento
    public ExcepcionListaVacia( String nombre ) {
        super( nombre + " Está vacia"); // Llama al constructor de la superclase
    }// Fin del constructor de ExcepcionListaVacia con un argumento
    
}// Fin de la clase ExcepcionListaVacia