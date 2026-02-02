package practice_6.task_5;

public class Farm {
    private FarmAnimal farmAnimal;

    public void addAnimal(FarmAnimal farmAnimal) {
        this.farmAnimal = farmAnimal;
    }

    public void manageFarmAnimal() {
        this.farmAnimal.function();
        this.farmAnimal.need();
    }
}
