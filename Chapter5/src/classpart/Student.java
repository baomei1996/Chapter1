package classpart;
// class 대문자 시작
// 하나의 자바파일에 하나의 클래스를 두는 것이 원칙이나, 여러개의 클래스가 같이 있는 경우
// public 클래스는 단 하나이며, public 클래스와 파일의 이름은 동일해야 함
// 자바의 모든 코드는 class 내부에 위치

public class Student {
    int studentID;
    String studentName;
    int grade;
    String address;

    public void showStudentInfo () {
        System.out.println("학생이름 : "+studentName + ", "+ "주소 :" + address);
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName (String name) {
        studentName = name;
    }

}
