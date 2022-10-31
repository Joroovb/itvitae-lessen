import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RekenmachineTest {
    // aftrekken
    // delen
    // vermedigvuldigen
    // wortel trekken
    // tot de macht

    @Test
    void tweePlusTweeIsVier() {
        Rekenmachine r = new Rekenmachine();
        assertEquals(4, r.optellen(2, 2));
    }

    @Test
    void driePlusVierIsZeven() {
        Rekenmachine r = new Rekenmachine();
        assertEquals(7, r.optellen(3, 4));
    }
}