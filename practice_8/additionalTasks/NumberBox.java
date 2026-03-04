package practice_8.additionalTasks;

import java.util.List;

public class NumberBox <T extends Number> {
      //3 Работа с числами
    private List<T> numbers;

    public NumberBox(List<T> numbers) {
        this.numbers = numbers;
    }

    public double sum() {
        double sum = 0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }


}
