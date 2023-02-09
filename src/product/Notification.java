package product;

import model.User;

public abstract class Notification {
    protected User user;

    public abstract void send(User user, String title, String message);

    public void read() {
        // Read notification
        // ... code to read notification
        System.out.println("Notification read by " + this.user.getUsername());
    }

}


