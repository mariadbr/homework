package practice_10;

public class Counter {
    //4. Задача: использование synchronized
    private int count = 0;

    public synchronized void increment() {
        count++;
    };

    public int getCount() {
        return this.count;
    }
}
