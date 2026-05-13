package practicetry_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsEvenTest extends MethodsForTestingTest{
    /**
     * positive cases:
     * even numbers: "2" -> true
     *  "-2" -> true
     * negative cases:
     * odd numbers: "1" -> false
     *  "-1" -> false
     *  corner cases:
     *  "0" ->true
     */

    @ParameterizedTest
    @ValueSource(ints = {
            //positive cases:
            2, -2,
            //corner cases:
            0})
    public void userCanCheckIfValidNumberIsEven(int initialNumber) {
        boolean actualResult = methodsForTesting.isEven(initialNumber);

        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {
            //negative cases:
            1, -1})
    public void userCanCheckIfValidNumberIsNotEven(int initialNumber) {
        boolean actualResult = methodsForTesting.isEven(initialNumber);

        assertFalse(actualResult);
    }
}
