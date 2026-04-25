package practicetry_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMaxTest extends MethodsForTestingTest{
    /**
     * positive cases:
     * [3, 5, 7, 2] -> 7
     * [5] -> 5
     * [-2, -10, -1, -7] -> -1
     * corner cases:
     * [] -> NoSuchElementException
     */
    public static Stream<Arguments> validArraysToFindMax() {
        return Stream.of(
                //positive cases:
                Arguments.of(new int[]{3, 5, 7, 2}, 7),
                Arguments.of(new int[]{5}, 5),
                Arguments.of(new int[]{-2, -10, -1, -7}, -1)
        );
    }

    @ParameterizedTest
    @MethodSource("validArraysToFindMax")
    public void userCanFindMaxInValidArray(int[] initialArray, int expectedResult) {
        int actualResult = methodsForTesting.findMax(initialArray);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCannotFindMaxInEmptyArray() {
        int[] initialArray = {};

        assertThrows(NoSuchElementException.class, () -> {
            methodsForTesting.findMax(initialArray);
                }, "An attempt to find max in empty array should lead to NoSuchElementException");
    }
}
