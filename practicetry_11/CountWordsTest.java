package practicetry_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountWordsTest extends MethodsForTestingTest{
    /**
     * positive cases:
     * "hello " -> 1
     * "hello my friend" -> 3
     * "" -> 0
     * "   " -> 0
     * corner cases:
     * null -> NullPointerException
     */

    @ParameterizedTest
    @CsvSource(value = {
            //Positive cases:
            "hello, 1",
            "hello my friend, 3",
            "'', 0",
            "'  ', 0"
    })
    public void userCanCountWordsInValidString(String initialString, int expectedResult) {
        int actualResult = methodsForTesting.countWords(initialString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCannotCountWordsInNullString() {
        assertThrows(NullPointerException.class, () ->
            methodsForTesting.countWords(null),
                "Counting words in null string should lead to NullPointerException");
    }
}
