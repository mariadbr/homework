package practicetry_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest extends MethodsForTestingTest{
    /**
     * happy path:
     *  1!, 5!, 7! -> 1, 120, 5040
     * corner cases:
     *  0! -> 1
     * negative numbers:
     *  -5 -> IllegalArgumentException
     */

    @ParameterizedTest
    @CsvSource(value = {
            //happy path:
            "1, 1",
            "5, 120",
            "7, 5040",
            //corner cases:
            "0, 1"})
    public void userCanFindFactorialOfNumber(int initialNumber, int expectedResult) {
        int actualResult = methodsForTesting.factorial(initialNumber);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCannotFindFactorialOfNegativeNumber() {
        int initialNumber = -5;

        assertThrows(IllegalArgumentException.class, () -> {
            methodsForTesting.factorial(initialNumber);
        }, "An attempt to find factorial of a negative number should lead to IllegalArgumentException");
    }
}
