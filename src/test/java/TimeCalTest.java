import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeCalTest {

    @Test
    void timeCalutator() {
        assertEquals(1.0, TimeCal.timeCalutator(100, 100));
    }
}