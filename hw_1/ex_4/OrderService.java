package hw_1.ex_4;

public class OrderService {
    private EmailConfirmation emailConfirmation;
    private InvoiceGenerator invoiceGenerator;
    private OrderProcessor orderProcessor;

    public OrderService(EmailConfirmation emailConfirmation, InvoiceGenerator invoiceGenerator, OrderProcessor orderProcessor) {
        this.emailConfirmation = emailConfirmation;
        this.invoiceGenerator = invoiceGenerator;
        this.orderProcessor = orderProcessor;
    }

    public void completeOrder() {
        emailConfirmation.sendEmailConfirmation();
        invoiceGenerator.generateInvoice();
        orderProcessor.processOrder();
    }
}
