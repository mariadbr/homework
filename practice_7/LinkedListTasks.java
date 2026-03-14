package practice_7;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTasks {
    public static void main(String[] args) {
        //1 Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
        LinkedList<String> linkedList1 = new LinkedList<>(List.of("sorry", "nice", "good", "bad", "cat"));
        System.out.println(linkedList1);

        //2 Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.
        LinkedList<String> linkedList2 = new LinkedList<>(List.of("to go for a walk", "to drink water", "to clean"));
        System.out.println("Task 1 is " + linkedList2.poll());
        System.out.println("Task 2 is " + linkedList2.poll());
        System.out.println("Task 3 is " + linkedList2.poll());

        //3 Создайте LinkedList, содержащий несколько строк. Напишите программу, которая печатает первый и последний элементы списка.
        LinkedList<String> linkedList3 = new LinkedList<>(List.of("call", "moment", "time", "joy"));
        System.out.println("First elment is " + linkedList3.peekFirst());
        System.out.println("Last elment is " + linkedList3.peekLast());

        //4 Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.
        LinkedList<Integer> linkedList4 = new LinkedList<>(List.of(3,10,20,5));
        int sum = 0;
        for (Integer el : linkedList4) {
            sum += el;
        }
        System.out.println("Sum is " + sum);

        //5 Используйте ListIterator для прохода по LinkedList в обоих направлениях.
        LinkedList<Integer> linkedList5 = new LinkedList<>(List.of(0,26,-5,2));
        ListIterator<Integer> iterator = linkedList5.listIterator();
        System.out.println("Forward iteration:" );
        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Backward iteration:" );
        while (iterator.hasPrevious()) {
            int element = iterator.previous();
            System.out.print(element + " ");
        }


    }
}
