package ar.charlycimino.ejemplos.buscadorgenerico;

/**
 *
 * @author Charly Cimino Aprendé más Java en mi canal:
 * https://www.youtube.com/c/CharlyCimino Encontrá más código en mi repo de
 * GitHub: https://github.com/CharlyCimino
 */
public class Persona implements Identificable<Integer> {

    private int DNI;
    private String nombre;
    private String apellido;

    public Persona(int DNI, String nombre, String apellido) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String nombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "DNI=" + DNI + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }    

    @Override
    public Integer getId() {
        return DNI;
    }

    @Override
    public void setId(Integer x) {
        this.DNI = x;
    }

    @Override
    public boolean sameId(Integer anotherID) {
         return this.DNI == anotherID;
    }

}
