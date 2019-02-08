package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "score", schema = "student_manage", catalog = "")
public class ScoreEntity {
    private String userId;
    private int math;
    private int chinese;
    private int english;

    @Id
    @Column(name = "user_id", nullable = false, length = 20)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "math", nullable = false)
    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Basic
    @Column(name = "chinese", nullable = false)
    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    @Basic
    @Column(name = "english", nullable = false)
    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScoreEntity that = (ScoreEntity) o;
        return math == that.math &&
                chinese == that.chinese &&
                english == that.english &&
                Objects.equals(userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, math, chinese, english);
    }
}
