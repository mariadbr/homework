package practice_6.task_3;

public class HotDish extends Dish {
    private double temperature; //градусов по Цельсию

    public HotDish(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public void showDescription() {
        System.out.println("Температура блюда: " + this.temperature + " градусов");
    }
}
