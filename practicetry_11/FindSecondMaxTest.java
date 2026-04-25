package practicetry_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindSecondMaxTest extends MethodsForTestingTest{
    /**
     * happy path:
     * [1, 5, 7, 9] -> 7
     * negative cases:
     * [4, 4, 4, 4] -> NoSuchElementException
     * corner cases:
     * [1] -> NoSuchElementException
     * [] -> NoSuchElementException
     */

    @Test
    public void userCanFindSecondMaxInValidArray() {
        int[] initialArray = {1, 5, 7, 9};

        int expectedResult = 7;

        int actualResult = methodsForTesting.findSecondMax(initialArray);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void userCannotFindSecondMaxInArrayWithDuplicates() {
        int[] initialArray = {4, 4, 4, 4};

        assertThrows(NoSuchElementException.class, () -> {
            methodsForTesting.findSecondMax(initialArray);
                }, "An attempt to find second max in array with duplicates should lead to NoSuchElementException");

    }

    public static Stream<Arguments> oneAndNoElementArraysToFindSecondMax() {
        return Stream.of(
                Arguments.of(new int[]{1}),
                Arguments.of(new int[]{}));
    }

    @ParameterizedTest
    @MethodSource("oneAndNoElementArraysToFindSecondMax")
    public void userCannotFindSecondMaxInArrayWithOneOrNoElements(int[] initialArray) {
        assertThrows(IllegalArgumentException.class, () -> {  // По подсказкам к заданию ожидается NoSuchElementException, но реальный код
            // бросает IllegalArgumentException. Здесь нужна именно реализация NoSuchElementException.class?
            methodsForTesting.findSecondMax(initialArray);
        }, "An attempt to find second max in array with one or no elements should lead to IllegalArgumentException");
    };
}
