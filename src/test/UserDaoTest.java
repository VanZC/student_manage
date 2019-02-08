package test;

import dao.UserDao;
import service.KeyUtil;
import service.RegisterService;

public class UserDaoTest {
    public static void main(String[] args){
        UserDao userDao = new UserDao();
        RegisterService registerService = new RegisterService();
        registerService.register("0000000005","0000000005","小孙");
        //System.out.println(KeyUtil.encrypt("123456"));
        //userDao.createUser("admin","管理员","123456");
        //System.out.println(userDao.selectUser("111111110"));
    }
}
