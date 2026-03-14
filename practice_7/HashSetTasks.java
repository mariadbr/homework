package practice_7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTasks {
    public static Set<String> removeDuplicates(List<String> set) {
        return new HashSet<>(set);
    }

    public static void main(String[] args) {
        //1 Создайте HashSet из 5 чисел и выведите его содержимое.
        HashSet<Integer> hashSet1= new HashSet<>();
        hashSet1.add(5);
        hashSet1.add(7);
        hashSet1.add(3);
        hashSet1.add(5);
        hashSet1.add(0);
        System.out.println(hashSet1);

        //2 Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.
        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(12);
        hashSet2.add(29);
        hashSet2.add(6);
        hashSet2.add(2);
        hashSet2.add(0);
        hashSet2.add(1);
        hashSet2.add(8);
        hashSet2.add(22);
        hashSet2.add(3);
        int checkNumber = 12;
        System.out.println("If set contains " + checkNumber + ": " +  hashSet2.contains(checkNumber));

        //3 Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.
        List<String> listWithDuplicates =  new ArrayList<>(List.of("kid", "baby", "adult", "kid"));
        System.out.println("Old list: " + listWithDuplicates);
        Set<String> listWithoutDuplicates = removeDuplicates(listWithDuplicates);
        System.out.println("New list: " + listWithoutDuplicates);

        //4 Создайте HashSet, содержащий набор имен. Напишите программу, которая проверяет, содержится ли ваше имя в множестве, и выводит соответствующее сообщение.
        HashSet<String> hashSet3 = new HashSet<>();
        hashSet3.add("Tom");
        hashSet3.add("Sam");
        hashSet3.add("Rob");
        hashSet3.add("Liz");
        String checkName = "Rob";
        System.out.println("If set contains " + checkName + ": " + hashSet3.contains(checkName));
        }
    }

