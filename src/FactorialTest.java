
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
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
@RunWith(Parameterized.class)
public class FactorialParameterizedTest {

    private int input;
    private int expected;
    private Factorial factorial;

    public FactorialParameterizedTest(int input, int expected) {
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void setup() {
        factorial = new Factorial();
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120}
        };
    }

    @Test
    public void testCompute() {
        assertEquals(expected, factorial.compute(input));
    }
}