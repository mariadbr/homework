package hw_1.ex_5;

public class PaymentProcessor {
    public void processPayment(Payable payable, double amount) {
        payable.pay(amount);
    }
}
