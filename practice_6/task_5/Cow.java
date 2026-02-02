package practice_6.task_5;

public class Cow extends FarmAnimal{
    @Override
    public void function() {
        System.out.println("Корова даёт молоко");
    }

    @Override
    public void need() {
        System.out.println("Корова нуждается в выпасе");
    }
}
