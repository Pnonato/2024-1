package IFSP.DEOO.Model;

public class User {
    
    int userId;
    String userName, userEmail, usserPassword;
    
    
    public User(String userName, String userEmail, String usserPassword) {
        this.userId = 0;
        this.userName = userName;
        this.userEmail = userEmail;
        this.usserPassword = usserPassword;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getUsserPassword() {
        return usserPassword;
    }
    public void setUsserPassword(String usserPassword) {
        this.usserPassword = usserPassword;
    }

    
}
