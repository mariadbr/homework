package complex_tasks.task_3;

import java.util.ArrayList;
import java.util.List;

public class GradeService <T extends Number>{
    private List<StudentGrade<T>> gradeList = new ArrayList<>();

    public synchronized void addGrade(StudentGrade<T> grade) {
        if (grade == null || grade.getGrade() == null) {
            throw new RuntimeException("Input cannot be null");
        }
       if (grade.getGrade().doubleValue() < 0) {
           throw new InvalidGradeException("Оценка не может быть отрицательной!");
        }
           gradeList.add(grade);
    }

    public double getAverageGrade(String subject) {
        double average = gradeList.stream()
                .filter(grade -> grade.getSubject().equals(subject))
                .mapToDouble(grade -> grade.getGrade().doubleValue())
                .average()
                .orElseThrow(() -> new IllegalArgumentException("Список оценок по данному предмету пуст!"));
        return average;
    }

    public List<StudentGrade<T>> getAll() {
        return List.copyOf(gradeList);
    }
}
