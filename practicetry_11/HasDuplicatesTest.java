package practicetry_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HasDuplicatesTest extends MethodsForTestingTest{
    /**
     * positive cases:
     * [1, 2, 2, 3] → true
     * negative cases:
     * [1, 2, 3, 4, 5] → false
     * corner cases:
     * [] -> false
     */

    @Test
    public void userCanCheckIfValidArrayHasDuplicates() {
        int[] initialArray = {1, 2, 2, 3};

        boolean actualResult = methodsForTesting.hasDuplicates(initialArray);

        assertTrue(actualResult);
    }

    @Test
    public void userCanCheckIfValidArrayDoesNotHaveDuplicates() {
        int[] initialArray = {1, 2, 3, 4, 5};

        boolean actualResult = methodsForTesting.hasDuplicates(initialArray);

        assertFalse(actualResult);
    }

    @Test
    public void userCanCheckIfEmptyArrayHasDuplicates() {
        int[] initialArray = {};

        boolean actualResult = methodsForTesting.hasDuplicates(initialArray);

        assertFalse(actualResult);
    }
}
