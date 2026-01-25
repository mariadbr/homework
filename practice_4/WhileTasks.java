package practice_4;

import java.util.Scanner;

public class WhileTasks {
    public static void main(String[] args) {
        System.out.println(calculateFactorial());

        printEvenNumbers();

        countDown();
    }

    //1. Вычисление факториала с помощью while
    public static int calculateFactorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ВВедите число: ");
        int n = scanner.nextInt();
        int i = 1;
        int result = 1;
        while (i <= n) {
            result = result * i;
            i++;
        }
        return result;
    }

    //2. Вывод всех чётных чисел до заданного
    public static void printEvenNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        int i = 1;
        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    //3. Обратный отсчёт от введённого числа до 1
    public static void countDown() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ВВедите число:");
        int number = scanner.nextInt();
        int i = 1;
        while(i <= number) {
            System.out.println(number);
            number--;
        }
    }
}