package practice_6.task_8;

public class Manuscript extends Exhibit{

    @Override
    public void history() {
        System.out.print("Манускрипт  1622 г");
    }

    @Override
    public void storageConditions() {
        System.out.println(", требует контролируемой влажности");
    }
}
