public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void  setPaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        if(paymentStrategy==null){
            System.out.println("Payment Strategy is NULL");
            return;
        }
        paymentStrategy.pay(amount);
    }
}