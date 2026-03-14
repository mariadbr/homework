package practice_7;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTasks {
    public static void main(String[] args) {
        //1 Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println(arrayList1);
        arrayList1.add(8);
        System.out.println(arrayList1);

        //2 Напишите программу, которая выводит все чётные числа из ArrayList.
        ArrayList<Integer> arrayList2 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        for (Integer el : arrayList2) {
            if (el % 2 == 0) {
                System.out.print(el + " ");
            }
        }
        System.out.println();

        //3 Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
        ArrayList<String> arrayList3 = new ArrayList<>(List.of("hi", "hello", "excllent", "yes"));
        String longest = "";
        for (String str : arrayList3) {
            if (longest.length() < str.length()) {
                longest = str;
            }
        }
        System.out.println("The longest is " + longest);

        //4 Создайте ArrayList из целых чисел. Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.
        ArrayList<Integer> arrayList4 = new ArrayList<>(List.of(25,10,5,30,10));
        int sum = 0;
        for (Integer el : arrayList4) {
            sum += el;
        }
        System.out.println("The sum is " + sum);

        //5 Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит максимальное число из списка.
        ArrayList<Integer> arrayList5 = new ArrayList<>(List.of(-5,0,13,-20,10));
        int max = arrayList5.getFirst();
        for (Integer el :arrayList5) {
            if (max < el) {
                max = el;
            }
        }
        System.out.println("The max number is " + max);
    }
}
