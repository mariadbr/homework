package practicetry_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsValidPhoneNumberTest extends MethodsForTestingTest{
    /**
     * positive cases:
     * "+1 1234567890" -> true
     * negative cases:
     * "12345" -> false
     * "invalid" -> false
     * corner cases:
     * "" -> false
     * null -> NullPointerException
     */

    @Test
    public void userCanCheckIfStringIsValidPhoneNumber() {
        String initialString = "+1 1234567890";

        assertTrue(methodsForTesting.isValidPhoneNumber(initialString));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            //negative cases:
            "12345",
            "invalid",
            //corner cases:
            ""
    })
    public void userCanCheckIfStringIsNotValidPhoneNumber(String initialString) {
        assertFalse(methodsForTesting.isValidPhoneNumber(initialString));
    }

    @Test
    public void userCannotCheckIfNullStringIsValidPhoneNumber() {
        assertThrows(NullPointerException.class, () -> {
            methodsForTesting.isValidPhoneNumber(null);
        },"Checking if null string is valid phone number should lead to NullPointerException");
    }
}
