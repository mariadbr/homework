package complex_tasks.task_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTest {
    private final UserValidator validator = new UserValidator();

    @BeforeEach
    void enableValidation() {
        UserValidator.validationEnabled = true;
    }

    /**
     * happy path:
     * "Anna" -> true
     * negative cases:
     * "anna" -> exception
     * "" -> exception
     */

    @Test
    public void validateUserTest() {
        User user = new User("Anna", 18, "hello@gmail.com");

        assertDoesNotThrow(() ->  validator.validateUser(user));
    }

    @Test
    public void validateNameTest() {
        User user = new User("Anna", 28, "hello@gmail.com");

        boolean expectedResult = validator.validateName(user);

        assertTrue(expectedResult);
    }

    @Test
    public void validateEmptyNameTest() {
        User user = new User("", 28, "hello@gmail.com");

        assertThrows(InvalidUserException.class, () -> {
            validator.validateName(user);
        });
    }

    @Test
    public void validateLowerCaseNameTest() {
        User user = new User("anna", 28, "hello@gmail.com");

        assertThrows(InvalidUserException.class, () -> {
            validator.validateName(user);
        });
    }

    /**
     * happy path:
     * "25" -> true
     * negative cases:
     * "17" -> exception
     * "105" -> exception
     */

    @Test
    public void validateAgeTest() {
        User user = new User("Anna", 25, "hello@gmail.com");

        boolean actualResult = validator.validateAge(user);

        assertTrue(actualResult);
    }

    @Test
    public void validateTooYoungAgeTest() {
        User user = new User("Kate", 17, "hello@gmail.com");

        assertThrows(InvalidUserException.class, () -> validator.validateAge(user));
    }

    @Test
    public void validateTooOldAgeTest() {
        User user = new User("Liz", 105, "hello@gmail.com");

        assertThrows(InvalidUserException.class, () -> validator.validateAge(user));
    }

    /**
     * happy path:
     * "hello@gmail.com" -> true
     * negative cases:
     * "hellogmail.com" -> exception
     */

    @Test
    public void validateEmailTest() {
        User user = new User("Lory", 27, "hello@gmail.com");

        boolean actualResult = validator.validateEmail(user);

        assertTrue(actualResult);
    }

    @Test
    public void validateIncorrectEmailTest() {
        User user = new User("Lory", 27, "hellogmail.com");

        assertThrows(InvalidUserException.class, () -> validator.validateEmail(user));
    }
}
