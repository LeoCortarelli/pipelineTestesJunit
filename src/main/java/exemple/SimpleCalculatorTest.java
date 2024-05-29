package exemple;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {
    @Test
    public void testSum() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(5, calculator.sum(2, 3));
    }
}

