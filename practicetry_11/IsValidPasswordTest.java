package practicetry_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsValidPasswordTest extends MethodsForTestingTest{
    /**
     * positive cases:
     * "Password1" → true
     * negative cases:
     * "pass" → false
     * corner cases:
     * null → false
     */

    @Test
    public void userCanCheckIfPasswordIsValid() {
        String initialPassword = "Password1";

        boolean expectedResult = methodsForTesting.isValidPassword(initialPassword);

        assertTrue(expectedResult);
    }

    @Test
    public void userCanCheckIfPasswordIsNotValid() {
        String initialPassword = "pass";

        boolean expectedResult = methodsForTesting.isValidPassword(initialPassword);

        assertFalse(expectedResult);

    }

    @Test
    public void shouldReturnFalseWhenPasswordIsNull() {
        boolean expectedResult = methodsForTesting.isValidPassword(null);

        assertFalse(expectedResult);
    }
}
