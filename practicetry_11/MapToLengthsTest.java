package practicetry_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapToLengthsTest extends MethodsForTestingTest{
    /**
     * happy path:
     * [ "Java", "C++", "Go" ] → [ 4, 3, 2 ]
     * corner cases:
     * [] -> []
     */
    public static Stream<Arguments> listsToMapToLengths() {
        return Stream.of(
                Arguments.of(Arrays.asList("Java", "C++", "Go"), Arrays.asList(4, 3, 2)),
                Arguments.of(Collections.emptyList(), Collections.emptyList()));
    }

    @ParameterizedTest
    @MethodSource("listsToMapToLengths")
    public void userCanMapListWithStringsToLengths(List<String> initialList, List<Integer> expectedResult) {
        List<Integer> actualResult = methodsForTesting.mapToLengths(initialList);

        assertEquals(expectedResult, actualResult);

    }
}
