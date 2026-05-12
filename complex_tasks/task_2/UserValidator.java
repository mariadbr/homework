package complex_tasks.task_2;


public class UserValidator {
    public static boolean validationEnabled = true;

    public void validateUser(User user) {
        if (!validationEnabled) {
            return;
        } else {
            validateAge(user);
            validateName(user);
            validateEmail(user);
        }
    }

    public boolean validateName(User user) {
        if (user.getName() != null && user.getName().matches("^[A-ZА-Я].*")) {
            return true;
        } else {
            throw new InvalidUserException("Некорректное имя!");
        }
    }

    public boolean validateAge(User user) {
        if (user.getAge() >= 18 && user.getAge() <= 100) {
            return true;
        } else {
            throw new InvalidUserException("Некорректный возраст!");
        }
    }

    public boolean validateEmail(User user) {
        if (user.getEmail() != null && user.getEmail().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            return true;
        } else {
            throw new InvalidUserException("Некорректный email!");
        }
    }
}
