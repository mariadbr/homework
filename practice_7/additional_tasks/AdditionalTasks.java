package practice_7.additional_tasks;

import java.util.*;

public class AdditionalTasks {
    private static int totalCount = 0;

    public static void addVisit(HashSet<String> set, String url) {
       set.add(url);
       totalCount++;
    }


    public static boolean ifContainsId(HashMap<Integer,String> map) {
        int idToCheck = 24-26;
        if(map.containsKey(idToCheck)) {
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        //1 Проверить, есть ли пользователь с заданным ID.
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(15-29, "Anna");
        hashMap1.put(24-26, "Kate");
        hashMap1.put(17-39, "Lola");
        System.out.println("If map contains the key: " + ifContainsId(hashMap1));

        //2 Хранить задачи в порядке поступления и обрабатывать по очереди.
        PriorityQueue<String> priorityQueue1 = new PriorityQueue<>();
        priorityQueue1.offer("Task 1");
        priorityQueue1.offer("Task 2");
        priorityQueue1.offer("Task 3");
        while (!priorityQueue1.isEmpty()) {
            System.out.println(priorityQueue1.poll());
        }

        //4 Учёт посещений страниц
        HashSet<String> myHashSet = new HashSet<>();
        addVisit(myHashSet, "1234-1234");
        addVisit(myHashSet, "1234-1234");
        addVisit(myHashSet, "1235-1234");
        addVisit(myHashSet, "1235-1234");
        addVisit(myHashSet, "1235-1234");
        addVisit(myHashSet, "1235-1234");
        addVisit(myHashSet, "1235-1231");
        System.out.println("Total sessions: " + totalCount);
        System.out.println("Unique sessions: " + myHashSet.size());

        //3 Хранение ключей и значений (настройки приложения)
        HashMap<String,String> myHashMap = new HashMap<>();
        myHashMap.put("Anna", "12-34");
        myHashMap.put("Roma", "13-34");
        myHashMap.put("Kate", "22-35");
        myHashMap.put("Liza", "22-56");
        String keyToCheck = "Roma";
        System.out.println("If the map contains the key: "  + myHashMap.containsKey(keyToCheck));
        System.out.println(keyToCheck + "'s value: " + myHashMap.get(keyToCheck));

        //6 Структура телефонной книги
        HashMap<String,String> contacts = new HashMap<>();
        contacts.put("Lily", "324-25-275");
        contacts.put("Rita", "324-25-275");
        contacts.put("Inna", "324-25-275");
        contacts.put("Stacy", "324-25-275");
        String someKey = "Lily";
        System.out.println("If the map contains the key: " + contacts.containsKey(someKey));
        System.out.println(someKey + "'s value: " + contacts.get(someKey));

        //8 Уникальные слова в тексте
        String toCheck = "A win is a win";
        String[] str = toCheck.split(" ");
        HashSet<String> hs = new HashSet<>();
        for(String st : str) {
            hs.add(st.toLowerCase());
        }
        System.out.println(hs);
        System.out.println(hs.size());
    }



}
