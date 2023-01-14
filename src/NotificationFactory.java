public class NotificationFactory {

    public Notification createNotification(NotificationType type) {

        if (type == NotificationType.EMAIL) {
            return new EmailNotification();
        } else if (type == NotificationType.SMS) {
            return new SMSNotification();
        } else if (type == NotificationType.PUSH) {
            return new PushNotification();
        } else {
            throw new IllegalArgumentException("Unknown Type " + type);
        }

    }

}