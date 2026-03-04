package practice_8.additionalTasks;

public class SomeBox <T> implements Container <T>{
    private T element;

    @Override
    public void add(T element) {
        this.element = element;
    }

    @Override
    public T get() {
        return this.element;
    }
}
