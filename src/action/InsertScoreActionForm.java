package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.ScoreDao;

public class InsertScoreActionForm extends ActionSupport {
    private String userId;
    private String math;
    private String chinese;
    private String english;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
        try {
            ScoreDao scoreDao = new ScoreDao();
            if (scoreDao.addScore(userId,math,english,chinese)){
                return SUCCESS;
            }else {
                return ERROR;
            }
        }catch (Exception e){
            e.printStackTrace();
            return ERROR;
        }
    }
}
