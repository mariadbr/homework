package hw_1.ex_5;

public class PayPalPayment implements Payable{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount);
    }
}
