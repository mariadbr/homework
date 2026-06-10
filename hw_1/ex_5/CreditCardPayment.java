package hw_1.ex_5;

public class CreditCardPayment implements Payable{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата кредитной картой на сумму " + amount);
    }
}
