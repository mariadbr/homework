package practice_8.additionalTasks;

import java.util.*;

public class Main {
    //2 Обобщённый метод
    public static <T> void printList(List<T> list) {
        for(T element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    //4 Ограничение сверху
    public static <T extends Number> void sumOfElements(List<T> list) {
        double sum = 0.0;
        for (T element : list) {
            sum += element.doubleValue();
        }
        System.out.println("Результат: " + sum);
    }

    //5 Ограничение снизу
    public static <T> void addTwoNumbers(List<? super Integer> list) {
        list.add(5);
        list.add(2);
    }


    //7 Коллекция с обобщёнными типами
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K,V> el : map.entrySet() ) {
            System.out.println(el.getKey() + " " + el.getValue());
        }
    }




    public static void main(String[] args) {
        Storage<String> storageForStrings = new Storage<>();
        storageForStrings.setElement("книга");
        System.out.println(storageForStrings.getElement());

        Storage<Integer> storageForIntegers = new Storage<>();
        storageForIntegers.setElement(5);
        System.out.println(storageForIntegers.getElement());

        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
        List<String> list2 = List.of("A", "B", "C");
        printList(list);
        printList(list2);

        List<Double> doubleList =List.of(1.5,3.0,5.5);
        sumOfElements(doubleList);
        List<Integer> intList = List.of(1,2,3,4,5);
        sumOfElements(intList);

        SomeBox<String> someBox = new SomeBox<>();
        someBox.add("ручка");
        System.out.println(someBox.get());

        Map<String,Integer> someMap = new HashMap<>();
        someMap.put("ada", 7);
        someMap.put("ooo", 10);
        someMap.put("rom", 9);
        printMap(someMap);

        List<Double> listOfNumbers = List.of(25.5, 10.5, 21.5, 5.5);
        NumberBox<Double> numberBox = new NumberBox<>(listOfNumbers);
        System.out.println(numberBox.sum());

        List<Integer> numList = new ArrayList<>(List.of(1,2,3,4));
        System.out.println(numList);
        addTwoNumbers(numList);
        System.out.println(numList);

    }
}
