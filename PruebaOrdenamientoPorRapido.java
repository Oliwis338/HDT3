import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PruebaOrdenamientoPorRapido {

    @Test
    public void pruebaListaDesordenada() {
        OrdenamientoPorRapido algoritmo = new OrdenamientoPorRapido();
        int[] entrada = {10, 7, 8, 9, 1, 5};
        int[] esperado = {1, 5, 7, 8, 9, 10};
        algoritmo.ordenar(entrada);
        assertArrayEquals(esperado, entrada);
    }

    @Test
    public void pruebaListaVacía() {
        OrdenamientoPorRapido algoritmo = new OrdenamientoPorRapido();
        int[] entrada = {};
        int[] esperado = {};
        algoritmo.ordenar(entrada);
        assertArrayEquals(esperado, entrada);
    }
}