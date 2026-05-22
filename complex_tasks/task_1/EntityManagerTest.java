package complex_tasks.task_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTest {
    protected EntityManager<Student> entityManager;

    @BeforeEach
    public void setupTest() {
        entityManager = new EntityManager<>();
    }

    @Test
    public void addEntityTest() {
        int initialSize = entityManager.getAll().size();

        Student expectedStudent = new Student(17, "Коля", true);

        entityManager.add(expectedStudent);

        assertAll(
                () -> assertTrue(entityManager.getAll().contains(expectedStudent)),
                () -> assertEquals(initialSize + 1, entityManager.getAll().size()));
    }

    @Test
    public void removeEntityTest() {
        Student student = new Student(17, "Коля", true);
        entityManager.add(student);
        int initialSize = entityManager.getAll().size();

        assertTrue(entityManager.remove(student));
        assertEquals(initialSize - 1, entityManager.getAll().size());
    }

    @Test
    public void getAllTest() {
        int initialSize = entityManager.getAll().size();

        Student student = new Student(17, "Коля", true);

        entityManager.add(student);

        int actualResult = entityManager.getAll().size();

        assertEquals(initialSize + 1, actualResult);
    }

    @Test
    public void filterByAgeTest() {
        Student student = new Student(17, "Коля", true);
        Student student2 = new Student(25, "Аня", true);

        entityManager.add(student);
        entityManager.add(student2);

        List<Student> actualResult = entityManager.filterByAge(16, 20);

        assertAll(
                () -> assertEquals(1, actualResult.size()),
                () -> assertEquals(student.getAge(), actualResult.getFirst().getAge())
        );
    }

    @Test
    public void filterByNameTest() {
        Student student = new Student(17, "Коля", true);
        Student student2 = new Student(25, "Аня", true);

        entityManager.add(student);
        entityManager.add(student2);

        List<Student> actualResult = entityManager.filterByName("Аня");

        assertAll(
                () -> assertEquals(1, actualResult.size()),
                () -> assertEquals(student2.getName(), actualResult.getFirst().getName())
        );
    }

    @Test
    public void filterByActivityTest() {
        Student student = new Student(17, "Коля", true);
        Student student2 = new Student(25, "Аня", false);

        entityManager.add(student);
        entityManager.add(student2);

        List<Student> actualResult = entityManager.filterByActivity(true);

        assertAll(
                () -> assertEquals(1, actualResult.size()),
                () -> assertEquals(student.isActive(), actualResult.getFirst().isActive())
        );
    }
}
