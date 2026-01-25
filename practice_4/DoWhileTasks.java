package practice_4;

import java.util.Scanner;

public class DoWhileTasks {
    public static void main(String[] args) {
        requestPositiveNum();

        checkPassword();

        printNumbersToTen();

        endProgram();

        System.out.println(countNumbers());
    }

    //1. Запрос положительного числа
    public static void requestPositiveNum() {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.println("Введите положительное число:");
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("Вы ввели число " + number);
    }

    //2. Проверка пароля
    public static void checkPassword() {
        Scanner scanner = new Scanner(System.in);

        String password;
        do {
            System.out.println("ВВедите пароль: ");
            password = scanner.nextLine();
        } while (!password.equals("password123"));
        System.out.println("Пароль верный");
    }

    //3. Вывод чисел от 1 до 10 с использованием do-while
    public static void printNumbersToTen() {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    //4. Завершение программы по команде "exit"
    public static void endProgram() {
        Scanner scanner = new Scanner(System.in);

        String command;
        do {
            System.out.println("ВВедите команду:");
            command = scanner.nextLine();
        } while(!command.equals("exit"));
        System.out.println("Работа завершена");
    }

    //5. Подсчёт количества цифр в числе
    public static int countNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        int number = scanner.nextInt();
        int count = 0;
        do {
            if (number == 0) {
                System.out.println("В вашем числе 1 цифра");
                break;
            }
            number = number / 10;
            count++;
        } while (number != 0);
        return count;
    }
}
