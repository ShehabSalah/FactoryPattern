package product.sms;

import model.User;
import product.Notification;

public class FirebaseSMSNotification extends Notification {

    @Override
    public void send(User user, String title, String message) {
        // Send SMS
        // ... code to send SMS
        this.user = user;
        System.out.println("Firebase SMS sent to " + user.getMobile());
        System.out.println("Subject: " + title);
        System.out.println("Body: " + message);
    }
}
