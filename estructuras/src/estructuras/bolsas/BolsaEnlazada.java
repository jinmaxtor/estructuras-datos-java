/*
 * -------------------------------------------------------------------------
 * BolsaEnlazada.java
 * Descripcion: 
 * Estructuras de Datos en Java  ---  Yimmy Quispe Yujra, Santa Cruz - 2019
 * -------------------------------------------------------------------------
 */
package estructuras.bolsas;

import estructuras.nodos.Nodo;

/**
 *
 * @author Yimmy
 * @param <T>
 */
public class BolsaEnlazada<T> implements Bolsa<T> {

    private Nodo<T> primerNodo;
    private int numeroDeElementos;

    public BolsaEnlazada() {
        primerNodo = null;
        numeroDeElementos = 0;
    }

    private Nodo<T> getNodo(T elemento) {
        Nodo<T> nodoActual = primerNodo;
        while (nodoActual != null) {
            if (nodoActual.getDato().equals(elemento)) {
                return nodoActual;
            }

            nodoActual = nodoActual.getSiguienteNodo();
        }

        return nodoActual;
    }

    @Override
    public int getCantidadElementos() {
        return numeroDeElementos;
    }

    @Override
    public boolean estaLlena() {
        return false;
    }

    @Override
    public boolean estaVacia() {
        return numeroDeElementos == 0;
    }

    @Override
    public boolean adicionar(T elemento) {
        Nodo nuevoNodo = new Nodo(elemento);
        nuevoNodo.setSiguienteNodo(primerNodo);

        primerNodo = nuevoNodo;
        numeroDeElementos++;

        return true;
    }

    @Override
    public T eliminar() {
        T eliminado = null;
        if (primerNodo != null) {
            eliminado = primerNodo.getDato();
            primerNodo = primerNodo.getSiguienteNodo();
            numeroDeElementos--;
        }

        return eliminado;
    }

    @Override
    public boolean eliminar(T elemento) {
        Nodo nodoElemento = getNodo(elemento);
        if (nodoElemento != null) {
            nodoElemento.setDato(primerNodo.getDato());
            eliminar();
            return true;
        }

        return false;
    }

    @Override
    public void vaciar() {
        primerNodo = null;
        numeroDeElementos = 0;
    }

    @Override
    public int getFrecuenciaDe(T elemento) {
        int frecuencia = 0;
        Nodo nodoActual = primerNodo;
        while (nodoActual != null) {
            if (nodoActual.getDato().equals(elemento)) {
                frecuencia++;
            }

            nodoActual = nodoActual.getSiguienteNodo();
        }
        return frecuencia;
    }

    @Override
    public boolean contiene(T elemento) {
        Nodo nodoActual = primerNodo;
        while (nodoActual != null) {
            if (nodoActual.getDato().equals(elemento)) {
                return true;
            }
            nodoActual = nodoActual.getSiguienteNodo();
        }

        return false;
    }

    @Override
    public T[] toArray() {
        T[] resultado = (T[]) new Object[numeroDeElementos];

        int i = 0;
        Nodo<T> nodoActual = primerNodo;
        while (i < numeroDeElementos && nodoActual != null) {
            resultado[i] = nodoActual.getDato();
            nodoActual = nodoActual.getSiguienteNodo();
            i++;
        }

        return resultado;
    }

}
