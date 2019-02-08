package action;

import com.opensymphony.xwork2.ActionSupport;
import dao.ScoreDao;
import dao.UserDao;
import entities.ScoreEntity;
import entities.Student;
import entities.UserEntity;

import java.util.LinkedList;
import java.util.List;

public class SelectAllActionForm extends ActionSupport {
    private int pageSize = 5;
    private int pageNow = 1;
    private List<Student> studentList = new LinkedList();

    public List getStudentList() {
        return studentList;
    }

    public void setStudentList(List studentList) {
        this.studentList = studentList;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getPageNow() {
        return pageNow;
    }

    public String execute() throws Exception {
        ScoreDao scoreDao = new ScoreDao();
        UserDao userDao = new UserDao();
        List<ScoreEntity> scoreList = scoreDao.selectAll();
        for (int i = 0; i <= scoreList.size() - 1; i++) {
            Student student = new Student();
            ScoreEntity score = scoreList.get(i);
            UserEntity user = userDao.selectUser(String.valueOf(score.getUserId()));
            student.setId(user.getUserId());
            student.setName(user.getUserName());
            student.setChinese(String.valueOf(score.getChinese()));
            student.setEnglish(String.valueOf(score.getEnglish()));
            student.setMath(String.valueOf(score.getMath()));
            studentList.add(student);
        }
        return SUCCESS;

    }

}
