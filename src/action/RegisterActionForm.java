package action;

import com.opensymphony.xwork2.ActionSupport;
import service.RegisterService;

public class RegisterActionForm extends ActionSupport {
    private String userName;
    private String password;
    private String userId;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String execute() throws Exception {
        RegisterService register = new RegisterService();
        return register.register(userId,password,userName);
    }
}
