import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PruebaOrdenamientoPorMezcla {

    @Test
    public void pruebaListaDesordenada() {
        OrdenamientoPorMezcla algoritmo = new OrdenamientoPorMezcla();
        int[] entrada = {8, 4, 3, 7, 6, 5, 2, 1};
        int[] esperado = {1, 2, 3, 4, 5, 6, 7, 8};
        algoritmo.ordenar(entrada);
        assertArrayEquals(esperado, entrada);
    }

    @Test
    public void pruebaListaConRepetidos() {
        OrdenamientoPorMezcla algoritmo = new OrdenamientoPorMezcla();
        int[] entrada = {3, 3, 1, 2, 2, 4};
        int[] esperado = {1, 2, 2, 3, 3, 4};
        algoritmo.ordenar(entrada);
        assertArrayEquals(esperado, entrada);
    }
}