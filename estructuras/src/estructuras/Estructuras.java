/*
 * -------------------------------------------------------------------------
 * Estructuras.java
 * Descripcion: 
 * Estructuras de Datos en Java  ---  Yimmy Quispe Yujra, Santa Cruz - 2019
 * -------------------------------------------------------------------------
 */
package estructuras;

import estructuras.bolsas.*;
import estructuras.nodos.*;

/**
 *
 * @author Yimmy Quispe Yujra
 * @version 1.0
 */
public class Estructuras {
    /**
     * Metodo principal, en el cual se ejecuta todo programa java.
     * @param args argumentos para la linea de comandos
     */
    public static void main(String[] args) {
        System.out.println("Holas de mar compas, digo mundo v: !!!");
	
		Bolsa numeros = new BolsaEnlazada();
		
		numeros.adicionar(7);
		numeros.adicionar("r");
		numeros.adicionar(new Nodo("y"));
		
		Object[] l = numeros.toArray();
		
		for (int i = 0; i < l.length; i++) {
			System.out.println(l[i]);
		}
    }
}
