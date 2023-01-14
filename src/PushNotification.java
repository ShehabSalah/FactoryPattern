public class PushNotification implements Notification {

    // Send a push notification
    @Override
    public void send(User user, String title, String message) {
        // Send push notification
        // ... code to send push notification
        System.out.println("Push notification sent to " + user.getPushToken());
        System.out.println("Title: " + title);
        System.out.println("Message: " + message);
    }

}