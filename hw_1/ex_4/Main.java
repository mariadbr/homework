package hw_1.ex_4;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService(new EmailConfirmation(), new InvoiceGenerator(), new OrderProcessor());

        orderService.completeOrder();
    }
}
