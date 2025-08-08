import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;

public class FactorialTest {

    private Factorial factorial;

    @Before
    public void setup() {
        factorial = new Factorial();
    }

    @Test
    public void testBaseCase() {
        assertEquals(1, factorial.compute(0));
    }

    @Test
    public void testInductiveCase() {
        // Our specification assumes factorial.compute(4) yields 24
        // So we assert this induction hypothesis first
        assertEquals(24, factorial.compute(4));
        // Then check the recursive case
        assertEquals(5 * factorial.compute(4), factorial.compute(5));
    }

    @Test
    public void testNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> factorial.compute(-1));
    }
}
