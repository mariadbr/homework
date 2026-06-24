package hw_2.ex7;

import java.util.List;

class Order {
    private List<Product> products;
    private double discount;
    private PaymentType paymentType;

    public Order(List<Product> products, double discount, PaymentType paymentType) {
        this.products = products;
        this.discount = discount;
        this.paymentType = paymentType;
    }

    public Order(Builder builder) {
        this.products = builder.products;
        this.discount = builder.discount;
        this.paymentType = builder.paymentType;
    }

    @Override
    public String toString() {
        return "Order with " + products +
                " products, " + discount +
                " discount, " + paymentType +
                " paymentType";
    }

    static class Builder {
        private List<Product> products;
        private int discount;
        private PaymentType paymentType;

        public Builder setProducts(List<Product> products) {
            this.products = products;
            return this;
        }

        public Builder setDiscount(int discount) {
            this.discount = discount;
            return this;
        }

        public Builder setPaymentType(PaymentType paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
