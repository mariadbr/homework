package practice_10;

public class Ex3 implements Runnable{
    //3. Задача: использование volatile
    private static volatile boolean stop = false;

    @Override
    public void run() {
        long count = 0;
        while (!stop) {
            count++;
        }
        System.out.println("Цикл завершен. Значение count: " + count);
    }

    public static void main(String[] args) throws InterruptedException {
        Ex3 ex3 = new Ex3();
        Thread thread = new Thread(ex3);
        thread.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        stop = true;
        thread.join();
        System.out.println("Программа завершена.");
    }
}
