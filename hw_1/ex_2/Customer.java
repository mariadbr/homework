package hw_1.ex_2;

public class Customer {
    private boolean isLoyalCustomer;
    private boolean isFirstPurchase;
    private boolean hasCoupon;

    public Customer(boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {
        this.isLoyalCustomer = isLoyalCustomer;
        this.isFirstPurchase = isFirstPurchase;
        this.hasCoupon = hasCoupon;
    }

    public boolean isLoyalCustomer() {
        return isLoyalCustomer;
    }

    public boolean isCouponApplied() {
        return hasCoupon;
    }

    public boolean isFirstPurchase() {
        return isFirstPurchase;
    }
}
