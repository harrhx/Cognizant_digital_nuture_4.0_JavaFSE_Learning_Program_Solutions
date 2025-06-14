public class AdapterPatternExample {

    public static void main(String[] args) {
        System.out.println("--- Adapter Pattern Example ---");

        // Create instances of the third-party gateways (Adaptees)
        PaypalGateway payPalGateway = new PaypalGateway();
        PaymentProcessor payPalAdapter = new PaypalAdapter(payPalGateway);

        PaytmGateway paytmgateway = new PaytmGateway();
        PaymentProcessor paytmadapter =new PaytmAdapter(paytmgateway);

        // Use the adapters to process payments through the common interface
        System.out.println("\nUsing PayPal Adapter:");
        payPalAdapter.processPayment(150.75);

        System.out.println("\nUsing PayTmAdapter:");
        paytmadapter.processPayment(45.90);

    }
}