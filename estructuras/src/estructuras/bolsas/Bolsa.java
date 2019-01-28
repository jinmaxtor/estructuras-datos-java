/*
 * -------------------------------------------------------------------------
 * Bolsa.java
 * Descripcion: Interface utiliza para representar la abstrwcción đe una
 * bolsa que contiene cualquier tipo de elementos.
 * Estructuras de Datos en Java  ---  Yimmy Quispe Yujra, Santa Cruz - 2019
 * -------------------------------------------------------------------------
 */
package estructuras.bolsas;

/**
 * Interface que representa la abstracción de una bolsa. Una bolsa es un
 * conjunto finito de elementos que no tienen un orden particular, una bolsa
 * puede contener elementos repetidos.
 *
 * @author Yimmy Quispe Yujra
 * @version 1.0
 * @param <T> es la Clase de elmentos que hay en la bolsa.
 */
public interface Bolsa<T> {

    /**
     *
     * @return
     */
    int getCantidadElementos();

    /**
     *
     * @return
     */
    boolean estaLlena();

    /**
     *
     * @return
     */
    boolean estaVacia();

    /**
     *
     * @param elemento
     * @return
     */
    boolean adicionar(T elemento);

    /**
     *
     * @return
     */
    T eliminar();

    /**
     *
     * @param elemento
     * @return
     */
    boolean eliminar(T elemento);

    /**
     *
     */
    void vaciar();

    /**
     *
     * @param elemento
     * @return
     */
    int getFrecuenciaDe(T elemento);

    /**
     *
     * @param elemento
     * @return
     */
    boolean contiene(T elemento);

    /**
     *
     * @return
     */
    T[] toArray();
}
