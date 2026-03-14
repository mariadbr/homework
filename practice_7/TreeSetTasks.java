package practice_7;

import java.util.TreeSet;

public class TreeSetTasks {
    public static void addUniqueNumber(TreeSet<Integer> set, Integer number) {
        if (set.contains(number)) {
            System.out.println("The number already exists in the set");
        } else {
            set.add(number);
            System.out.println("You added a new number " + number);
        }
    }

    public static void main(String[] args) {
        //1 Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        treeSet1.add(4);
        treeSet1.add(-1);
        treeSet1.add(11);
        treeSet1.add(100);
        treeSet1.add(-2);
        System.out.println(treeSet1);

        //2 Напишите метод, который добавляет числа в TreeSet, но не позволяет добавить дубликаты.
        TreeSet<Integer> treeSet2 = new TreeSet<>();
        addUniqueNumber(treeSet2, 5);
        addUniqueNumber(treeSet2, 26);
        addUniqueNumber(treeSet2, 0);
        addUniqueNumber(treeSet2, 5);
        System.out.println(treeSet2);

        //3 Найдите ближайшее большее и меньшее число к заданному в TreeSet.
        TreeSet<Integer> treeSet3 = new TreeSet<>();
        treeSet3.add(-3);
        treeSet3.add(0);
        treeSet3.add(25);
        treeSet3.add(12);
        treeSet3.add(-10);
        int someNumber = 11;
        System.out.println("The greater number to " + someNumber + " in the set is " + treeSet3.higher(someNumber));
        System.out.println("The smaller number to " + someNumber + " in the set is " + treeSet3.lower(someNumber));


    }
}
