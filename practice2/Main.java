package practice2;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(2018, "Audi");

        myCar.setYear(2019);
        myCar.print();

        Rectangle myRectangle = new Rectangle(5, 6);

        myRectangle.setWidth(7);
        myRectangle.calculateArea();

        System.out.println("Площадь прямоугольника: " + myRectangle.calculateArea() + ".");

        Book myBook = new Book("Граф М К ", "Дюма");

        myBook.setAuthor("А Дюма");
        myBook.printInfo();

        BankAccount myBankAccount = new BankAccount("Анна Д", 125.5);

        myBankAccount.deposit(35.5);
        myBankAccount.withdraw(5.0);
        myBankAccount.printBalance();

        Point myPoint = new Point(5,8);

        myPoint.setX(6);
        myPoint.print();

        StudentGroup myStudentGroup = new StudentGroup("Солнышко", 19);

        myStudentGroup.setStudentCount(18);
        myStudentGroup.printInfo();

        Circle myCircle = new Circle(5);

        myCircle.setRadius(6);
        System.out.println("Площадь: " + myCircle.calculateArea() + ", длина окружности: " + myCircle.calculateCircumference() + ".");

        Teacher myTeacher = new Teacher("Татьяна Олеговна", "физкультура");

        myTeacher.setSubject("физ. культура");
        myTeacher.printInfo();

        Product myProduct = new Product("молоко", 13);

        myProduct.setPrice(14.5);
        myProduct.printInfo();
        myProduct.applyDiscount(5);
        myProduct.printInfo();

        Laptop myLaptop = new Laptop("MacBook", 1099);

        myLaptop.setPrice(1199);
        myLaptop.printInfo();
    }
}
