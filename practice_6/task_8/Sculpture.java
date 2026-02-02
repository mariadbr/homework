package practice_6.task_8;

public class Sculpture extends Exhibit{
    @Override
    public void history() {
        System.out.print("Скульптура 1808 г");
    }

    @Override
    public void storageConditions() {
        System.out.println(", нуждается в реставрации");
    }
}
