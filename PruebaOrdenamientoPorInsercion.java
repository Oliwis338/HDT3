import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PruebaOrdenamientoPorInsercion {

    @Test
    public void pruebaListaDesordenada() {
        OrdenamientoPorInsercion algoritmo = new OrdenamientoPorInsercion();
        int[] entrada = {5, 2, 9, 1, 5, 6};
        int[] esperado = {1, 2, 5, 5, 6, 9};
        algoritmo.ordenar(entrada);
        assertArrayEquals(esperado, entrada);
    }

    @Test
    public void pruebaListaOrdenada() {
        OrdenamientoPorInsercion algoritmo = new OrdenamientoPorInsercion();
        int[] entrada = {1, 2, 3, 4, 5};
        int[] esperado = {1, 2, 3, 4, 5};
        algoritmo.ordenar(entrada);
        assertArrayEquals(esperado, entrada);
    }
}