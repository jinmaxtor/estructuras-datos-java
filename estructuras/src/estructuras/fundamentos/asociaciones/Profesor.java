/*
 * -------------------------------------------------------------------------
 * Profesor.java
 * Descripcion: Clase utilizada para representar las asociaciones.
 * Estructuras de Datos en Java  ---  Yimmy Quispe Yujra, Santa Cruz - 2019
 * -------------------------------------------------------------------------
 */
package estructuras.fundamentos.asociaciones;

/**
 * Clase Profesor, representa una abstracción simple de un profesor.
 *
 * @author Yimmy Quispe Yujra
 * @version 1.0
 */
public class Profesor extends Persona {

    public static enum Grado {
        LICENCIATURA, MAESTRIA, DOCTORADO
    };

    private Grado grado;

    public Profesor(String nombres, String apellidoPaterno, String apellidoMaterno, Grado grado) {
        super(nombres, apellidoPaterno, apellidoMaterno);
        this.grado = grado;
    }

    public Grado getGrado() {
        return grado;
    }

    public void setGrado(Grado grado) {
        this.grado = grado;
    }

    @Override
    public String toString() {
        return "Profesor{" + super.toString() + ", grado: " + grado + '}';
    }

}
