package practice_9.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainForBasicOp {
    public static void main(String[] args) {
        //1. Фильтрация строк по длине больше 5
        List<String> list1 = Arrays.asList("hi", "hello", "capable", "exhausted");  
        list1 = list1.stream()
                .filter(str -> str.length() > 5)
                .collect(Collectors.toList());
        System.out.println(list1);

        //2. Фильтрация чисел, кратных 5
        List<Integer> list2 = Arrays.asList(2,5,10,12,11,20);
        list2 = list2.stream()
                .filter(el -> el % 5 == 0)
                .collect(Collectors.toList());
        System.out.println(list2);

        //3. Преобразование строк в их длины
        List<String> list3 = Arrays.asList("hi", "hello", "capable", "exhausted");
        List<Integer> list4;
        list4 = list3.stream()
                .map(str -> str.length())
                .collect(Collectors.toList());
        System.out.println(list4);

        //4. Создание списка квадратов чисел
        List<Integer> list5 = Arrays.asList(2,5,10,12,11,20);
        List<Integer> list6 = list5.stream()
                .map(el -> el * el)
                .collect(Collectors.toList());
        System.out.println(list6);

        //5. Удаление дубликатов из списка
        List<Integer> list7 = Arrays.asList(2,11,10,20,11,20);
        list7 = list7.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list7);
    }
}
