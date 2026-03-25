package practice_9.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MainForAggregatingOp {
    public static void main(String[] args) {
        //1. Поиск максимального элемента
        List<Integer> list = Arrays.asList(12,5,36,7,1);
        Optional<Integer> max = list.stream()
                .max(Comparator.naturalOrder());
        if(max.isPresent()) {
            System.out.println(max.get());
        } else {
            System.out.println("Empty list");
        }

        //2. Поиск минимального элемента
        List<Integer> list2 = Arrays.asList(12,-5,36,-7,1);
        int min = list2.stream()
                .min(Comparator.comparingInt(x -> x))
                .orElseThrow(() -> new RuntimeException("Empty list"));
        System.out.println(min);

        //3. Сумма всех элементов списка
        List<Integer> list3 = Arrays.asList(12,5,36,7,1);
        int sum = list3.stream()
                .mapToInt(e -> e)
                .sum();
        System.out.println(sum);

        //4. Поиск первого элемента, начинающегося на "b"
        List<String> list4 = Arrays.asList("brother", "car", "tired", "box");
        String str = list4.stream()
                .filter(el -> el.startsWith("b"))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("The described element isn't found"));
        System.out.println(str);

        //5. Проверка наличия хотя бы одного элемента по условию
        List<Integer> list5 = Arrays.asList(1,2,3,4,5,6,7);
        boolean isTrue = list5.stream()
                .anyMatch(el -> el % 2 == 0);
        System.out.println(isTrue);
    }
}
