package product.push;

import model.User;
import product.Notification;

public class OneSignalPushNotification extends Notification {

    @Override
    public void send(User user, String title, String message) {
        // Send push notification
        // ... code to send push notification
        this.user = user;
        System.out.println("OneSignal push notification sent to " + user.getPushToken());
        System.out.println("Title: " + title);
        System.out.println("Message: " + message);
    }
}
