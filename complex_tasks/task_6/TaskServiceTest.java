package complex_tasks.task_6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static complex_tasks.task_6.Priority.HIGH_PRIORITY;
import static complex_tasks.task_6.Priority.LOW_PRIORITY;
import static complex_tasks.task_6.Status.ACTIVE;
import static complex_tasks.task_6.Status.INACTIVE;
import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {
    private TaskService<String> taskService;

    @BeforeEach
    void setUp() {
        taskService = new TaskService<>();
    }

    /**
     * кейсы:
     *  List<Task<T>> add Task<T> (уникальный id) -> List<Task<T>>
     *  List<Task<T>> add Task<T> (не уникальный id) -> IllegalArgumentException
     */

    @Test
    public void addTaskWithUniqueIdTest() {
        Task<String> task = new Task<>("0", HIGH_PRIORITY, ACTIVE, LocalDateTime.now());
        int initialSize = taskService.getAll().size();

        taskService.addTask(task);

        assertAll(
                () -> assertTrue(taskService.getAll().contains(task)),
                () -> assertEquals(initialSize + 1, taskService.getAll().size())
        );
    }

    @Test
    public void AddTaskWithNotUniqueIdTest() {
        Task<String> task = new Task<>("1", LOW_PRIORITY, ACTIVE, LocalDateTime.now());
        Task<String> task2 = new Task<>("1", HIGH_PRIORITY, ACTIVE, LocalDateTime.now());

        taskService.addTask(task);

        assertThrows(IllegalArgumentException.class, () ->
                taskService.addTask(task2),
                "An attempt to add task with id which already exists in the list should lead to IllegalArgumentException.");

    }

    /**
     * кейсы:
     *  List<Task<T>> remove Task<T> (существующий id) -> List<>  (size 1 -> 0) и task не содержится
     *  List<Task<T>> remove Task<T> (не существующий id) -> List<Task<T>>  (size 1 -> 1)
     */

    @Test
    public void removeTaskByExistingIdTest() {
        Task<String> task = new Task<>("1", LOW_PRIORITY, ACTIVE, LocalDateTime.now());

        taskService.addTask(task);

        int initialSize = taskService.getAll().size();

        taskService.removeTaskById("1");

        assertAll(
                () -> assertEquals(initialSize - 1, taskService.getAll().size()),
                () -> assertFalse(taskService.getAll().contains(task))
        );
    }

    @Test
    public void removeTaskByNotExistingIdTest() {
        Task<String> task = new Task<>("1", LOW_PRIORITY, ACTIVE, LocalDateTime.now());

        taskService.addTask(task);

        int initialSize = taskService.getAll().size();

        taskService.removeTaskById("0");

        assertEquals(initialSize, taskService.getAll().size());
    }

   @Test
    public void filterTasksByStatusTest() {
       Task<String> task = new Task<>("1", LOW_PRIORITY, ACTIVE, LocalDateTime.now());
       Task<String> task2 = new Task<>("0", LOW_PRIORITY, INACTIVE, LocalDateTime.now());

       taskService.addTask(task);
       taskService.addTask(task2);

       List<Task<String>> actualResult = taskService.filterTasksByStatus(ACTIVE);

       assertAll(
               () -> assertEquals(1, actualResult.size()),
               () -> assertEquals(task.getStatus(), actualResult.getFirst().getStatus())
       );
   }

   @Test
    public void filterTasksByPriorityTest() {
       Task<String> task = new Task<>("1", LOW_PRIORITY, ACTIVE, LocalDateTime.now());
       Task<String> task2 = new Task<>("0", HIGH_PRIORITY, INACTIVE, LocalDateTime.now());

       taskService.addTask(task);
       taskService.addTask(task2);

       List<Task<String>> actualResult = taskService.filterTasksByPriority(HIGH_PRIORITY);

       assertAll(
               () -> assertEquals(1, actualResult.size()),
               () -> assertEquals(task2.getPriority(), actualResult.getFirst().getPriority())
       );
   }

   @Test
    public void sortTasksByDateTimeTest() {
       Task<String> task = new Task<>("1", LOW_PRIORITY, ACTIVE, LocalDateTime.of(2025, 12, 18, 12, 37));
       Task<String> task2 = new Task<>("0", HIGH_PRIORITY, INACTIVE, LocalDateTime.now());

       taskService.addTask(task);
       taskService.addTask(task2);

       List<Task<String>> actualResult = taskService.sortTasksByDateTime();

       assertAll(
               () -> assertEquals(task, actualResult.getFirst()),
               () -> assertEquals(task2, actualResult.get(1))
       );
   }
}
