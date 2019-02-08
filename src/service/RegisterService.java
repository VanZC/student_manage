package service;

import dao.UserDao;

public class RegisterService {
    public String register(String userId, String key, String userName) {
        try{
            String password = KeyUtil.encrypt(key);
            UserDao userDao = new UserDao();
            if (userDao.createUser(userId,userName,password)){
                return "registerSuccess";
            }else {
                return "error";
            }
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }
}
