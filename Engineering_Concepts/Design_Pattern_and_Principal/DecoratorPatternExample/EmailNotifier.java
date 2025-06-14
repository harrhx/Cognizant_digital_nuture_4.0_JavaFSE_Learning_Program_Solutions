// File: Notifier.java
// ---
// This is the "Component" interface. It defines the contract for the objects
// that can have responsibilities added to them dynamically.
public interface Notifier {
    void send(String message);
}


// File: EmailNotifier.java
// ---
// This is the "Concrete Component" class. It is the basic object that we
// will decorate with additional functionalities.
public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending Email with message: " + message);
    }
}


// File: NotifierDecorator.java
// ---
// This is the abstract "Decorator" class. It implements the component interface
// and holds a reference to a Notifier object. Its purpose is to be subclassed
// by concrete decorators.
public abstract class NotifierDecorator implements Notifier {
    protected Notifier wrappedNotifier;

    public NotifierDecorator(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }

    @Override
    public void send(String message) {
        wrappedNotifier.send(message);
    }
}


// File: SMSNotifierDecorator.java
// ---
// This is a "Concrete Decorator". It adds SMS notification functionality.
public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // First, call the original send method
        sendSMS(message);    // Then, add the new functionality
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}


// File: SlackNotifierDecorator.java
// ---
// This is another "Concrete Decorator". It adds Slack notification functionality.
public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // First, call the original send method
        sendSlack(message);  // Then, add the new functionality
    }

    private void sendSlack(String message) {
        System.out.println("Sending Slack message: " + message);
    }
}


// File: DecoratorPatternExample.java
// ---
// This is the main test class. It demonstrates how to wrap a basic notifier
// with multiple decorator layers to add functionality dynamically.
public class DecoratorPatternExample {

    public static void main(String[] args) {
        System.out.println("--- Decorator Pattern Example ---");

        // Start with a simple email notifier
        Notifier notifier = new EmailNotifier();

        System.out.println("\n--- Sending with Email and SMS ---");
        // Wrap it with an SMS decorator
        Notifier smsNotifier = new SMSNotifierDecorator(notifier);
        smsNotifier.send("Your package has been shipped!");

        System.out.println("\n--- Sending with Email, SMS, and Slack ---");
        // Wrap the already-decorated notifier with another decorator for Slack
        Notifier slackAndSmsNotifier = new SlackNotifierDecorator(smsNotifier);
        slackAndSmsNotifier.send("Your package will arrive tomorrow!");

        System.out.println("\n--- End of Example ---");
    }
}
