/*
 * -------------------------------------------------------------------------
 * Nodo.java
 * Descripcion: 
 * Estructuras de Datos en Java  ---  Yimmy Quispe Yujra, Santa Cruz - 2019
 * -------------------------------------------------------------------------
 */
package estructuras.nodos;

/**
 * 
 * @author Yimmy Quispe Yujra
 * @version 1.0
 * @param <T> es la Clase de elmento que hay en el nodo.
 */
public class Nodo<T> {
    private T dato;
    private Nodo<T> siguienteNodo;

    public Nodo(T dato) {
        this(dato, null);
    }

    public Nodo(T dato, Nodo<T> siguienteNodo) {
        this.dato = dato;
        this.siguienteNodo = siguienteNodo;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguienteNodo() {
        return siguienteNodo;
    }

    public void setSiguienteNodo(Nodo<T> siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }
}
