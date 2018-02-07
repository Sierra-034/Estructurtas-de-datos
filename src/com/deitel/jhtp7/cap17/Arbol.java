// Fig. 17.7: Arbol.java
// Definición de las clases NodoArbol y Arbol
package com.deitel.jhtp7.cap17;

// Definición de la clase NodoArbol
class NodoArbol {
    
    // Miembros de acceso del paquete
    NodoArbol nodoIzq;  // Nodo izquierdo
    int datos;   // Valor del nodo
    NodoArbol nodoDer;  // Nodo derecho
    
    // El constructor inicializa los datos y hace de este nodo un nodo raíz
    public NodoArbol(int datosNodo) {
        datos = datosNodo;
        nodoIzq = nodoDer = null;   // El nodo no tiene hijos
    }
    
    // Localiza el punto de inserción e inserta un nuevo nodo; ignora los valores duplicados
    public void insertar(int valorInsertar) {
        
        // Inserta en el subarbol izquierdo
        if(valorInsertar < datos) {
            //Inserta nuevo NodoArbol
            if(nodoIzq == null) 
                nodoIzq = new NodoArbol(valorInsertar);
            else
                nodoIzq.insertar(valorInsertar);
        }
        else if(valorInsertar > datos) {
            // Inserta nuevo NodoArbol
            if(nodoDer == null)
                nodoDer = new NodoArbol(valorInsertar);
            else
                nodoDer.insertar(valorInsertar);
        }
    }
}// Fin de la clase NodoArbol

public class Arbol {
    
    private NodoArbol raiz;
    
    // El constructor inicializa un Arbol vacío de enteros
    public Arbol() {
        raiz = null;
    }
    
    // Inserta un nuevo nodo en el árbol de búsqueda binaria
    public void insertarNodo(int valorInsertar) {
        if(raiz == null)
            raiz = new NodoArbol(valorInsertar);    // Crea el nodo raíz aquí
        else
            raiz.insertar(valorInsertar);   // Llama al método insertar
    }
    
    // Comienza el recorrido preorden
    public void recorridoPreorden() {
        ayudantePreorden(raiz);
    }

    // Método recursivo para realizar el recorrido preorden
    private void ayudantePreorden(NodoArbol nodo) {
        if(nodo == null)
            return;
        
        System.out.printf("%d ", nodo.datos);   // Imprime los datos del nodo
        ayudantePreorden(nodo.nodoIzq); // Recorre el subarbol izquierdo
        ayudantePreorden(nodo.nodoDer); // Recorre el subarbol derecho
    }
    
    // Comienza recorrido inorden
    public void recorridoInorden() {
        ayudanteInorden(raiz);
    }

    // Método recursivo para realizar el recorrido inorden
    private void ayudanteInorden(NodoArbol nodo) {
        if(nodo == null)
            return;
        
        ayudanteInorden(nodo.nodoIzq);  // Recorre el subarbol izquierdo
        System.out.printf("%d ", nodo.datos);   // Imprime los datos del nodo
        ayudanteInorden(nodo.nodoDer);  // Recorre el subarbol derecho
    }
    
    // Comienza recorrido postorden
    public void recorridoPostorden() {
        ayudantePostorden(raiz);
    }

    private void ayudantePostorden(NodoArbol nodo) {
        if(nodo == null)
            return;
        
        ayudantePostorden(nodo.nodoIzq);    // Recorre el subarbol izquierdo
        ayudantePostorden(nodo.nodoDer);    // Recorre el subarbol derecho
        System.out.printf("%d ", nodo.datos);   // Imprime los datos del nodo
    }
}
