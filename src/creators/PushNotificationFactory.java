package creators;

import enums.NotificationType;
import product.Notification;
import product.push.FirebasePushNotification;
import product.push.OneSignalPushNotification;

public class PushNotificationFactory extends NotificationFactory {

    @Override
    public Notification createNotification(NotificationType type) {
        if (type == NotificationType.FIREBASE) {
            return new FirebasePushNotification();
        } else if (type == NotificationType.ONESIGNAL) {
            return new OneSignalPushNotification();
        } else {
            System.out.printf("Invalid notification type (%s) for Push Notification\n", type);
            return null;
        }
    }
}
