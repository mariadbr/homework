package practice_9.func_int_and_lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        MathOperations add = (a,b) -> a + b;
        MathOperations subtract = (a,b) -> a - b;
        MathOperations multiply = (int a, int b) -> a * b;
        MathOperations divide = (int a, int b) -> {
            if (b == 0) {
                throw new ArithmeticException("Ошибка! деление на ноль!");
            }
            return (double) a / b;
        };

        System.out.println(add.operate(1,2));
        System.out.println(subtract.operate(10,5));
        System.out.println(multiply.operate(5,7));
        try {
            System.out.println(divide.operate(5,0));
        } catch (ArithmeticException e) {
            System.out.println("Словлено: " + e.getMessage());
        }
        System.out.println(divide.operate(5,7));

        //2. Использование анонимного класса
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        r1.run();

        //3. Лямбда-выражение с Predicate
        Predicate<Integer> isEven = a -> a % 2 == 0;
        System.out.println("Является ли число четным: " + isEven.test(10));
        System.out.println("Является ли число четным: " + isEven.test(1));

        //4. Лямбда-выражение с Function
        Function<String,Integer> getLength = String::length;
        System.out.println("Длина: " + getLength.apply("привет"));

        //5. Использование Consumer
        Consumer<String> print = System.out::println;
        print.accept("Привет мир!");
    }
}
