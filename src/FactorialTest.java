
import static org.junit.Assert.*;
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
    public void testFactorialOf1() {
        assertEquals(1, factorial.compute(1));
    }
    @Test
    public void testFactorialOf2() {
        assertEquals(2, factorial.compute(2));
    }
    @Test
    public void testFactorialOf3() {
        assertEquals(6, factorial.compute(3));
    }
    @Test
    public void testFactorialOf4() {
        assertEquals(24, factorial.compute(4));
    }
}
