package practice2;

public class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void applyDiscount(double discount) {
        price = price - price * (discount/100);
    }

    void printInfo() {
        System.out.println("Продукт " + this.name + " c ценой " + this.price + " руб.");
    }
}
