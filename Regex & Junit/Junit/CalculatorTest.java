import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test void testAdd()       { assertEquals(8, c.add(5, 3)); }
    @Test void testSubtract()  { assertEquals(2, c.subtract(5, 3)); }
    @Test void testMultiply()  { assertEquals(15, c.multiply(5, 3)); }
    @Test void testDivide()    { assertEquals(2, c.divide(6, 3)); }

    @Test void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> c.divide(5, 0));
    }
}
