package complex_tasks.task_4;

public class Rating<T extends Number> {
    private final T rating;

    public Rating(T rating) {
        this.rating = rating;
    }

    public T getRating() {
        return rating;
    }
}
