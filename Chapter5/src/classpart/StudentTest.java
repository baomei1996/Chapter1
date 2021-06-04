package classpart;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("Jessica");
        studentLee.address = "서울시 서초구 서초동";
        studentLee.showStudentInfo();
    }
}

//package = 소스의 묶음/ 소스의 계층구조를 보여줌/ ++ 소스 관리 유지보수의 중요한 역할을 함
