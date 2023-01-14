public class Main {

    public static void main(String[] args) {

        // initialize user
        User user = new User("John", "test@example.com", "555-555-5555", "1234567890");

        // Send an email
        sendNotification(user, NotificationType.PUSH,"Test title", "Test message");
    }

    // Endpoint to send notification
    public static void sendNotification(User user, NotificationType notificationType, String title, String message) {
        // ... code to check if the user exists and is active
        // ... code to check if the title is valid
        // ... code to check if the message is valid

        // Send Notification
        NotificationFactory factory = new NotificationFactory();
        Notification notification = factory.createNotification(notificationType);

        notification.send(user, title, message);
    }

}