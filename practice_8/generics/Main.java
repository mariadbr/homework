package practice_8.generics;

public class Main {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Box<Integer> boxWithIntegers = new Box<>();
        boxWithIntegers.setElement(1);
        System.out.println(boxWithIntegers.getElement());

        Box<String> boxWithStrings = new Box<>();
        boxWithStrings.setElement("Игрушка");
        System.out.println(boxWithStrings.getElement());

        String[] stringArray = {"hi", "hello", "bye"};
        printArray(stringArray);
        Integer[] integerArray = {1,2,3,4,5};
        printArray(integerArray);

        Pair<String,Integer> pair = new Pair<>();
        pair.setFirst("Ручка");
        pair.setSecond(1);
        System.out.println("Первый элемент: " + pair.getFirst());
        System.out.println("Второй элемент: " + pair.getSecond());
     }
}
