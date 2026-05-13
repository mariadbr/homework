package practicetry_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindAverageTest extends MethodsForTestingTest{
    /**
     * positive cases:
     * [1, 2, 3, 4, 5] → 3.0
     * [10] → 10.0
     * corner cases:
     * [] -> NoSuchElementException
     */
    public static Stream<Arguments> validArraysToFindAverage() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5}, 3.0),
                Arguments.of(new int[]{10}, 10.0));
    }

    @ParameterizedTest
    @MethodSource("validArraysToFindAverage")
    public void userCanFindAverageOfValidArray(int[] initialArray, double expectedResult) {
        double actualResult = methodsForTesting.findAverage(initialArray);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCannotFindAverageOfEmptyArray() {
        int [] initialArray = {};

        assertThrows(NoSuchElementException.class, () -> {
            methodsForTesting.findAverage(initialArray);
                }, "Finding average of an empty array should lead to NoSuchElementException.");
    }
}
