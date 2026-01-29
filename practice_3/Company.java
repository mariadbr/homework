package practice_3;

public class Company {
    static String companyName = "ОАО Техним";
    final int employeeID;
    String employeeName;

    Company(int employeeID, String  employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    String getEmployeeName() {
        return employeeName;
    }

    void setEmployeeName(String newEmployeeName) {
        this.employeeName = newEmployeeName;
    }

    static void printCompanyName() {
        System.out.println("Название компании: " + Company.companyName);
    }
}
