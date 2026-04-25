package practicetry_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountVowelsTest extends MethodsForTestingTest{
    /**
     * positive cases:
     * even number: "hello" -> 2
     * odd number: "java" -> 2
     * all caps: "AEIOU" -> 5
     * no vowels: "tks" -> 0
     * corner cases:
     * "" -> 0
     * null -> IllegalArgumentException
     */

    @ParameterizedTest
    @CsvSource(value = {
            //positive cases:
            "hello, 2",
            "java, 2",
            "AEIOU, 5",
            "tks, 0",
            //corner cases:
            "'', 0"
    })
    public void userCanCountVowelsInValidString(String initialString, int expectedResult) {
        int actualResult = methodsForTesting.countVowels(initialString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCannotCountVowelsInNullString() {
        assertThrows(IllegalArgumentException.class, () -> {
            methodsForTesting.countVowels(null);
        }, "Counting vowels in null string should lead to IllegalArgumentException");
    }
}
