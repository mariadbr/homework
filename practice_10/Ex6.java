package practice_10;

import java.util.concurrent.atomic.AtomicInteger;

public class Ex6 {
    private static final int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
    static AtomicInteger count = new AtomicInteger(0);
    static AtomicInteger sum = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        parallelSum(array);
        System.out.println("Количество обработанных элементов: " + count + " , их сумма: " + sum);
    }

    public static void parallelSum(int[] array) throws InterruptedException {
        int firstEnd = 2;
        int secondEnd = 5;

        MyRunnable first = new MyRunnable(array, 0, firstEnd);
        MyRunnable second = new MyRunnable(array, firstEnd, secondEnd);
        MyRunnable third = new MyRunnable(array, secondEnd, array.length);

        Thread t1 = new Thread(first);
        Thread t2 = new Thread(second);
        Thread t3 = new Thread(third);

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
    }
}

class MyRunnable implements Runnable {
    private final int[] array;
    private final int start;
    private final int end;

    public MyRunnable(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            System.out.println("Значение элемента: " + array[i] + " , индекс элемента: " + i);
            Ex6.sum.addAndGet(array[i]);
            Ex6.count.incrementAndGet();
        }
    }
}