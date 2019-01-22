/*
 * -------------------------------------------------------------------------
 * BolsaArreglo.java
 * Descripcion: 
 * Estructuras de Datos en Java  ---  Yimmy Quispe Yujra, Santa Cruz - 2019
 * -------------------------------------------------------------------------
 */
package estructuras.bolsas;

/**
 * Una clase de bolsas que almacenan los elementos en un arreglo de tamaño fijo.
 *
 * @author Yimmy Quispe Yujra
 * @param <T> es el la Clase del tipo de elemento de la bolsa.
 */
public class BolsaArreglo<T> implements Bolsa<T> {

    private final T[] bolsa;
    private static final int CAPACIDAD_INICIAL = 25;
    private int numeroDeElementos;
    
    public BolsaArreglo() {
        this(CAPACIDAD_INICIAL);
    }

    public BolsaArreglo(int capacidad) {
        numeroDeElementos = 0;
        bolsa = (T[]) new Object[capacidad];
    }
    
    private T eliminarElemento(int indiceElemento) {
        T resultado = null;
        if (!estaVacia() && indiceElemento > 0) {
            resultado = bolsa[indiceElemento];
            numeroDeElementos--;
            bolsa[indiceElemento] = bolsa[numeroDeElementos];
            bolsa[numeroDeElementos] = null;
        }
        
        return resultado;
    }
    
    private int getIndiceDe(T elemento) {
        for (int i = 0; i < numeroDeElementos; i++) {
            if (elemento.equals(bolsa[i])) {
                return i;
            }
        }
        
        return -1;
    }

    @Override
    public int getCantidadElementos() {
        return numeroDeElementos;
    }

    @Override
    public boolean estaLlena() {
        return numeroDeElementos == bolsa.length;
    }

    @Override
    public boolean estaVacia() {
        return numeroDeElementos == 0;
    }

    @Override
    public boolean adicionar(T elemento) {
        if (estaLlena()) {
            return false;
        }
        
        bolsa[numeroDeElementos] = elemento;
        numeroDeElementos++;
        return true;
    }

    @Override
    public T eliminar() {
        T eliminado = eliminarElemento(numeroDeElementos - 1);
        return eliminado;
    }

    @Override
    public boolean eliminar(T elemento) {
        
        int indice = getIndiceDe(elemento);
        T eliminado = eliminarElemento(indice);
        return elemento.equals(eliminado);
    }

    @Override
    public void vaciar() {
        
        // numeroDeElementos = 0;
        
        while (!estaVacia()) {            
            eliminar();
        }
    }

    @Override
    public int getFrecuenciaDe(T elemento) {
        int frecuencia = 0;
        
        for (int i = 0; i < numeroDeElementos; i++) {
            if (elemento.equals(bolsa[i])) {
                frecuencia++;
            }
        }
        
        return frecuencia;
    }

    @Override
    public boolean contiene(T elemento) {
        
        return getIndiceDe(elemento) > -1;
    }

    @Override
    public T[] toArray() {
        T[] resultado = (T[]) new Object[numeroDeElementos];
        
        // System.arraycopy(bolsa, 0, resultado, 0, numeroDeElementos);
        // resultado = Arrays.copyOf(bolsa, numeroDeElementos);
        
        for (int i = 0; i < numeroDeElementos; i++) {
            resultado[i] = bolsa[i];
        }
        
        return resultado;
    }

}
