package creators;

import enums.NotificationType;
import product.Notification;
import product.sms.FirebaseSMSNotification;
import product.sms.TwilioSMSNotification;

public class SMSNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotification(NotificationType type) {
        if (type == NotificationType.TWILIO) {
            return new TwilioSMSNotification();
        } else if (type == NotificationType.FIREBASE) {
            return new FirebaseSMSNotification();
        } else {
            System.out.printf("Invalid notification type (%s) for SMS\n", type);
            return null;
        }
    }

}
