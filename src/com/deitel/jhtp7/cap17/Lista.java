// Fig. 17.3: Lista.java
// Definición de la clase Lista.java
package com.deitel.jhtp7.cap17;

public class Lista {
    
    private NodoLista primerNodo; 
    private NodoLista ultimoNodo;
    private String nombre; // Cadena como "lista", utilizada para imprimir
    
    // El constructor crea una lista vacía con el nombre "lista"
    public Lista(){
        this("lista");
    }//Fin del constructor de Lista sin argumentos
    
    //El constructor crea una lista vacía con un nombre 
    public Lista( String nombreLista ){
        this.nombre = nombreLista;
        this.primerNodo = this.ultimoNodo = null; 
    }// Fin del constructor de Lista con un argumeto
    
    // Insertar objeto Object al frente de la lista
    public void insertarAlFrente( Object elementoInsertar ){
        if( estaVacia() )   // Primer y último nodo hace referencia al mismo objeto 
            this.primerNodo = this.ultimoNodo = new NodoLista(elementoInsertar);
        else    // primerNodo hace referencia al nuevo nodo
            this.primerNodo = new NodoLista(elementoInsertar, primerNodo);            
    }

    // Inserta objeto Object al final de la Lista
    public void insertarAlFinal( Object elementoInsertar ){
        if( estaVacia() )   // primerNodo y ultimoNodo hacen referencia al mismo objeto
            this.primerNodo = this.ultimoNodo = new NodoLista(elementoInsertar);
        else    // El siguiente nodo de ultimoNodo hace referencia al nuevo nodo
            this.ultimoNodo = this.ultimoNodo.siguienteNodo = new NodoLista(elementoInsertar);
    }
    
    // Eliminar el primer nodo de la lista 
    public Object eliminarDelFrente() throws ExcepcionListaVacia {      
        
        if( estaVacia() )   // Lanza excepcion si la lista está vacía
            throw new ExcepcionListaVacia(nombre);
        
        Object elementoEliminado = primerNodo.datos;    // Obtiene los datos que se van a eliminar
        
        // Actualiza las referencias primerNodo y ultimoNodo
        if( primerNodo == ultimoNodo )
            primerNodo = ultimoNodo = null;
        else 
            primerNodo = primerNodo.siguienteNodo;
        
        return elementoEliminado;   // Devuelve los datos del nodo eliminado
    }
    
    // Elimina el ultimo nodo de la lista 
    public Object eliminarDelFinal() throws ExcepcionListaVacia {
        
        if( estaVacia() )   // Lanza excepcion si la lista está vacía
            throw new ExcepcionListaVacia(nombre);
        
        Object elementoEliminado = ultimoNodo.datos;    // Obtiene los datos que se van a eliminar
        
        // Actualiza las referencias primerNodo y ultimoNodo
        if( primerNodo == ultimoNodo )
            primerNodo = ultimoNodo = null;
        else //Localiza el último nodo
        {
            NodoLista actual = primerNodo;
            
            //Itera mientras el nodo actual no haga referencia a ultimoNodo
            while( actual.siguienteNodo != ultimoNodo )
                actual = actual.siguienteNodo;
            
            ultimoNodo = actual;    // Actual el nuevo ultimoNodo
            actual.siguienteNodo = null; 
        }// Fin de else 
        
        return elementoEliminado;   // Devuelve los datos del nodo eliminado
    }
    
    // Determina si la lista está vacía
    public boolean estaVacia() {
        return primerNodo == null;  //Devuelve true si la lista está vacía
    }
    
    // Imprime el contenido de la lista
    public void imprimir() {
        
        if( estaVacia() ) {
            System.out.printf("%s vacia\n", nombre);
            return;
        }// Fin de if
        
        System.out.printf("La %s es: ", nombre);
        NodoLista actual = primerNodo;
        
        // Mientras no esté al final de la lista, imprime los datos del nodo actual
        while( actual != null ) {
            System.out.printf("%s ", actual.datos);
            actual = actual.siguienteNodo;
        }// Fin de while
        
        System.out.println("\n");
    }
}// Fin de la clase Lista
