package practicetry_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidJson extends MethodsForTestingTest{
    /**
     * positive cases:
     * "{"key":"value"}" → true
     * negative cases:
     * "invalid json" -> false
     * corner cases:
     * null → false
     */

    @Test
    public void userCanCheckIfStringIsValidJson() {
        String initialValue = "{\"key\":\"value\"}";

        boolean actualResult = methodsForTesting.isValidJson(initialValue);

        assertTrue(actualResult);
    }

    @Test
    public void userCanCheckIfStringIsNotValidJson() {
        String initialValue = "invalid json";

        boolean actualResult = methodsForTesting.isValidJson(initialValue);

        assertFalse(actualResult);
    }

    @Test
    public void shouldReturnFalseWhenStrIsNull() {
        boolean actualResult = methodsForTesting.isValidJson(null);

        assertFalse(actualResult);
    }
}
