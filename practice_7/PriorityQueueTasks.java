package practice_7;

import java.util.PriorityQueue;

public class PriorityQueueTasks {
    public static void main(String[] args) {
        //1 Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>();
        priorityQueue1.offer(5);
        priorityQueue1.offer(18);
        priorityQueue1.offer(26);
        priorityQueue1.offer(11);
        priorityQueue1.offer(0);
        while (!priorityQueue1.isEmpty()) {
            System.out.println(priorityQueue1.poll());
        }
    }
}
