package practice_4;

import java.util.Scanner;

public class ForTasks {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        numbersDivided();

        System.out.println(sumOfNum());

        multiplyTable();

        System.out.println(checkIfPrime());

        printOfNumbers();
    }

    //1. Вывод чисел от 1 до 100, делящихся на 3
    public static void numbersDivided() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    //2. Сумма чисел от 1 до n
    public static int sumOfNum() {

        System.out.println("ВВедите число: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    //3. Таблица умножения для числа
    public static void multiplyTable() {

        System.out.println("ВВедите число: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + i * n);
        }
    }

    //4. Проверка на простое число
    public static boolean checkIfPrime() {

        System.out.println("ВВедите число: ");
        int n = scanner.nextInt();
        boolean isPrime = true;
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    //5. Вывод чисел от 1 до 10
    public static void printOfNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
