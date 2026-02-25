package practice_7;

import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSetTasks {
    public static void addUniqueEl(LinkedHashSet<Integer> set, Integer element) {
        if (set.contains(element)) {
            System.out.println("This number already exists in the set");
        } else {
            set.add(element);
            System.out.println("Your number is added into the set ");
        }
    }


    public static void main(String[] args) {
        //1 Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.
        LinkedHashSet<String> linkedHashSet1 = new LinkedHashSet<>();
        linkedHashSet1.add("toy");
        linkedHashSet1.add("boy");
        linkedHashSet1.add("cloth");
        linkedHashSet1.add("dress");
        linkedHashSet1.add("impress");
        System.out.print(linkedHashSet1);

        //Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.
        LinkedHashSet<Integer> linkedHashSet2 = new LinkedHashSet<>(List.of(24,5,7,90,0));
        addUniqueEl(linkedHashSet2, 7);
        addUniqueEl(linkedHashSet2, 1);
        System.out.println(linkedHashSet2);

    }
}
