
package ar.charlycimino.ejemplos.buscadorgenerico;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public class Buscador<T extends Identificable, K> {
    public T buscar(Collection<? extends T> elementos, K id) {
        T encontrado = null;
        Iterator<? extends T> it = elementos.iterator();
        while (it.hasNext() && encontrado == null) {
            T actual = it.next();
            if (actual.sameId(id)) {
                encontrado = actual;
            }
        }
        return encontrado;
    }
}
