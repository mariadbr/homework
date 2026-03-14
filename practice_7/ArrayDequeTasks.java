package practice_7;

import java.util.ArrayDeque;

public class ArrayDequeTasks {
    public static void main(String[] args) {
        //1 Создайте ArrayDeque, добавьте 5 элементов и выведите их.
        ArrayDeque<Integer> arrayDeque1 = new ArrayDeque<>();
        arrayDeque1.add(98);
        arrayDeque1.add(0);
        arrayDeque1.add(-27);
        arrayDeque1.add(14);
        arrayDeque1.add(9);
        for (Integer el : arrayDeque1) {
            System.out.print(el + " ");
        }
        System.out.println();

        //2 Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.
        ArrayDeque<Integer> arrayDeque2 = new ArrayDeque<>();
        arrayDeque2.push(5);
        arrayDeque2.push(6);
        arrayDeque2.push(9);
        arrayDeque2.push(0);
       while (!arrayDeque2.isEmpty()) {
           System.out.print(arrayDeque2.pop() + " ");
       }
        System.out.println();

       //3 Используйте ArrayDeque как очередь: добавьте элементы в начало и конец, извлеките из обоих концов.
        ArrayDeque<Integer> arrayDeque3 = new ArrayDeque<>();
        arrayDeque3.addFirst(4);
        arrayDeque3.addFirst(19);
        arrayDeque3.addLast(98);
        arrayDeque3.addLast(0);
        System.out.println(arrayDeque3);
        arrayDeque3.removeLast();
        arrayDeque3.removeFirst();
        System.out.println(arrayDeque3);
    }
}
