public class SMSNotification implements Notification {

    // Send an SMS
    @Override
    public void send(User user, String title, String message) {
        // Send SMS
        // ... code to send SMS
        System.out.println("SMS sent to " + user.getMobile());
        System.out.println("Title: " + title);
        System.out.println("Message: " + message);
    }

}