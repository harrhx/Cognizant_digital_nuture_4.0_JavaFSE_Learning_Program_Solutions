public class PaypalAdapter implements PaymentProcessor{
    private PaypalGateway paypalGateway;


    public PaypalAdapter(PaypalGateway paypalGateway) {
        this.paypalGateway = paypalGateway;
    }

    public void processPayment(double amount) {
        paypalGateway.makePayment(amount);
    }
}