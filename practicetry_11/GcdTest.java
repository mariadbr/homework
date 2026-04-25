package practicetry_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GcdTest extends MethodsForTestingTest{
    /**
     * positive cases:
     * ordinary numbers:
     * 24, 36 → 12
     * prime numbers:
     * 101, 103 → 1
     * corner cases:
     * 0, 10 -> 10
     */

    @ParameterizedTest
    @CsvSource(value = {
            //positive cases:
            "24, 36, 12",
            "101, 103, 1",
            //corner cases:
            "0, 10, 10"})
    public void userCanFindGcdOfValidNumbers(int firstInitialValue, int secondInitialValue, int expectedResult) {
        int actualValue = methodsForTesting.gcd(firstInitialValue, secondInitialValue);

        assertEquals(expectedResult, actualValue);
    }
}
