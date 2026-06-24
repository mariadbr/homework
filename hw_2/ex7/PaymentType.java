package hw_2.ex7;

enum PaymentType {
    CARD("Card"),
    CASH("Cash");

    private String name;

    PaymentType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
