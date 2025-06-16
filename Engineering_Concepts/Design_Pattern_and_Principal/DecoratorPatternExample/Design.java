
public class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Sending Email with message: " + message);
    }
}


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



public class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSMS(message);
    }

    private void sendSMS(String message) {
        System.out.println("Sending SMS with message: " + message);
    }
}



public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSlack(message);
    }

    private void sendSlack(String message) {
        System.out.println("Sending Slack message: " + message);
    }
}



public class Design {

    public static void main(String[] args) {
        System.out.println("--- Decorator Pattern Example ---");


        Notifier notifier = new EmailNotifier();

        System.out.println("\n--- Sending with Email and SMS ---");

        Notifier smsNotifier = new SMSNotifierDecorator(notifier);
        smsNotifier.send("Your package has been shipped!");

        System.out.println("\n--- Sending with Email, SMS, and Slack ---");

        Notifier slackAndSmsNotifier = new SlackNotifierDecorator(smsNotifier);
        slackAndSmsNotifier.send("Your package will arrive tomorrow!");

        System.out.println("\n--- End of Example ---");
    }
}
