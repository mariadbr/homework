package complex_tasks.task_6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService <T> {
    private final List<Task<T>> taskList = new ArrayList<>();

    public void addTask(Task<T> task) {
        if ( taskList.stream().anyMatch(el -> el.getId().equals(task.getId())) ) {
            throw new IllegalArgumentException("Задача с таким id уже существует!");
        }
        taskList.add(task);
    }

    public synchronized void removeTaskById(T id) {
        boolean isRemoved = taskList.removeIf(el -> el.getId().equals(id));
        if (isRemoved) {
            System.out.println("Задача была удалена.");
        } else {
            System.out.println("Задача не была удалена.");
        }
    }

    public List<Task<T>> filterTasksByStatus(Status status) {
        return taskList
                .stream()
                .filter(el -> el.getStatus() == status)
                .collect(Collectors.toList());
    }

    public List<Task<T>> filterTasksByPriority(Priority priority) {
        return taskList
                .stream()
                .filter(el -> el.getPriority() == priority)
                .collect(Collectors.toList());
    }

    public List<Task<T>> sortTasksByDateTime() {
        return taskList
                .stream()
                .sorted(Comparator.comparing(Task::getDateTime))
                .collect(Collectors.toList());
    }

    public List<Task<T>> getAll() {
        return List.copyOf(taskList);
    }
}




