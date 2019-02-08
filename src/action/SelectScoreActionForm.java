package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.ScoreDao;
import dao.UserDao;
import entities.ScoreEntity;

public class SelectScoreActionForm extends ActionSupport {
    private String userId;
    private String userName;
    private String math = "0";
    private String chinese = "0";
    private String english = "0";
    private ScoreEntity score;

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

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String execute(){
        UserDao userDao = new UserDao();
        ScoreDao scoreDao = new ScoreDao();
        score = scoreDao.selectScore(userId);
        userName = userDao.selectUser(userId).getUserName();
        math = String.valueOf(score.getMath());
        chinese = String.valueOf(score.getChinese());
        english = String.valueOf(score.getEnglish());
        return SUCCESS;
    }
}
