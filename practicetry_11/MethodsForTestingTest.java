package practicetry_11;

import org.junit.jupiter.api.BeforeEach;

public class MethodsForTestingTest {
    protected MethodsForTesting methodsForTesting;

    @BeforeEach
    public void setupTest() {
        methodsForTesting = new MethodsForTesting();
    }
}
