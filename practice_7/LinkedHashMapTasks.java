package practice_7;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTasks {
    public static void addNoMoreThan10 (LinkedHashMap<String,String> map, String key, String value) {
        if (map.size() >= 10) {
            Map.Entry<String,String> removedEntry = map.pollFirstEntry();
            map.put(key, value);
            System.out.println(removedEntry.getKey() + " " + removedEntry.getValue() + " is removed, added a new contact in its place: " + key + " " + value);
        } else {
            map.put(key, value);
            System.out.println("You added a new contact");
        }
    }

    public static void main(String[] args) {
        //1 Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
        LinkedHashMap<String, Integer> linkedHashMap1 = new LinkedHashMap<>();
        linkedHashMap1.put("Karina", 20);
        linkedHashMap1.put("Darya", 29);
        linkedHashMap1.put("Maria", 26);
        linkedHashMap1.put("Tatsiana", 20);
        linkedHashMap1.put("Galina", 25);
        for (Map.Entry<String,Integer> entry : linkedHashMap1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //2 Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.
        LinkedHashMap<String,String> linkedHashMap2 = new LinkedHashMap<>();
        linkedHashMap2.put("Katya", "234-267");
        linkedHashMap2.put("Artem", "134-267");
        linkedHashMap2.put("Sam", "234-266");
        linkedHashMap2.put("Stas", "364-297");
        String someName = "Sam";
        String contact = linkedHashMap2.get(someName);
        if (linkedHashMap2.containsKey(someName)) {
            System.out.println("Found contact: " + someName + " " + contact);
        }

        //3 Создайте LinkedHashMap, который хранит историю просмотров пользователя (максимум 10 элементов).
        LinkedHashMap<String,String> linkedHashMap3 = new LinkedHashMap<>();
        linkedHashMap3.put("12-23", "Sam");
        linkedHashMap3.put("11-22", "Sonya");
        linkedHashMap3.put("13-23", "Rose");
        linkedHashMap3.put("14-43", "Lola");
        linkedHashMap3.put("15-73", "Sily");
        linkedHashMap3.put("16-63", "Lily");
        linkedHashMap3.put("17-13", "Kate");
        linkedHashMap3.put("18-13", "Anna");
        linkedHashMap3.put("19-03", "Marina");
        linkedHashMap3.put("21-03", "Irina");
        System.out.println(linkedHashMap3);
        addNoMoreThan10(linkedHashMap3, "22-22", "Kari");
        System.out.println(linkedHashMap3);
    }
}
