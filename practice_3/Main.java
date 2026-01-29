package practice_3;

public class Main {
    public static void main(String[] args) {
        Company person1 = new Company(2325, "Anna");
        Company person2 = new Company(2327, "Vladislav");

        Company.printCompanyName();
        Company.companyName = "ОАО Техник";
        Company.printCompanyName();

        // person1.employeeID = 2324;   невозможно изменить

        System.out.println("Площадь круга " + MathConstants.calculateCircleArea(5));
        System.out.println("Длина окружности " + MathConstants.calculateCircumference(6));

        University andrew = new University(123, "Andrew");
        andrew.printStudentInfo();
        University dasha = new University(145, "Dasha");
        dasha.printStudentInfo();
        University lena = new University(114, "Lena");
        lena.printStudentInfo();

        University.universityName = "MSU";
        andrew.printStudentInfo();
        dasha.printStudentInfo();

        lena.printStudentInfo();

        Person ivan = new Person("Иван", "Иванов", "123-45-6789");
        ivan.printPersonInfo();
        Person anna = new Person("Анна", "Иванова", "124-45-6789");
        anna.printPersonInfo();

        anna.setFirstName("Елизавета");
        anna.printPersonInfo();

        GameSettings game1 = new GameSettings("Cooking mama", 10);
        game1.printGameStatus();
        GameSettings game2 = new GameSettings("Cooking mama 2 ", 11);
        game2.printGameStatus();

        GameSettings.setMaxPlayers(12);
        game1.addPlayer();
        game1.printGameStatus();

        game2.addPlayer();
        game2.addPlayer();          // достигнут лимит, остнется 12 игроков (максимум)
        game2.printGameStatus();
    }
}
