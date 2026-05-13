package practicetry_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsLeapYearTest extends MethodsForTestingTest{
    /**
     * positive cases:
     * 2020, 2000, 1600 -> true
     * negative cases:
     * 2021, 2018 -> false
     * corner cases:
     * divided by 100 but not by 400:
     * 1900, 2100 -> false
     */

    @ParameterizedTest
    @ValueSource(ints = {
            //positive cases:
            2020, 2000, 1600})
    public void userCanCheckIfYearIsLeapYear(int initialYear) {
        boolean actualResult = methodsForTesting.isLeapYear(initialYear);

        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {
            //negative cases:
            2021, 2018,
            //corner cases:
            1900, 2100})
    public void userCanCheckIfYearIsNotLeapYear(int initialYear) {
        boolean actualResult = methodsForTesting.isLeapYear(initialYear);

        assertFalse(actualResult);
    }
}
