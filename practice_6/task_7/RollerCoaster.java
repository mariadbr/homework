package practice_6.task_7;

public class RollerCoaster extends Attraction{

    @Override
    public void info() {
        System.out.println("Быстрые горки");
    }

    @Override
    public void manage() {
        System.out.println("Требуют проверки безопасности");
    }
}
