import org.example.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    MathUtils utils = new MathUtils();

    @Test
    void testAdd() {
        assertEquals(10, utils.add(6, 4));
        assertEquals(0, utils.add(-5, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(2, utils.subtract(7, 5));
        assertEquals(-2, utils.subtract(5, 7));
    }

    @Test
    void testMultiply() {
        assertEquals(20, utils.multiply(4, 5));
        assertEquals(0, utils.multiply(0, 10));
    }

    @Test
    void testDivide() {
        assertEquals(3, utils.divide(9, 3));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            utils.divide(5, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
