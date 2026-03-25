package practice_9.streamapi;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainForGrouppingOp {
    public static void main(String[] args) {
        //1. Группировка строк по первой букве
        List<String> list = Arrays.asList("car", "bean", "cat", "well");
        Map<String,List<String>> hm = list.stream()
                .collect(Collectors.groupingBy(str -> str.substring(0,1), Collectors.toList()));
        System.out.println(hm);

        //2. Группировка чисел по чётности
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6);
        Map<Boolean,List<Integer>> hm2 =list2.stream()
                .collect(Collectors.groupingBy((el -> el % 2 == 0), Collectors.toList()));
        System.out.println(hm2);

        //3. Поиск среднего значения чисел
        List<Integer> list3 = Arrays.asList(1,2,3,4,5,6);
        double average = list3.stream()
                .collect(Collectors.averagingInt(n -> n));
        System.out.println(average);

    }
}
