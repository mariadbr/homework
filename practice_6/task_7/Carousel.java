package practice_6.task_7;

public class Carousel extends Attraction{
    @Override
    public void info() {
        System.out.println("Спокойный аттракцион");
    }

    @Override
    public void manage() {
        System.out.println("Требует техническое обслуживание");

    }
}
