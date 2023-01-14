public class User {
    private String username;
    private String email;
    private String mobile;
    private String pushToken;

    public User(String username, String email, String mobile, String pushToken) {
        this.username = username;
        this.email = email;
        this.mobile = mobile;
        this.pushToken = pushToken;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPushToken() {
        return pushToken;
    }

    public void setPushToken(String pushToken) {
        this.pushToken = pushToken;
    }
}




