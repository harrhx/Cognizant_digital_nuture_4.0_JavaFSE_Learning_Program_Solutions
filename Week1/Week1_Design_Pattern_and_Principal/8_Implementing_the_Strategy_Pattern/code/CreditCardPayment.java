public class CreditCardPayment implements PaymentStrategy{
    private String Cardname;
    private double balance;

    public CreditCardPayment(String Cardname, double balance) {
        this.Cardname = Cardname;
        this.balance = balance;
    }


    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " from credit card");
    }

}