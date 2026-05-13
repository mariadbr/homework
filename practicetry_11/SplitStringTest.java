package practicetry_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SplitStringTest extends MethodsForTestingTest{
    /**
     * positive cases:
     * "Java,Python,C++", "," → ["Java", "Python", "C++"]
     * corner cases:
     * "", "," → [""]
     * "word", "," → ["word"]
     */

    private static Stream<Arguments> validStringsToSplitByDelimiter() {
        return Stream.of(
                // positive cases
                Arguments.of("Java,Python,C++", ",", new String[]{"Java", "Python", "C++"}),
                // corner cases
                Arguments.of("", ",", new String[]{""}),
                Arguments.of("word", ",", new String[]{"word"}));
    }

    @ParameterizedTest
    @MethodSource("validStringsToSplitByDelimiter")
    public void userCanSplitValidStringByDelimiter(String initialString, String delimiter, String[] expectedResult) {
        String[] actualResult = methodsForTesting.splitString(initialString, delimiter);

        assertArrayEquals(expectedResult, actualResult);
    }
}
