package practice_6.task_6;

public class BotanicGarden {
    private Plant plant;

    public void addPlant(Plant plant) {
        this.plant = plant;
    }

    public void plantCare() {
        this.plant.require();
    }
}
