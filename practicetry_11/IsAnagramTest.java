package practicetry_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsAnagramTest extends MethodsForTestingTest{
    /**
     * positive tests:
     * "listen", "silent" → true
     * negative tests:
     * "java", "python" → false
     * corner cases:
     * null → false
     */

    @Test
    public void userCanCheckIfValidStringIsAnagramOfAnotherValidString() {
        String initialString = "listen";
        String expectedResult = "silent";

        boolean actualResult = methodsForTesting.isAnagram(initialString, expectedResult);

        assertTrue(actualResult);
    }

    @Test
    public void userCanCheckIfValidStringIsNotAnagramOfAnotherValidString() {
        String initialString = "java";
        String expectedResult = "python";

        boolean actualResult = methodsForTesting.isAnagram(initialString, expectedResult);

        assertFalse(actualResult);
    }

    @Test
    public void userCannotCheckIfNullStringIsAnagramOfAnotherString() {
        boolean actualResult = methodsForTesting.isAnagram(null, "okay");

        assertFalse(actualResult);
    }
}
