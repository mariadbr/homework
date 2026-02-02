package practice_6.task_2;

public class Cat extends Pet{

    @Override
    public void feed() {
        System.out.println("Кот ест влажный корм");
    }

    @Override
    public void interact() {
        System.out.println("Кот играет");
    }
}
