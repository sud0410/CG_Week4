import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    StringUtils utils = new StringUtils();

    @Test void testReverse()       { assertEquals("olleh", utils.reverse("hello")); }
    @Test void testIsPalindrome()  { assertTrue(utils.isPalindrome("madam")); }
    @Test void testToUpperCase()   { assertEquals("JAVA", utils.toUpperCase("java")); }
}
