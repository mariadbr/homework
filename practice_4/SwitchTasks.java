package practice_4;

import java.util.Scanner;

public class SwitchTasks {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(dayOfWeek());

        System.out.println(ticketPrice());

        System.out.println(fromNumToLetters());

        commandProcessing();

        System.out.println(calculate());
    }

    //Вывод дня недели по номеру
    public static String dayOfWeek() {

        System.out.println("Введите число от 1-7: ");
        int number = scanner.nextInt();
        String day;
        switch (number) {
            case 1:
                day = "Понедельник";
                break;
            case 2:
                day = "Вторник";
                break;
            case 3:
                day = "Среда";
                break;
            case 4:
                day = "Четверг";
                break;
            case 5:
                day = "Пятница";
                break;
            case 6:
                day = "Суббота";
                break;
            case 7:
                day = "Воскресенье";
                break;
            default:
                day = "Такого дня нет";
        }
        return day;
    }

    //Стоимость билета по дню недели
    public static String ticketPrice() {

        System.out.println("ВВедите число дня недели для определения скидки(1-7)");
        int day = scanner.nextInt();

        String price = "Ошибка, введите день недели через число(1-7)";
        if ( day >= 1 && day <=5) {
            price = "Стоимость 300 рублей";
        }
        else if (day >= 6 && day <= 7) {
            price = "Стоимость 450 рублей";
        }
        return price;
    }

    //Перевод числовых оценок в буквенные (A–F)
    public static String fromNumToLetters() {

        System.out.println("ВВедите оценку (1-100): ");
        int number = scanner.nextInt();
        String score = "Неправильный ввод, диапозон значений оценивания: от 0 до 100";
        if ( number >= 90 && number <=100) {
            score = "A";
        }
        else if (number >= 80 && number <= 89) {
            score = "B";
        }
        else if (number >= 70 && number <=79) {
            score = "C";
        }
        else if (number >= 60 && number <= 69) {
            score = "D";
        }
        else if (number <= 60 && number >=0) {
            score = "F";
        }
        return score;
    }

    //Обработка текстовых команд
    public static void commandProcessing() {

        System.out.println("ВВедите команду: \"start\", \"stop\", \"restart\" или \"status\"");
        String command = scanner.nextLine();
        switch (command) {
            case "start":
                System.out.println("Система запущена");
                break;
            case "stop":
                System.out.println("Система приостановлена");
                break;
            case "restart":
                System.out.println("Система перезапущена");
                break;
            case "status":
                System.out.println("Статус системы");
                break;
            default:
                System.out.println("Ошибка, такой комманды нет");
        }

    }

    //Простой калькулятор с использованием switch
    public static double calculate() {

        System.out.println("ВВедите первое число:");
        double first = scanner.nextDouble();
        System.out.println("ВВедите второе число:");
        double second = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("ВВедите оператор (+, -, *, /):");
        String operator = scanner.nextLine();
        double answer = 0;
        switch (operator) {
            case "+":
                answer = first + second;
                break;
            case "-":
                answer = first - second;
                break;
            case "*":
                answer = first * second;
                break;
            case "/":
                if (second == 0) {
                    System.out.println("Ошибка, деление на ноль");
                    answer = 0;
                    break;
                }
                answer = first / second;
                break;
            default:
                System.out.println("Ошибка, введите верный оператор");
        }
        return answer;
    }
}
