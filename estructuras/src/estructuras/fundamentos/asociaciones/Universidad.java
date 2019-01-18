/*
 * -------------------------------------------------------------------------
 * Universidad.java
 * Descripcion: Clase utilizada para representar asociaciones en java.
 * Estructuras de Datos en Java  ---  Yimmy Quispe Yujra, Santa Cruz - 2019
 * -------------------------------------------------------------------------
 */
package estructuras.fundamentos.asociaciones;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Clase que representa una abstracción simple de una universidad.
 *
 * @author Yimmy
 * @version 1.0
 */
public class Universidad {

    private static class Departamento {

        final String nombre;
        Set<Profesor> miembros;

        public Departamento(String nombre) {
            this.nombre = nombre;
            this.miembros = new HashSet<>();
        }

        public void adicionarMiembro(Profesor profesor) {
            miembros.add(profesor);
        }
    }

    private final String nombre;
    private final Map<String, Departamento> departamentos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.departamentos = new TreeMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void adicicionarDepartamento(String nombre, Set<Profesor> miembros) {
        Departamento departamento = new Departamento(nombre);
        departamentos.put(nombre, departamento);
        for (Profesor miembro : miembros) {
            departamento.adicionarMiembro(miembro);
        }
    }

    public void adicionarEn(Profesor profesor, String nombreDepartamento) {
        Departamento departamento = departamentos.get(nombreDepartamento);
        if (departamento == null) {
            throw new RuntimeException("El departamento " + nombreDepartamento
                    + " no existe.");
        } else {
            departamento.adicionarMiembro(profesor);
        }
    }

    public Set<String> departamentos() {
        return departamentos.keySet();
    }
}
