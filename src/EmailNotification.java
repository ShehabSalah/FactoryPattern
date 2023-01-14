public class EmailNotification implements Notification {

    @Override
    public void send(User user, String title, String message) {
        // Send email
        // ... code to send email
        System.out.println("Email sent to " + user.getEmail());
        System.out.println("Subject: " + title);
        System.out.println("Body: " + message);
    }

}