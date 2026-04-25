package practicetry_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortByLengthTest extends MethodsForTestingTest {
    /**
     * happy path:
     * [ "Java", "C", "Python" ] → [ "C", "Java", "Python" ]
     * corner cases:
     * [ "aa", "bb", "cc" ] -> [ "aa", "bb", "cc" ]
     * [] -> []
     */

    public static Stream<Arguments> validListsToSortByLength() {
        return Stream.of(
                //happy path:
                Arguments.of(Arrays.asList("Java", "C", "Python"), Arrays.asList("C", "Java", "Python")),
                //corner cases:
                Arguments.of(Arrays.asList("aa", "bb", "cc"), Arrays.asList("aa", "bb", "cc")),
                Arguments.of(Collections.emptyList(), Collections.emptyList())
        );
    }

    @ParameterizedTest
    @MethodSource("validListsToSortByLength")
    public void userCanSortValidListByLength(List<String> initialList, List<String> expectedResult) {
        List<String> actualResult = methodsForTesting.sortByLength(initialList);

        assertEquals(expectedResult, actualResult);
    }
}
