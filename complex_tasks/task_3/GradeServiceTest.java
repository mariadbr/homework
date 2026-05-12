package complex_tasks.task_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GradeServiceTest {
    protected GradeService<Double> service;

    @BeforeEach
    public void setupTest() {
        service = new GradeService<>();
    }

    /**
     * test cases:
     * List add(15) -> List [15]
     * List add(-5) -> InvalidGradeException
     */

    @Test
    public void addValidGradeTest() {
        int initialSize = service.getAll().size();

        StudentGrade<Double> grade = new StudentGrade<>("Max", "Math", 7.5);

        service.addGrade(grade);

        assertEquals(initialSize + 1, service.getAll().size());
    }

    @Test
    public void addInvalidGradeTest() {
        StudentGrade<Double> grade = new StudentGrade<>("Max", "Math", -7.5);

        assertThrows(InvalidGradeException.class, () -> service.addGrade(grade));
    }

    /**
     * кейсы:
     *  (subject присутствует) subject -> double average
     *  (subject отсутствует) subject -> IllegalArgumentException
     */

    @Test
    public void getAverageGradeTestWithExistingSubject() {
        StudentGrade<Double> grade = new StudentGrade<>("Max", "Math", 7.5);
        StudentGrade<Double> grade2 = new StudentGrade<>("Tom", "Math", 10.0);

        service.addGrade(grade);
        service.addGrade(grade2);

        double actualResult = service.getAverageGrade("Math");

        assertEquals(8.75, actualResult);
    }

    @Test
    public void getAverageGradeTestWithNoSubject() {
        service.addGrade(new StudentGrade<>("Tim", "Math", 12.7));

        assertThrows(IllegalArgumentException.class, () -> service.getAverageGrade("History"));
    }
}
