package product.email;

import model.User;
import product.Notification;

public class SendGridEmailNotification extends Notification {
    @Override
    public void send(User user, String title, String message) {
        // Send email
        // ... code to send email
        this.user = user;
        System.out.println("SendGrid Email sent to " + user.getEmail());
        System.out.println("Subject: " + title);
        System.out.println("Body: " + message);
    }
}
