package hw_1.ex_5;

public class BitcoinPayment implements Payable{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата Bitcoin на сумму " + amount);
    }
}
