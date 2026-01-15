package package1;

public class HelloWorld {

    static int a = 1;

    public static void main(String[] args) {
        System.out.println("Привет мир!");
        System.out.println("Это Маша!");
        System.out.println(1 + 2);
        System.out.println(3 * 2);
        System.out.println("В поле хранится : " + a);

        int sum1 = sum(3, 4);
        System.out.println("Результат сложения: " + sum1);

        int mult1 = multiply(3, 6);
        System.out.println("Результат умножения: " + mult1);

        int sub1 = substract(13, 7);
        System.out.println("Результат вычитания: " + sub1);

        double dev1 = devide(13, 2);
        System.out.println("Результат деления: " + dev1);

    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int multiply(int r, int s) {
        return r * s;
    }

    public static int substract(int s, int b) {
        return s - b;
    }

    public static double devide(int d, int m) {
        return (double) d / m;
    }


}
