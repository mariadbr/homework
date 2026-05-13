package practicetry_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseTest extends MethodsForTestingTest{
    /**
     * happy path:
     * "hello" -> "olleh"
     * "12345" -> "54321"
     * corner cases:
     * "" -> ""
     * "a" -> "a"
     * null -> null
     */

    @ParameterizedTest
    @CsvSource(value = {
            // happy path:
            "hello, olleh",
            "12345, 54321",
            //corner cases:
            "'',''",
            "a, a"
    })
    public void userCanReverseValidString(String initialString, String expectedResult) {
        String actualResult = methodsForTesting.reverse(initialString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCannotReverseInvalidNullString() {
        assertNull(methodsForTesting.reverse(null));
    }
}
