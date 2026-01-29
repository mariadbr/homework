package practice_3;

public class University {
    static String universityName = "MSLU";
    final int studentID;
    String studentName;

    University(int newStudentID, String newStudentName) {
        this.studentID = newStudentID;
        this.studentName = newStudentName;
    }

    String getStudentName() {
        return this.studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    void printStudentInfo() {
        System.out.println("Student: " + this.studentName + ", ID: " + this.studentID + ", university name: " + University.universityName);
    }
}
