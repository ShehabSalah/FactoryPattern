package creators;

import enums.NotificationType;
import product.Notification;
import product.email.FirebaseEmailNotification;
import product.email.OneSignalEmailNotification;
import product.email.SendGridEmailNotification;
import product.email.TwilioEmailNotification;

public class EmailNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotification(NotificationType type) {
        if (type == NotificationType.SENDGRID) {
            return new SendGridEmailNotification();
        } else if (type == NotificationType.FIREBASE) {
            return new FirebaseEmailNotification();
        } else if (type == NotificationType.ONESIGNAL) {
            return new OneSignalEmailNotification();
        } else if (type == NotificationType.TWILIO) {
            return new TwilioEmailNotification();
        } else {
            System.out.printf("Invalid notification type (%s) for Email\n", type);
            return null;
        }
    }
}
