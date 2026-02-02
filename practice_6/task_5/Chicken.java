package practice_6.task_5;

public class Chicken extends FarmAnimal{
    @Override
    public void function() {
        System.out.println("Курица несёт яйца");
    }

    @Override
    public void need() {
        System.out.println("Курица требует зерно");
    }
}
