import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PruebaOrdenamientoPorCubetas {

    @Test
    public void pruebaListaDesordenada() {
        OrdenamientoPorCubetas algoritmo = new OrdenamientoPorCubetas();
        int[] entrada = {78, 17, 39, 26, 72, 94, 21, 12, 23, 68};
        int[] esperado = {12, 17, 21, 23, 26, 39, 68, 72, 78, 94};
        algoritmo.ordenar(entrada);
        assertArrayEquals(esperado, entrada);
    }

    @Test
    public void pruebaListaOrdenada() {
        OrdenamientoPorCubetas algoritmo = new OrdenamientoPorCubetas();
        int[] entrada = {10, 20, 30, 40, 50};
        int[] esperado = {10, 20, 30, 40, 50};
        algoritmo.ordenar(entrada);
        assertArrayEquals(esperado, entrada);
    }
}