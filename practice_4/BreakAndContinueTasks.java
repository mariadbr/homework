package practice_4;

import java.util.Scanner;

public class BreakAndContinueTasks {
    public static void main(String[] args) {
        System.out.println(sumOfNumbers());

        skipNumbers();

        printOnlyPositiveNumbers();

        commandBeforeStop();
    }

    //1. Сумма чисел до первого отрицательного (использовать break)
    public static int sumOfNumbers() {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
        while(true) {
            System.out.println("ВВедите число: ");
            number = scanner.nextInt();
            if (number < 0) {
                break;
            }
            sum = sum + number;
        }
        return sum;
    }

    //2. Пропуск чисел, делящихся на 3 (использовать continue)
    public static void skipNumbers() {
        for(int i = 1; i <= 20; i++) {
            if(i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    //3. Вывод только положительных чисел (использовать continue)
    public static void printOnlyPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);

        int number;
        int max = 2147483647;
        do {
            System.out.println("Введите число: ");
            number = scanner.nextInt();
            if (number < 0) {
                continue;
            }
            System.out.println(number);
        } while(number < max);
    }

    //4. Ввод строк до команды "stop" (использовать break)
    public static void commandBeforeStop() {
        Scanner scanner = new Scanner(System.in);

        String command;
        while(true) {
            System.out.println("ВВедите команду:");
            command = scanner.nextLine();
            if(command.equals("stop")) {
                break;
            }
        }
        System.out.println("Программа завершена");
    }

}
