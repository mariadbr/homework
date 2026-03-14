package practice_7;

import java.util.HashMap;
import java.util.Map;

public class HashMapTasks {
    public static void main(String[] args) {
        //1 Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.put("Anna", 20);
        hashMap1.put("Roma", 23);
        hashMap1.put("Sue", 21);
        hashMap1.put("Stacy", 26);
        hashMap1.put("Sam", 24);
        for (Map.Entry<String,Integer> entry : hashMap1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //2 Проверьте, есть ли определённое имя в HashMap.
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        hashMap2.put("Anya", 20);
        hashMap2.put("Roman", 22);
        hashMap2.put("Sue", 21);
        hashMap2.put("Stacy", 22);
        hashMap2.put("Samantha", 21);
        String checkName = "Anya";
        if (hashMap2.containsKey(checkName)) {
            System.out.println(checkName + " exists in the map");
        } else {
            System.out.println("The name does not exist in the map");
        }

        //3 Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.
        HashMap<String, Integer> hashMap3 = new HashMap<>();
        hashMap3.put("Karina", 17);
        hashMap3.put("Samantha", 16);
        hashMap3.put("Lola", 19);
        hashMap3.put("Liz", 21);
        hashMap3.put("Laura", 16);
        for (Map.Entry<String,Integer> entry : hashMap3.entrySet()) {
            if ( entry.getValue() < 18) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
