package practicetry_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterEvenNumbersTest extends MethodsForTestingTest{
    /**
     * positive cases:
     * [1, 2, 3, 4, 5, 6] → [2, 4, 6]
     * corner cases:
     * [1, 3, 5] -> []
     * [] -> []
     */

    public static Stream<Arguments> validListsToFilter() {
        return Stream.of(
                //positive cases:
                Arguments.of(Arrays.asList(1, 2, 3, 4, 5, 6), Arrays.asList(2, 4, 6)),
                //corner cases:
                Arguments.of(Arrays.asList(1, 3, 5), Collections.emptyList()),
                Arguments.of(Collections.emptyList(), Collections.emptyList())
        );
    }

    @ParameterizedTest
    @MethodSource("validListsToFilter")
    public void userCanFilterEvenNumbersInList (List<Integer> initialList, List<Integer> expectedResult) {
        List<Integer> actualResult = methodsForTesting.filterEvenNumbers(initialList);

        assertEquals(expectedResult, actualResult);
    }
}
