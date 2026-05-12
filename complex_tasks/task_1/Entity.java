package complex_tasks.task_1;

public abstract class Entity {
    private int age;
    private String name;
    private boolean isActive;

    public Entity(int age, String name, boolean isActive) {
        this.age = age;
        this.name = name;
        this.isActive = isActive;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
