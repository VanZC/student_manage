package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import service.LoginService;

import java.util.Map;

public class LoginActionForm extends ActionSupport {
    private String userId;
    private String password;

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

    public String execute() throws Exception {
        LoginService login = new LoginService();
        if (login.login(userId,password).equals("error")){
            return login.login(userId,password);
        }else {
            Map session = ActionContext.getContext().getSession();
            session.put(userId,password);
            return login.login(userId,password);
        }
    }
}

