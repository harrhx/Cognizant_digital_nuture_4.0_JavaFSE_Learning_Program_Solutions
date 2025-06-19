public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();
        double amount = 190.8;
        PaymentStrategy cards = new CreditCardPayment("Harshit",560.00);
        paymentContext.setPaymentContext(cards);
        paymentContext.executePayment(amount);
    }
}