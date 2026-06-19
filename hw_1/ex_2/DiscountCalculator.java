package hw_1.ex_2;

public class DiscountCalculator {
    public static final double DISCOUNT_PERCENTAGE_LOYAL_CUSTOMER_FIRST_PURCHASE = 0.10;
    public static final double DISCOUNT_PERCENTAGE_LOYAL_CUSTOMER_NOT_FIRST_PURCHASE = 0.05;
    public static final double DISCOUNT_PERCENTAGE_NOT_LOYAL_CUSTOMER_HAS_COUPON = 0.07;
    public static final double DISCOUNT_PERCENTAGE_NOT_LOYAL_CUSTOMER_HAS_NOT_COUPON = 0.02;

    public double calculateFinalPrice(Customer customer, double price) {
        double finalDiscountPercentage = customer.isLoyalCustomer()?
                getDiscountPercentageForLoyalCustomer(customer) : getDiscountPercentageForNotLoyalCustomer(customer);

        double sumOfDiscount = price * finalDiscountPercentage;

        return price - sumOfDiscount;
    }

    public double getDiscountPercentageForLoyalCustomer(Customer customer) {
        return customer.isFirstPurchase()?
                DISCOUNT_PERCENTAGE_LOYAL_CUSTOMER_FIRST_PURCHASE : DISCOUNT_PERCENTAGE_LOYAL_CUSTOMER_NOT_FIRST_PURCHASE;
    }

    public double getDiscountPercentageForNotLoyalCustomer(Customer customer) {
        return customer.isCouponApplied()?
                DISCOUNT_PERCENTAGE_NOT_LOYAL_CUSTOMER_HAS_COUPON : DISCOUNT_PERCENTAGE_NOT_LOYAL_CUSTOMER_HAS_NOT_COUPON;
    }
}
