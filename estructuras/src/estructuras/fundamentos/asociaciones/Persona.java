/*
 * -------------------------------------------------------------------------
 * Persona.java
 * Descripcion: Clase simple utilizada para ejemplificar las asociaciones
 * en clases java.
 * Estructuras de Datos en Java  ---  Yimmy Quispe Yujra, Santa Cruz - 2019
 * -------------------------------------------------------------------------
 */
package estructuras.fundamentos.asociaciones;

/**
 * Clase que representa una abstracción de una persona.
 *
 * @author Yimmy Quispe Yujra
 * @version 1.0
 */
public class Persona {

    private final String nombres;
    private final String apellidoPaterno;
    private final String apellidoMaterno;

    public Persona(String nombres, String apellidoPaterno, String apellidoMaterno) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    @Override
    public String toString() {
        return "Persona{" + nombres + " " + apellidoPaterno + " " + apellidoMaterno + '}';
    }
}
