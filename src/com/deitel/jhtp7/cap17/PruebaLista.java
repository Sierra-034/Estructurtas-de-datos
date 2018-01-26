// Fig. 17.5: PruebaLista.java
// Clase PruebaLista para demostrar las capacidades de Lista.
package com.deitel.jhtp7.cap17;

public class PruebaLista {

    public static void main(String[] args) {
        
        Lista lista = new Lista();  // Crea el contenedor de Lista
        
        // Insertar enteros en la lista
        lista.insertarAlFrente(-1);
        lista.imprimir();
        lista.insertarAlFrente(0);
        lista.imprimir();
        lista.insertarAlFinal(1);
        lista.imprimir();
        lista.insertarAlFinal(5);
        lista.imprimir();
        
        // Elimina objetos de lista; imprime después de cada eliminación
        try {
            
            Object objetoEliminado = lista.eliminarDelFrente();
            System.out.printf("%s eliminado\n", objetoEliminado);
            lista.imprimir();
            
            objetoEliminado = lista.eliminarDelFrente();
            System.out.printf("%s eliminado\n", objetoEliminado);
            lista.imprimir();
            
            objetoEliminado = lista.eliminarDelFinal();
            System.out.printf("%s eliminado\n", objetoEliminado);
            lista.imprimir();
            
            objetoEliminado = lista.eliminarDelFinal();
            System.out.printf("%s eliminado\n", objetoEliminado);
            lista.imprimir();
        } 
        catch (ExcepcionListaVacia excepcionLstaVacia) {
            
            excepcionLstaVacia.printStackTrace();
        }
    }
    
}
