package practice_7;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTasks {
    public static void main(String[] args) {
        //1 Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
        TreeMap<String, Integer> treeMap1 = new TreeMap<>();
        treeMap1.put("Sam", 4);
        treeMap1.put("Alex", 5);
        treeMap1.put("Kate", 4);
        treeMap1.put("Roma", 3);
        treeMap1.put("Vera", 4);
        System.out.println(treeMap1);

        //2 Найдите минимальный и максимальный ключ в TreeMap.
        TreeMap<Integer, Character> treeMap2 = new TreeMap<>();
        treeMap2.put(5, 'B');
        treeMap2.put(-4, 'B');
        treeMap2.put(0, 'B');
        treeMap2.put(9, 'B');
        System.out.println("Max key is " + treeMap2.lastKey());
        System.out.println("Min key is " + treeMap2.firstKey());

        //3 Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.
        TreeMap<Integer, String> treeMap3 = new TreeMap<>();
        treeMap3.put(100, "Sonya");
        treeMap3.put(200, "Tom");
        treeMap3.put(50, "Arina");
        treeMap3.put(300, "Kate");
        int someKey = 150;
        Integer higherKey = treeMap3.higherKey(someKey);
        System.out.println("Higher key than " + someKey + " is " + higherKey);



    }
}
