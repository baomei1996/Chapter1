package reference;

public class Subject {

    String subjectName;
    int score;

    public void setSubjectName(String name) {
        subjectName = name;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}


//정보은닉
// private 접근제어자
// 클래스의  외부에서

