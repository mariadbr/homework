package practice_6.task_1;

public class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Птичка чирикает");
    }

    @Override
    public void move() {
        System.out.println("Птичка летит");
    }
}
