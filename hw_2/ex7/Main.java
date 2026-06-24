package hw_2.ex7;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = List.of(new Product("bread"), new Product("milk"));

        Order order = new Order(productList, 5.0, PaymentType.CARD);

        Order flexibleOrder = new Order.Builder().setProducts(productList).setPaymentType(PaymentType.CASH).build();

        System.out.println(order);
        System.out.println(flexibleOrder);
    }
}
