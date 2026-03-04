package practice_8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionTasks {
    //1. Обработка проверяемого исключения
    public static void readFile() {
        try {
            FileReader fileReader = new FileReader("data.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    //2. Обработка непроверяемого исключения
    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Ошибка! Деление на ноль!");
        }
        return (double) a/ b;
    }

    //3. Создание и использование собственного проверяемого исключения
    public static boolean validateAge(int age) throws UncorrectAgeException{
        if (age < 0 || age > 150) {
            throw new UncorrectAgeException("Ошибка! Некорректный возраст! ");
        }
        return true;
    }

    //4. Создание и использование собственного непроверяемого исключения
    public static void checkEmail(String email) {
        String somePattern = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(somePattern);
        Matcher matcher = pattern.matcher(email);
        if(!matcher.matches()) {
            throw new UncorrectEmailException("Ошибка! Некорректный электронный адрес");
        }
        System.out.println("Корректный формат электронной почты: " + email);

    }

    public static void main(String[] args) {
        readFile();

        double result = 0;
        try {
            result = divide(5,0);
            System.out.println(result);
        } catch (ArithmeticException e ) {
            System.out.println("Словлено: " + e.getMessage());
        }

        int someAge = 151;
        boolean ifAgeCorrect = false;
        try {
            ifAgeCorrect = validateAge(someAge);   //нужно ли выносить отдельно ifAgeCorrect или просто sout(рез: validateAge(someAge)) ?
        } catch (UncorrectAgeException e) {
            System.out.println("Словлено: " + e.getMessage());
        }
        System.out.println("Корректен ли возраст: " + ifAgeCorrect);

        String someEmail = "gooddaytodaygmail.com";
        try {
            checkEmail(someEmail);
        } catch (UncorrectEmailException e) {
            System.out.println("Словлено: " + e.getMessage());
        }
    }
}
