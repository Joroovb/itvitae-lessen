import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KroegTest {

    @Test
    void checkLeeftijdLagerDan18() {
        Kroeg k = new Kroeg();
        assertFalse(k.checkLeeftijd(17));
    }

    @Test
    void checkLeeftijd18() {
        Kroeg k = new Kroeg();
        assertTrue(k.checkLeeftijd(18));
    }

    @Test
    void checkLeeftijdKleinerDanNul() {
        Kroeg k = new Kroeg();
        assertThrows(IllegalArgumentException.class, () -> {
            k.checkLeeftijd(-1);
        });
    }
}
// parameters           body
// ()              ->      {}