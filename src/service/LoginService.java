package service;

import com.opensymphony.xwork2.ActionContext;
import entities.UserEntity;
import dao.UserDao;

import java.util.Map;

public class LoginService {
    public String login(String userId,String key){
        try {
            String password = KeyUtil.encrypt(key);
            UserDao userDao = new UserDao();
            UserEntity user = userDao.selectUser(userId);
            if (user.getUserId().equals("admin")){
                if (user.getPassword().equals(password)){
                    Map session = ActionContext.getContext().getSession();
                    session.put("admin",key);
                    return "adminLoginSuccess";
                }else {
                    return "error";
                }
            }else {
                if (user.getPassword().equals(password)){
                    return "studentLoginSuccess";
                }else {
                    return "error";
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }
}
