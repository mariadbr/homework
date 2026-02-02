package practice_6.task_1;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
    }

    public void showAnimalBehavior() {
        this.animal.makeSound();
        this.animal.move();
    }
}
