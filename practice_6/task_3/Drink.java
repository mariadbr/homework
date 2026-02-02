package practice_6.task_3;

public class Drink extends Dish {
    private int volume; //мл.

    public Drink(int volume) {
        this.volume = volume;
    }

    @Override
    public void showDescription() {
        System.out.println("Объем напитка: " + this.volume + " мл");
    }
}
