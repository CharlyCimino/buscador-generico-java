
package ar.charlycimino.ejemplos.buscadorgenerico;

import java.util.ArrayList;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<Auto> autos = new ArrayList<>();
        autos.add(new Auto("BCD234", "Verde"));
        autos.add(new Auto("DEF458", "Blanco"));
        autos.add(new Auto("CDE345", "Azul"));
        autos.add(new Auto("DEF457", "Gris"));
        
        Buscador<Auto, String> buscadorDeAutosPorPatente;
        buscadorDeAutosPorPatente = new Buscador<>();
        Auto a = buscadorDeAutosPorPatente.buscar(autos, "CDE345");
        System.out.println(a);
        
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(new Persona(1234, "Pepe", "Gomez"));
        personas.add(new Persona(1596, "Ana", "Perez"));
        personas.add(new Persona(7645, "Luis", "Lopez"));
        personas.add(new Persona(2345, "Lía", "Alvarez"));
        personas.add(new Persona(4763, "Sara", "Britez"));
        
        Buscador<Persona, Integer> buscadorDePersonasPorDNI;
        buscadorDePersonasPorDNI = new Buscador<>();
        Persona p = buscadorDePersonasPorDNI.buscar(personas, 2345);
        System.out.println(p);
        
        
    }

}
