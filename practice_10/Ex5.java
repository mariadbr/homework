package practice_10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex5 {
    //5. Реализация пула потоков для обработки задач
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        ImplRunnable implemRunnable = new ImplRunnable();
        for (int i = 0; i < 10; i++) {
            executorService.execute(implemRunnable);
        }
        executorService.shutdown();
    }
}


class ImplRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " начал выполнение теста");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " завершил выполнение теста");
    }
}
