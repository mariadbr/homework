package hw_2.ex5;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory furnitureFactory;
        String furnitureType = "Modern";

        if (furnitureType.equals("Modern")) {
            furnitureFactory = new ModernFurnitureFactory();
        } else if (furnitureType.equals("Classic")) {
            furnitureFactory = new ClassicFurnitureFactory();
        } else {
            throw new IllegalArgumentException("No such furniture type");
        }

        furnitureFactory.createChair().chooseChair();
        furnitureFactory.createTable().chooseTable();
    }
}
