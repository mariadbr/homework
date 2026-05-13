package practicetry_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidEmail extends MethodsForTestingTest{
    /**
     * happy path:
     * "test@example.com" -> true
     * negative cases:
     * "bad@.com" -> false
     * "no-at-symbol" -> false
     * corner cases:
     * "" -> false
     * null -> false
     */

    @Test
    public void userCanCheckIfStringIsValidEmail() {
        String initialString = "test@example.com";

        boolean actualResult = methodsForTesting.isValidEmail(initialString);

        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            //negative cases:
            "bad@.com", "no-at-symbol",
            //corner cases:
            ""})
    public void userCanCheckIfStringIsNotValidEmail(String initialString) {
        boolean actualResult = methodsForTesting.isValidEmail(initialString);

        assertFalse(actualResult);
    }

    @Test
    public void shouldReturnFalseWhenEmailIsNull() {
        boolean actualResult = methodsForTesting.isValidEmail(null);

        assertFalse(actualResult);
    }
}
