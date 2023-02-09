package creators;

import enums.NotificationType;
import model.User;
import product.Notification;

public abstract class NotificationFactory {

    public abstract Notification createNotification(NotificationType type);

}