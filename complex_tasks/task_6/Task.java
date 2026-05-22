package complex_tasks.task_6;

import java.time.LocalDateTime;

public class Task <T> {
    private final T id;
    private final Status status;
    private final Priority priority;
    private final LocalDateTime dateTime;

    public Task(T id, Priority priority, Status status, LocalDateTime dateTime) {
        this.id = id;
        this.priority = priority;
        this.status = status;
        this.dateTime = dateTime;
    }

    public T getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public Priority getPriority() {
        return priority;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
