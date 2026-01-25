package practice_4;

import java.util.Scanner;

public class IfElseTasks {
    public static void main(String[] args) {
        System.out.println(checkSignOfNumber());

        System.out.println(maxNumOfTwo());

        System.out.println(gradeDiscription());

        System.out.println(checkParity());

        System.out.println(checkSale());

        System.out.println(evaluationByScores());
    }

    //1. Определение знака числа
    public static String checkSignOfNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ВВедите число: ");
        int number = scanner.nextInt();
        String signCheck = "Число равно нулю";
        if (number > 0) {
            signCheck = "Число положительное";
        } else if (number < 0) {
            signCheck = "Число отрицательное";
        }
        return signCheck;
    }

    //2. Поиск наибольшего из двух чисел
    public static int maxNumOfTwo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ВВедите первое число: ");
        int number1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int number2 = scanner.nextInt();

        int max = Math.max(number1, number2);

        return max;
    }

    //3.Вывод оценки по шкале 1–5
    public static String gradeDiscription() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ВВедите число от 1 до 5: ");
        int number = scanner.nextInt();
        String grade;
        switch(number) {
            case 1:
                grade = "Неудовлетворительно";
                break;
            case 2:
                grade = "Неудовлетворительно";
                break;
            case 3:
                grade = "Удовлетворительно";
                break;
            case 4:
                grade = "Хорошо";
                break;
            case 5:
                grade = "Отлично";
                break;
            default:
                grade = "Нет такой оценки";
        }
        return grade;
    }

    //4. Проверка на чётность
    public static String checkParity() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ВВедите число: ");
        int number = scanner.nextInt();
        String parity = "Нечетное";
        if (number % 2 == 0) {
            parity = "Четное";
        }
        return parity;
    }

    //5. Определение размера скидки по возрасту
    public static String checkSale() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ВВедите возраст: ");
        int age = scanner.nextInt();
        String sale = "Без скидки";
        if (age <= 18 && age > 0) {
            sale = "Скидка 25%";
        }
        else if (age >= 65) {
            sale = "Скидка 30%";
        }
        else if (age <= 0) {
            sale = "Неккоректный возраст";
        }
        return sale;
    }

    //6. Оценка результата теста по баллам
    public static String evaluationByScores() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ВВедите ваши баллы (1-100): ");
        int scores = scanner.nextInt();
        String result = "Неудовлетворительно";
        if (scores >= 90 ) {
            result = "Отлично";
        }
        else if (scores >= 75 && scores <= 89) {   //2 не обязательно условие?
            result = "Хорошо";
        } else if (scores >= 60 && scores <= 74) {
            result = "Удовлетворительно";
        }
        return result;
    }
}
