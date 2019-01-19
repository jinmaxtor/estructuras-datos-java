/*
 * -------------------------------------------------------------------------
 * ArrayBolsa.java
 * Descripcion: 
 * Estructuras de Datos en Java  ---  Yimmy Quispe Yujra, Santa Cruz - 2019
 * -------------------------------------------------------------------------
 */
package estructuras.bolsas;

/**
 * Una clase de bolsas que almacenan los elementos en un arreglo de tamaño fijo.
 *
 * @author Yimmy
 * @param <T> es el la Clase del tipo de elemento de la bolsa.
 */
public class ArrayBolsa<T> implements Bolsa<T> {

    private final T[] bolsa;
    private static final int CAPACIDAD_INICIAL = 25;
    private int numeroDeElementos;

    public ArrayBolsa() {
        this(CAPACIDAD_INICIAL);
    }

    public ArrayBolsa(int capacidad) {
        numeroDeElementos = 0;
        bolsa = (T[]) new Object[capacidad];
    }

    @Override
    public int getCantidadElementos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean estaLlena() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean estaVacia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean adicionar(T elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(T elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void vaciar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getFrecuenciaDe(T elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contiene(T elemento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
