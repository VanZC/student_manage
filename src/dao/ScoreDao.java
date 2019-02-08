package dao;

import entities.ScoreEntity;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Iterator;
import java.util.List;

public class ScoreDao {
    public boolean addScore(String userId, String math, String english, String chinese) {
        Session session = HibernateSessionFactory.getSession();
        Transaction ts = null;
        try {
            ts = session.beginTransaction();
            ScoreEntity score = new ScoreEntity();
            score.setUserId(userId);
            score.setMath(Integer.valueOf(math));
            score.setEnglish(Integer.valueOf(english));
            score.setChinese(Integer.valueOf(chinese));
            session.save(score);
            System.out.println(score.getChinese());
            ts.commit();
            return true;
        } catch (HibernateException e) {
            if (ts != null) ts.rollback();
            e.printStackTrace();
            return false;
        } finally {
            session.close();
        }
    }

    public List selectAll() {
        Session session = HibernateSessionFactory.getSession();
        Transaction ts = null;

        try {
            ts = session.beginTransaction();
            Query query = session.createQuery("FROM ScoreEntity ORDER BY userId");
            List scoreList = query.list();
            ts.commit();
            return scoreList;
        } catch (HibernateException e) {
            if (ts != null) ts.rollback();
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }

    public ScoreEntity selectScore(String userId) {
        Session session = HibernateSessionFactory.getSession();
        Transaction ts = null;
        try {
            ts = session.beginTransaction();
            ScoreEntity score = new ScoreEntity();
            score.setUserId(userId);
            List scoreList =
                    session.createQuery("FROM ScoreEntity score WHERE score.userId=:userId")
                            .setProperties(score).list();
            for(Iterator iterator = scoreList.iterator();iterator.hasNext();){
                score = (ScoreEntity) iterator.next();
            }
            return score;
        } catch (HibernateException e) {
            if (ts != null) ts.rollback();
            e.printStackTrace();
            return null;
        } finally {
            session.close();
        }
    }
}
