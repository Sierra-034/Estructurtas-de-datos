// Fig. 17.3: NodoLista.java
// Definición de la clase NodoLista
package com.deitel.jhtp7.cap17;

// Clase para representar un nodo en una lista
class NodoLista {
    
    // Miembros de acceso de paquete; Lista puede acceder a ellos directamente
    Object datos; // Los datos para este nodo 
    NodoLista siguienteNodo;    // Referencia al siguiente nodo en la lista 
    
    // El constructor crea un objeto NodoLista que hace referencia al objeto 
    NodoLista( Object objeto ){
        this( objeto, null );
    }// Fin del constructor de NodoLista con un argumento
    
    // El constructor crea un objeto NdoLista que hace referencia a un 
    // un objeto Object y al siguiente objeto NodoLista

    public NodoLista(Object datos, NodoLista siguienteNodo) {
        this.datos = datos;
        this.siguienteNodo = siguienteNodo;
    }

    // Devuelve la referencia a datos en el nodo
    Object getDatos() {
        return datos;
    }// Fin del método getDatos

    // Devuelve la referencia al siguiente nodo en la lista
    NodoLista getSiguienteNodo() {
        return siguienteNodo;
    }// Fin del método getDatos
    
}
