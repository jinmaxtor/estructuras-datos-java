/*
 * -------------------------------------------------------------------------
 * PruebaFundamentos.java
 * Descripcion: 
 * Estructuras de Datos en Java  ---  Yimmy Quispe Yujra, Santa Cruz - 2019
 * -------------------------------------------------------------------------
 */
package estructuras.fundamentos;

import estructuras.fundamentos.asociaciones.Profesor;
import estructuras.fundamentos.asociaciones.Universidad;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Yimmy
 * @version 1.0
 */
public class PruebaFundamentos {
    /**
     * Metodo principal, en el cual se ejecuta todo programa java.
     * @param args argumentos para la linea de comandos
     */
    public static void main(String[] args) {
        System.out.println("Holas de mar compas, digo mundo v: !!!");
        
        Universidad uagrm = new Universidad("Universidad Autónoma Gabriel René Moreno");
        Profesor mario = new Profesor("Mario Gimber", "Zeballos", "Cruz", Profesor.Grado.MAESTRIA);
        Profesor roberto = new Profesor("Carlos Roberto", "Vaca", "Pinto", Profesor.Grado.LICENCIATURA);
        Profesor gino = new Profesor("Gino", "Barrozo", "Viruez", Profesor.Grado.MAESTRIA);
        Profesor juan = new Profesor("Juan Carlos", "Contreras", "Villegas", Profesor.Grado.MAESTRIA);
        Profesor javier = new Profesor("Javier", "Alanoca", "Gutierrez", Profesor.Grado.DOCTORADO);
        Profesor carlos = new Profesor("Carlos", "Miranda", "Carrasco", Profesor.Grado.LICENCIATURA);
        Profesor valet = new Profesor("Valet", "Corrado", "Corrado", Profesor.Grado.DOCTORADO);
        Profesor mirian = new Profesor("Mirian", "Guzman", "de Molina", Profesor.Grado.DOCTORADO);
        Profesor claure = new Profesor("Claure", "Medrano", "de Oropeza", Profesor.Grado.MAESTRIA);
        Set<Profesor> miembros = new HashSet<>();
        Collections.addAll(miembros, mario, roberto, gino, juan, javier);
        uagrm.adicicionarDepartamento("Informatica", miembros);
        miembros.clear();
        Collections.addAll(miembros, carlos, valet);
        uagrm.adicicionarDepartamento("Matemáticas", miembros);
        miembros.clear();
        Collections.addAll(miembros, mirian, claure);
        uagrm.adicicionarDepartamento("Inglés", miembros);
    }
}
