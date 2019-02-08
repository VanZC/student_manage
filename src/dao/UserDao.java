package dao;

import entities.UserEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Iterator;
import java.util.List;

public class UserDao {

    public boolean createUser(String userId,String userName,String password){
        Session session = HibernateSessionFactory.getSession();
        Transaction ts = null;
        try {
            ts = session.beginTransaction();
            UserEntity user = new UserEntity();
            user.setPassword(password);
            user.setUserId(userId);
            user.setUserName(userName);
            session.save(user);
            ts.commit();
            return true;
        }catch (HibernateException e){
            if (ts!=null) ts.rollback();
            e.printStackTrace();
            return false;
        }finally {
            session.close();
        }
    }

    public UserEntity selectUser(String userId){
        Session session = HibernateSessionFactory.getSession();
        Transaction ts = null;
        try{
            ts = session.beginTransaction();
            UserEntity user = new UserEntity();
            user.setUserId(userId);
            List users =
                    session.createQuery("FROM UserEntity user WHERE user.userId=:userId")
                            .setProperties(user).list();
            for (Iterator iterator = users.iterator(); iterator.hasNext();){
                user = (UserEntity) iterator.next();
            }
            ts.commit();
            return user;
        }catch (HibernateException e){
            if (ts!=null) ts.rollback();
            e.printStackTrace();
            return null;
        }finally {
            session.close();
        }
    }

}
