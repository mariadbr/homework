package practice2;

public class Laptop {
    String brand;
    int price;

    Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    String getBrand() {
        return this.brand;
    }

    int getPrice() {
        return this.price;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    void setPrice(int price) {
        this.price = price;
    }

    void printInfo() {
        System.out.println("Цена ноутбука " + this.brand + " - " + this.price + " usd.");
    }
}
